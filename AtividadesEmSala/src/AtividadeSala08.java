
import java.util.Scanner;

public class AtividadeSala08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome = ""; // variável nome tipo "texto"
        int idade = 0; //variável idade tipo inteiro

        System.out.println("Digite o seu nome: ");
        nome = leia.nextLine();

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();

        System.out.println("Seu nome é " + nome);
        System.out.println("Você tem " + idade + " anos de idade.");

    }
}
