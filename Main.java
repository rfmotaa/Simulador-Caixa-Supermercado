import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String... args) {

        // Número de situações simuladas
        final int NUMERO_SIMULACOES = 10000;
        final List<Double> mediasAtendimento = new ArrayList<>();

        // Array para armazenar o de cada simulação
        SimulacaoCaixaSupermercado simulador = new SimulacaoCaixaSupermercado();

        // Definindo as entradas para a simulação
        simulador.setNumeroCaixas(7);
        simulador.setMediaAtendimentos(6);
        simulador.setMediaTempoAtendimentoPorCliente(5.00);
        simulador.setDesvioPadraoTempoAtendimentoPorCliente(0.50);
        for (int i = 0; i < NUMERO_SIMULACOES; i++) {
            double mediaAtendimento = simulador.simular();
            mediasAtendimento.add(mediaAtendimento);
        }

        double media = media(mediasAtendimento);
        double dp = desvioPadrao(mediasAtendimento, media);

        System.out.printf("Média dos tempos de atendimento (%.0f simulações): %.3fmin%n", (double) NUMERO_SIMULACOES, media);
        System.out.printf("Desvio-padro das médias: %.3fmin%n", dp);
    }

    private static double media(List<Double> xs) {
        double s = 0.0;
        for (double x : xs) s += x;
        return s / xs.size();
    }

    private static double desvioPadrao(List<Double> xs, double m) {
        double s2 = 0.0;
        for (double x : xs) {
            double d = x - m;
            s2 += d * d;
        }
        return Math.sqrt(s2 / (xs.size() - 1));
    }
}