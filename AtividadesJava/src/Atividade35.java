puimport java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma sequência de números inteiros. Digite -1 para terminar.");

        int maiorNumero = Integer.MIN_VALUE;
        int numero;


        while ((numero = scanner.nextInt()) != -1) {

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }


        if (maiorNumero == Integer.MIN_VALUE) {
            System.out.println("Nenhum número foi digitado.");
        } else {
            System.out.println("O maior número digitado foi: " + maiorNumero);
        }

        scanner.close();
    }
}



