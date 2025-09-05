import java.util.Scanner;
public class Atividade39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequência de Fibonacci que você quer ver: ");
        int n = scanner.nextInt();

        int termo1 = 0;
        int termo2 = 1;

        System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são:");

        for (int i = 0; i < n; i++) {
            System.out.print(termo1 + " ");

            int proximoTermo = termo1 + termo2;
            termo1 = termo2;
            termo2 = proximoTermo;
        }

        System.out.println();
        scanner.close();
    }
}

