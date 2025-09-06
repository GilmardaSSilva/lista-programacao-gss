import java.util.Scanner;
public class Attividade42 {
    public static void main(String[] args) {

            int[] numeros = new int[10];
            Scanner sc = new Scanner(System.in);


            System.out.println("Digite 10 números inteiros:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }

            System.out.println("\nNúmeros pares digitados:");

            for (int i = 0; i < 10; i++) {
                if (numeros[i] % 2 == 0) {
                    System.out.println(numeros[i]);
                }
            }

            sc.close();
        }
    }


