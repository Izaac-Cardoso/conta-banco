
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor, informe o seu nome !");
        String nomeCliente = input.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = input.next();

        System.out.println("Por favor, insira o número da conta !");
        int numeroConta = input.nextInt();

        System.out.println("Por favor, informe o saldo !");
        double saldo = input.nextDouble();
        input.close();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar um conta em nosso banco,");
        System.out.print("sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
