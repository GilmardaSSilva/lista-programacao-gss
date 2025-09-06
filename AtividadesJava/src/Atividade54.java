public class Atividade54 {
    public class CalculadoraDeMedia {


        public static double calcularMedia(double nota1, double nota2, double nota3) {
            double soma = nota1 + nota2 + nota3;
            double media = soma / 3;
            return media;
        }

        public static void main(String[] args) {

            double notaA = 7.5;
            double notaB = 8.0;
            double notaC = 6.5;

            double mediaDoAluno = calcularMedia(notaA, notaB, notaC);

            System.out.printf("As notas do aluno foram: %.1f, %.1f e %.1f\n", notaA, notaB, notaC);
            System.out.printf("A média final é: %.2f\n", mediaDoAluno);
        }
    }
}
