public class SimulacaoCaixaSupermercado {

    // Entradas que serão simuladas
    private int numeroCaixas; // Quantidade de caixas que serão utilizados nas simulação
    private int mediaAtendimentos; // Qunatidade de clientes que serão atendidos na simulação (N)

    // Entradas "reais"
    private double mediaTempoAtendimentoPorCliente; // Tempo médio de atendimento por cliente (µ)
    private double desvioPadraoTempoAtendimentoPorCliente; // Variação média entre os itendimentos (sigma)

    private static final double TEMPO_MINIMO_ATENDIMENTO = 0.1; // Limite inferior para truncagem (epsilon)

    private final java.util.Random rng = new java.util.Random(42); // Valor para gerar números aleatórios

    public void setNumeroCaixas(int n) { this.numeroCaixas = n; }
    public void setMediaAtendimentos(int n) { this.mediaAtendimentos = n; }
    public void setMediaTempoAtendimentoPorCliente(double mu) { this.mediaTempoAtendimentoPorCliente = mu; }
    public void setDesvioPadraoTempoAtendimentoPorCliente(double sigma) { this.desvioPadraoTempoAtendimentoPorCliente = sigma; }

    // max(epsilon, µ + sigma * Zi)
    private double tempoAtendimentoNormalTruncado() {
        double z = rng.nextGaussian(); // Número retirado da distribuição normal (Zi)
        double s = mediaTempoAtendimentoPorCliente +
        desvioPadraoTempoAtendimentoPorCliente * z;
        return (s < TEMPO_MINIMO_ATENDIMENTO) ? TEMPO_MINIMO_ATENDIMENTO : s;
    }

    // S médio = somatório / número de simulações de caixa
    // Retorna o tempo médio que cada cliente vai gastar no total (fila + atendimento)
    public double simular() {
        double medias = 0.0;
        int clientesInteiros = mediaAtendimentos / numeroCaixas;
        int restoClientes = mediaAtendimentos % numeroCaixas;
        for (int i = 0; i < numeroCaixas; i++) {
            if (i == mediaAtendimentos) break;
            if (i < restoClientes) {
                medias += SimularCaixa(clientesInteiros + 1);
            } else {
                medias += SimularCaixa(clientesInteiros);
            }
        }
        return medias / mediaAtendimentos;
    }

    // Método para calcular a média gasta de tempo dos clientes em um caixa
    public double SimularCaixa(int numeroClientes) {
        double soma = 0.0;
        double total = 0.0;
        for (int i = 0; i < numeroClientes; i++) {
            soma += tempoAtendimentoNormalTruncado();
            total += soma;
        }
        return total;
    }
}
