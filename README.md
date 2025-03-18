# Projeto Conta Terminal

## Descrição
Projeto desenvolvido como parte do desafio de **Sintaxe Java** do **Bradesco - Java Cloud Native Bootcamp** disponibilizado pela **Digital Innovation One (DIO)**. Este projeto simula a abertura de uma conta bancária via terminal, solicitando informações ao usuário como número da conta, agência, nome do cliente e saldo, e exibindo uma mensagem de confirmação ao final.

## Funcionalidades
- Coleta de dados do usuário via terminal
- Validação de entradas para evitar erros
- Exibição de mensagem personalizada de confirmação
- Tratamento de exceções para garantir a integridade dos dados

## Tecnologias Utilizadas
- Java
- Scanner para entrada de dados
- Tratamento de exceções com try-catch

## Como Executar
1. Certifique-se de ter o JDK instalado em sua máquina
2. Clone este repositório
3. Navegue até o diretório do projeto
4. Compile o código fonte:
   ```
   javac ContaTerminal.java
   ```
5. Execute o programa:
   ```
   java ContaTerminal
   ```

## Fluxo do Programa
1. O programa solicita o número da conta
2. Em seguida, pede a agência
3. Depois, solicita o nome do cliente
4. Por fim, pede o saldo inicial
5. Exibe uma mensagem de confirmação com todos os dados informados

## Especificações do Desafio
Este projeto atende aos requisitos do desafio de Sintaxe Java do bootcamp, que solicitava a criação de uma aplicação que simula a abertura de contas através de terminal, conforme as especificações disponíveis em: [Desafio DIO](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe)

## Exemplo de Uso
```
Por favor, digite o numero de da Agencia:
1021
Por favor, digite a agencia:
067-8
Por favor, digite o nome do cliente:
João
Por favor, digite o saldo do cliente João:
237.48
Olá João, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```

## Autor
Lucas Rodrigues Braga
