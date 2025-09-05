# Simulador de Caixas de Supermercado

Este repositório está destinado a armazenar o código que se resolve a atividade proposta.

## 1) Execute a simulação para µ = 5,0, σ = 0,5, N = 100 clientes e 1000 rodadas. Registre a média e o desvio-padrão obtidos.

Com Número de caixas = 1
<img width="1820" height="886" alt="image" src="https://github.com/user-attachments/assets/21a930be-651c-4244-84d2-974d322bdfb4" />
Média de tempo para atendimento do cliente = 252,499 minutos
Desvio padrão de tempo para atendimento do cliente = 2,9 minutos

Com Número de caixas = 100 (Para igualar o número de clientes)
<img width="1817" height="877" alt="image" src="https://github.com/user-attachments/assets/d2b74f66-b567-4803-adfe-034e2341abbe" />
Média de tempo para atendimento do cliente = 5 minutos
Desvio padrão de tempo para atendimento do cliente = 0,49 minutos

## 2) Varie o número de caixas de 1 para 2 e 3. Compare os resultados obtidos e discuta qualitativamente como mais caixas podem reduzir o tempo médio de atendimento.

Com Número de caixas = 1
<img width="1820" height="886" alt="image" src="https://github.com/user-attachments/assets/21a930be-651c-4244-84d2-974d322bdfb4" />
Média de tempo para atendimento do cliente = 252,499 minutos
Desvio padrão de tempo para atendimento do cliente = 2,9 minutos

Com Número de caixas = 2
<img width="1822" height="879" alt="image" src="https://github.com/user-attachments/assets/acd35af7-d060-4071-a577-9e113e772402" />
Média de tempo para atendimento do cliente = 127,498 minutos
Desvio padrão de tempo para atendimento do cliente = 1,46 minutos

Com Número de caixas = 3
<img width="1821" height="884" alt="image" src="https://github.com/user-attachments/assets/7e8654de-d332-45e6-9046-c18976e8472a" />
Média de tempo para atendimento do cliente = 85,854 minutos
Desvio padrão de tempo para atendimento do cliente = 0,974 minutos

O número de caixas impacta diretamente o tempo que o cliente espera na fila. É importante ressaltar que o tempo médio de atendimento individual (µ) não muda, mas sim o tempo médio que cada cliente passa 
no sistema, pois ao seu atendimento somam-se os tempos de atendimento dos clientes posteriores. A partir disso, é possível calcular a média de tempo gasto por cliente. A quantidade de caixas funciona 
como um paralelismo no processo, já que divide a fila em partes; assim, com filas menores, o tempo médio que cada cliente passa na fila também diminui.

## 3) Varie σ (ex.: 0,25, 1,0, 2,0) e observe como a variabilidade impacta os resultados médios.

> Usando os dados: µ = 5, N = 100 clientes, Número de caixas = 25 e 1000 rodadas

σ = 0,25
<img width="1822" height="881" alt="image" src="https://github.com/user-attachments/assets/11863138-380e-48a4-bbb3-7ca8f417be2e" />
σ = 1
<img width="1822" height="888" alt="image" src="https://github.com/user-attachments/assets/65febc5f-28e0-4f50-ad08-927826ae2b5c" />
σ = 2
<img width="1816" height="876" alt="image" src="https://github.com/user-attachments/assets/33896466-1ac2-489c-83cf-c898c93a6e3c" />

## 4) Escreva um parágrafo explicando por que este simulador é considerado estocástico e como isso representa situações reais.

O simulador pode ser considerado estocástico, pois suas saídas sempre variam de acordo com dados definidos de maneira aleatória (ou pseudoaleatória, neste caso), mesmo quando são aplicados valores 
de média e desvio-padrão. Ele reflete situações reais, já que o atendimento em um mercado não é totalmente previsível, sendo impossível calcular de maneira exata apenas com valores fixos de entrada. 
A aleatoriedade imposta no código serve para representar os diversos fatores que podem gerar variações no tempo médio de atendimento na vida real.
