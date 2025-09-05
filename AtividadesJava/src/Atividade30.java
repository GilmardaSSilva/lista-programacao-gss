import java.util.Scanner;
public class Atividade30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcao;
        double num1, num2;

        do {
            System.out.println("--- MENU DE OPERAÇÕES ---");
            System.out.println("A - Somar");
            System.out.println("B - Subtrair");
            System.out.println("C - Multiplicar");
            System.out.println("D - Dividir");
            System.out.println("X - Sair");
            System.out.print("Escolha uma opção (A, B, C, D ou X): ");

            opcao = Character.toUpperCase(scanner.next().charAt(0));

            if (opcao == 'A' || opcao == 'B' || opcao == 'C' || opcao == 'D') {
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();


                switch (opcao) {
                    case 'A':
                        System.out.println("Resultado da soma: " + (num1 + num2));
                        break;
                    case 'B':
                        System.out.println("Resultado da subtração: " + (num1 - num2));
                        break;
                    case 'C':
                        System.out.println("Resultado da multiplicação: " + (num1 * num2));
                        break;
                    case 'D':

                        if (num2 != 0) {
                            System.out.println("Resultado da divisão: " + (num1 / num2));
                        } else {
                            System.out.println("Erro: Divisão por zero não é permitida.");
                        }
                        break;
                }
            } else if (opcao == 'X') {
                System.out.println("Saindo do programa. Até mais!");
            } else {
                System.out.println("Opção inválida. Por favor, tente novamente.");
            }

            System.out.println();

        } while (opcao != 'X');


    }
}


