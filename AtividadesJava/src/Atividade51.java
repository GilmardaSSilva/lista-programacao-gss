public class Atividade51 {
    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int resultado = somar(5, 3);
        System.out.println("A soma de 5 e 3 é: " + resultado);


        int x = 10;
        int y = 20;
        int resultado2 = somar(x, y);
        System.out.println("A soma de " + x + " e " + y + " é: " + resultado2);
    }
}

