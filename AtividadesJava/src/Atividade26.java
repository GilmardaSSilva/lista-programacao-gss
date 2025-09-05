import java.util.Scanner;
public class Atividade26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota final: ");
        double notaFinal = scanner.nextDouble();

        if (notaFinal >= 6) {
            System.out.println("Aprovado");
        } else if (notaFinal >= 4 && notaFinal < 6) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}


