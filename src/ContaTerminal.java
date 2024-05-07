import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, coloque o número da conta:");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, coloque sua agência:");
        agencia = sc.nextLine();

        System.out.println("Qual o seu nome?");
        nomeCliente = sc.nextLine();

        System.out.println("Qual seu saldo?");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + " conta "+ numero+" e seu saldo é "+saldo+" já está disponível para saque!");

        sc.close();

    }

}
