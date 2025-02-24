import java.util.Scanner;

public class Contador
{
    public static void main(String[] args) throws ParametrosInvalidosException
  {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = sc.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = sc.nextInt();

        contar(parametroUm, parametroDois);

        sc.close();
    }
  
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException
    {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int i=1; i<=contagem; i++)
        {
            System.out.println("Imprimindo o número " + i);
        }
    }
}