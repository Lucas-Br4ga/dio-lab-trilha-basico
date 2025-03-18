import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public String agencia = "";
    public String nomeCliente = "";
    public double saldo = 0.0;
    public int numeroDaConta = 0;
    public static void main(String[] args) {
        try {
           Scanner input = new Scanner(System.in);
            ContaTerminal conta = new ContaTerminal();
            conta.NumeroConta(input);
            conta.Agencia(input);
            conta.NomeCliente(input);
            conta.SaldoCliente(input);
            System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numeroDaConta + " e seu saldo "+ conta.saldo +" já está disponível para saque.");
        }catch (InputMismatchException e){

        }
    }
    public int NumeroConta(Scanner scanner){
        try{
            System.out.println("Por favor,digite o numero de da Agencia:");
            this.numeroDaConta = scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("ERRO: Tipo de dado incorreto. Por favor tente novamente.");
            scanner.nextLine();
            this.NumeroConta(scanner);
        }
        return this.numeroDaConta;
    }
    public String Agencia(Scanner scanner){
        try{
            System.out.println("Por favor,digite a agencia:");
            this.agencia = scanner.next();
        }catch(InputMismatchException e){
            System.out.println("ERRO: Tipo de dado incorreto. Por favor tente novamente.");
            this.Agencia(scanner);
        }
        return this.agencia;
    }
    public String NomeCliente(Scanner scanner){
        try{
            System.out.println("Por favor,digite o nome do cliente:");
            this.nomeCliente = scanner.next();
        }catch(InputMismatchException e){
            System.out.println("ERRO: Tipo de dado incorreto. Por favor tente novamente.");
            this.NomeCliente(scanner);
        }
        return this.nomeCliente;
    }
    public double SaldoCliente(Scanner scanner){
        try{
            System.out.println("Por favor,digite o saldo do cliente " + this.nomeCliente+":");
            this.saldo = scanner.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("ERRO: Tipo de dado incorreto. Por favor tente novamente.");
            scanner.nextLine();
            this.SaldoCliente(scanner);
        }
        return this.saldo;
    }
}