## Conversor de Moedas

Este projeto Java implementa um conversor de moedas simples via linha de comando, utilizando a API ExchangeRate-API para obter taxas de câmbio atualizadas.

### Funcionalidades

*   Converte entre as 6 moedas mais negociadas globalmente: USD, EUR, BRL, JPY, GBP, CHF.
*   Interface amigável via menu no console para selecionar a conversão desejada.
*   Utiliza a API ExchangeRate-API para garantir taxas de câmbio precisas.
*   Tratamento de erros básico para entradas inválidas do usuário.

### Dificuldades Encontradas

*   **Integração com a API ExchangeRate-API:** A documentação da API apresentou algumas inconsistências, exigindo testes e depuração adicionais para garantir a correta integração e manipulação das respostas JSON.
*   **Gerenciamento de Exceções:** Implementar um tratamento de erros para diferentes cenários, como falha na conexão com a API ou entrada inválida do usuário, foi crucial para garantir a robustez da aplicação.

### Usabilidade

1.  **Requisitos:** Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.
2.  **Compilação:** Compile o projeto utilizando o comando `javac` na pasta raiz do projeto.
3.  **Execução:** Execute a classe `Principal` para iniciar o conversor de moedas.

### Exemplo de Uso

```
***********************************************
  **** BEM VINDO AO CONVERSOR DE MOEDAS ****
***********************************************
Escolha uma das opções abaixo:

[1] USD => BRL (Dólar para Real)
[2] BRL => USD (Real para Dólar)
[3] USD => EUR (Dólar para Euro)
...
[7] Sair

Sua resposta: 1
Paridade escolhida: USD => BRL
Digite o valor de USD para a conversão: 100
100,00 USD Corresponde a: 570,69 BRL (Taxa de câmbio: 5,706900)
```

### Melhorias Futuras

*   Implementar uma interface gráfica para o usuário (GUI).
*   Expandir para suportar mais moedas.
*   Adicionar funcionalidade de histórico de conversões.
*   Aprimorar o tratamento de erros para fornecer mensagens mais informativas.

### Conclusão

Este projeto demonstra os fundamentos da programação orientada a objetos em Java, consumo de APIs REST e manipulação de JSON. Apesar dos desafios enfrentados, o resultado é um conversor de moedas funcional que pode servir como base para projetos mais complexos.
