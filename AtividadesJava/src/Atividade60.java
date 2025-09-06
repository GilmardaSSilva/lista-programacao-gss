import java.util.Scanner;
public class Atividade60 {
        public static void verificarTriangulo(int a, int b, int c) {

            if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
                System.out.println("Os valores " + a + ", " + b + " e " + c + " podem formar um triângulo.");
            } else {
                System.out.println("Os valores " + a + ", " + b + " e " + c + " NÃO podem formar um triângulo.");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite os três lados do triângulo:");

            System.out.print("Lado a: ");
            int ladoA = scanner.nextInt();

            System.out.print("Lado b: ");
            int ladoB = scanner.nextInt();

            System.out.print("Lado c: ");
            int ladoC = scanner.nextInt();


            verificarTriangulo(ladoA, ladoB, ladoC);

            scanner.close();
        }
    }

