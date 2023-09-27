import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int conta = Integer.parseInt(terminal.nextLine());

        System.out.println("Digite o número da agência: ");
        String agencia = terminal.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = terminal.nextLine();

        System.out.println("Digite o saldo da conta: ");
        Double saldo = Double.parseDouble(terminal.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é" + agencia +
                            ", conta " + conta + " e seu saldo " + saldo + "já está disponível para saque");

    }
}