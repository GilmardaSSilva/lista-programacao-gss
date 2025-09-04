public class Atividade24
import java.util.Scanner;

public class VerificaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        double quadrado = numero * numero;


        if (quadrado > 100) {
            System.out.println("15");
        } else {
            System.out.println("Quadrado pequeno ou igual a 100");
        }

        scanner.close();
    }
}


