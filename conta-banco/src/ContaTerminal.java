import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite o seu nome:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o valor do primeiro depósito:");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em\nnosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo\n R$" + saldo + " já está disponível para saque");

        scanner.close();
    }
}
