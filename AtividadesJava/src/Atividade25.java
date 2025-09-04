public class Atividade25
import java.util.Scanner;

public class ImpostoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário: R$ ");
        double salario = scanner.nextDouble();

        if (salario > 3000) {
            System.out.println("Você paga imposto");
        } else {
            System.out.println("Isento");
        }

        scanner.close();
    }
}


