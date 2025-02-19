import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception
    {
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldoConta;

        //Exibir as mensagens para nosso usuario
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Olá! Como vai?");
        
        System.out.println("Por favor, digite o numero da sua agencia");
        agencia = sc.next();
        System.out.println();

        System.out.println("Por favor, digite o numero da sua conta");
        numeroConta = sc.nextInt();
        System.out.println();

        System.out.println("Por favor, digite o seu nome");
        sc.nextLine();
        nomeCliente = sc.nextLine();
        System.out.println();

        System.out.println("Por favor, digite o saldo da sua conta");
        saldoConta = sc.nextInt();
        System.out.println();

        //Exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroConta +" e seu saldo " + saldoConta +" já está disponível para saque");

        sc.close();
    }
}