import java.util.Scanner;

public class Atividade47 {

    public class DiagonalPrincipal {

        public static void main(String[] args) {

            int[][] matriz = new int[3][3];
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite os números inteiros para a matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = sc.nextInt();
                }
            }


            System.out.println("\nMatriz preenchida:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }


            System.out.println("\nElementos da diagonal principal:");
            for (int i = 0; i < 3; i++) {
                System.out.println(matriz[i][i]);
            }

            sc.close();
        }
    }

}
