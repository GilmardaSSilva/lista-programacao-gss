import java.util.Scanner;
public class Atividade57 {
        public static void verificarParOuImpar(int numero) {
            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par.");
            } else {
                System.out.println("O número " + numero + " é ímpar.");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");
            int numeroDigitado = sc.nextInt();


            verificarParOuImpar(numeroDigitado);

            sc.close();
        }
    }

