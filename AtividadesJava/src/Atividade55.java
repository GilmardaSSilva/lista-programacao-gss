public class Atividade55 {
    public static long calcularFatorialDe15(int numeroIgnorado) {
            long fatorial = 1;
            for (int i = 1; i <= 15; i++) {
                fatorial *= i;
            }
            return fatorial;
        }

        public static void main(String[] args) {
            long resultado = calcularFatorialDe15(5);
            System.out.println("O fatorial de 15 é: " + resultado);
        }
    }

