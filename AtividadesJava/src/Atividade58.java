public class Atividade58 {
    import java.util.Scanner;
        public static void imprimeVetorInt(int[] vetor){
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("vetor["+i+"] = " + vetor[i]);
            }
        }
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            int[] numeros = new int[5];
            for (int i = 0; i < numeros.length ; i++) {
                System.out.println("Digite o valor:");
                numeros[i] = leia.nextInt();
            }
            imprimeVetorInt(numeros);
        }
    }
}
