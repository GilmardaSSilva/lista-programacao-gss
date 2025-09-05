import java.util.Scanner;
public class Atividade34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int contador = 0;

        System.out.println("Números pares de 0 até " + numero + ":");


        while (contador <= numero) {

            if (contador % 2 == 0) {
                System.out.println(contador);
            }

            contador++;
        }

        scanner.close();
    }
}

