public class Atividade21 mport java.util.Scanner;

public class SituacaoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double n2 = scanner.nextDouble();


        if (n1 >= 6 && n2 >= 6) {
            System.out.println("Aprovado");
        }

        else if (n1 >= 4 || n2 >= 4) {
            System.out.println("Recuperação");
        }

        else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}


