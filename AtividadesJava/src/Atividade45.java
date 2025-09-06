import java.util.Scanner;

public class Atividade45 {
        public static void main(String[] args) {

            int[] vetor1 = new int[5];
            int[] vetor2 = new int[5];
            int[] vetor3 = new int[5];
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite 5 números inteiros para o primeiro vetor:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Vetor 1, posição " + (i + 1) + ": ");
                vetor1[i] = sc.nextInt();
            }


            System.out.println("\nDigite 5 números inteiros para o segundo vetor:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Vetor 2, posição " + (i + 1) + ": ");
                vetor2[i] = sc.nextInt();
            }


            for (int i = 0; i < 5; i++) {
                vetor3[i] = vetor1[i] + vetor2[i];
            }


            System.out.println("\nO terceiro vetor, com a soma dos elementos, é:");
            for (int i = 0; i < 5; i++) {
                System.out.println("Posição " + (i + 1) + ": " + vetor3[i]);
            }

            sc.close();
        }
    }
