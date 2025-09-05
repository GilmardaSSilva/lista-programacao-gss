import java.util.Scanner;
public class Atividade25 {
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


