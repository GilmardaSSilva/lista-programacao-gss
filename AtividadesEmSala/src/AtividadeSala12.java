import java.util.Scanner;

public class AtividadeSala12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
       /* double[] NOTAS = new double[3];
        System.out.println("Digite a primeira nota");
    System.out.println("Digite a primeira nota");
    notas[0] = leia.nextDouble();
        System.out.println("Digite a segunda nota");
        notas[1] = leia.nextDouble();
        System.out.println("Digite a terceira nota");
        notas[2] = leia.nextDouble();
        */
        double[] notas = new double[3];
        double media = 0, soma = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a " + (i + 1) + " nota");
            notas[i] = leia.nextDouble();
            soma += notas[i];
            if (i == 2) media = soma / notas.length;

        }
        System.out.println("Amédia das notas é;" + media);


    }
}
