import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int agency = scanner.nextInt();

        System.out.println("Por favor, digite o número da Conta !");
        int account = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome !");
        String name = scanner.next();

        System.out.println("Por favor, digite o seu saldo em conta !");
        double balance = scanner.nextDouble();

        String message = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %.2f já está disponível para saque", name, agency, account, balance);
        System.out.println(message);
    }
}