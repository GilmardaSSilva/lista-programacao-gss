import java.util.Scanner;

public class Atividade48 {
        public static void main(String[] args) {

            int[][] matriz = new int[4][4];
            int maiorValor = 0;
            int linhaMaior = 0;
            int colunaMaior = 0;
            Scanner sc = new Scanner(System.in);


            System.out.println("Digite os números inteiros para a matriz 4x4:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = sc.nextInt();


                    if (i == 0 && j == 0) {
                        maiorValor = matriz[i][j];
                    }


                    if (matriz[i][j] > maiorValor) {
                        maiorValor = matriz[i][j];
                        linhaMaior = i;
                        colunaMaior = j;
                    }
                }
            }


        }
    }

