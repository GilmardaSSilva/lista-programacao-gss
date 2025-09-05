import java.util.Scanner;
public class Atividade40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        double media;

        System.out.println("Digite 5 números inteiros:");


        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }


        media = (double) soma / 5;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média aritmética é: " + media);

        scanner.close();
    }
}


