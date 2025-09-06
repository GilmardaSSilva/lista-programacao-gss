import java.util.Scanner;

public class Atividade43 {

        public static void main(String[] args) {

            int[] numeros = new int[8];
            Scanner sc = new Scanner(System.in);


            System.out.println("Digite 8 números inteiros:");
            for (int i = 0; i < 8; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }


            int maior = numeros[0];
            int menor = numeros[0];

            for (int i = 1; i < 8; i++) {
                if (numeros[i] > maior) {
                    maior = numeros[i];
                }
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }


            System.out.println("\nO maior número digitado é: " + maior);
            System.out.println("O menor número digitado é: " + menor);

            sc.close();
        }
    }
