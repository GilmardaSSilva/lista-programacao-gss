import java.util.Scanner;

public class Atividade46 {
        public static void main(String[] args) {

            int[][] matriz = new int[2][2];
            int soma = 0;
            Scanner sc = new Scanner(System.in);


            System.out.println("Digite os números inteiros para a matriz 2x2:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = sc.nextInt();
                    soma += matriz[i][j];
                }
            }


            System.out.println("\nMatriz preenchida:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("\nA soma de todos os elementos da matriz é: " + soma);

            sc.close();
        }
    }

