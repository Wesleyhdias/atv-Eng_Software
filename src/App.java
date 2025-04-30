public class App {

    public static void main(String[] args) throws Exception {

        int n = 10; // número de elementos na sequência trocar para o que o usuário quiser
        int a = 1, b = 1; // também colocar para o usuário escolher os números iniciais

        System.out.println("Sequência de Fibonacci com 10 números:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
