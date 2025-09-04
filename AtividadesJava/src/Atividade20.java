public class Atividade20 import java.util.Scanner;

public class PodeDirigir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Você tem CNH? (true/false): ");
        boolean temCNH = scanner.nextBoolean();


        if (idade >= 18 && temCNH) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Não pode dirigir.");
        }

        scanner.close();
    }
}{
}
