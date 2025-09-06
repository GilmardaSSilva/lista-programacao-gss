import java.util.Scanner;

public class Atividade50 {
        public static void main(String[] args) {

            int[][] matrizOriginal = new int[3][3];
            int[][] matrizQuadrada = new int[3][3];
            Scanner sc = new Scanner(System.in);


            System.out.println("Digite os números inteiros para a matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matrizOriginal[i][j] = sc.nextInt();
                }
            }


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrizQuadrada[i][j] = matrizOriginal[i][j] * matrizOriginal[i][j];
                }
            }


            System.out.println("\nMatriz Original:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrizOriginal[i][j] + "\t");
                }
                System.out.println();
            }


            System.out.println("\nMatriz com os valores ao quadrado:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrizQuadrada[i][j] + "\t");
                }
                System.out.println();
            }

            sc.close();
        }
}