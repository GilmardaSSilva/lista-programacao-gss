public class Atividade32
mport java.util.Scanner;

public class AcessoSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;
        String senhaCorreta = "1234";

        System.out.println("Programa de acesso. Digite a senha para continuar.");

        do {
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();

            if (!senha.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senha.equals(senhaCorreta));

        System.out.println("Acesso permitido!");

        scanner.close();
    }
}


