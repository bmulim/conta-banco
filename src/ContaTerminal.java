import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agencia:");
        int numero = scanner.nextInt();
        scanner.nextLine();  

        System.out.println("Por favor, digite o número da Conta:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        String mensagem = "Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência e " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já esta disponivel para saque.";

        System.out.println(mensagem);
        
        scanner.close();
    }
}

