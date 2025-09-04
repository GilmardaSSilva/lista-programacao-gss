public class Atividade36
import java.util.Scanner;

public class FatorialWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        long fatorial = 1;
        int contador = 1;

        if (numero < 0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
        } else {

            while (contador <= numero) {
                fatorial = fatorial * contador;
                contador++;
            }
            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }

        scanner.close();
    }
}


