public class Atividade29
import java.util.Scanner;

public class MenuSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("--- MENU PRINCIPAL ---");
            System.out.println("1. Opção A");
            System.out.println("2. Opção B");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a Opção A.");
                    break;
                case 2:
                    System.out.println("Você escolheu a Opção B.");
                    break;
                case 3:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println();

        } while (opcao != 3);

        scanner.close();
    }
}

