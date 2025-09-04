public class Atividade31
mport java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        System.out.println("Digite os números para somar. Digite 0 para encerrar.");

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("A soma de todos os números digitados (exceto o zero) é: " + soma);

        scanner.close();
    }
}


