import java.util.Scanner;

public class Atividade44 {
        public static void main(String[] args) {

            double[] notas = new double[5];
            double soma = 0;
            Scanner sc = new Scanner(System.in);


            System.out.println("Digite as 5 notas dos alunos:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Nota do aluno " + (i + 1) + ": ");
                notas[i] = sc.nextDouble();
                soma += notas[i];
            }


            double media = soma / 5;


            System.out.println("\nA média da turma é: " + media);

            sc.close();
        }
    }

