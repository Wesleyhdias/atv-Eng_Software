import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o Tamanho da Sequencia de Fibonacci que você quer? ");
        int n = sc.nextInt();

        System.out.println();

        System.out.println("Agora, escolha os números iniciais, primeiro o numero a: ");
        int a = sc.nextInt();
        
        System.out.println("Agora, o número b: ");
        int b = sc.nextInt();

        System.out.println("Sequência de Fibonacci com 10 números:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
