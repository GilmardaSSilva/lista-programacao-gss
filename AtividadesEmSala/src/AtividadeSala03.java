public class AtividadeSala03 {

    public static void main(String[] args){
        //Tendo as variáveis abaixo:
        int a = 15;
        int b = 20;
        int resultado = 0;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        /**
         Faça:
         * a) Calcule e imprima a soma, subtração, multiplicação e divisão
         * entre as variáveis. Use a variável resultado para obter e
         * imprimir os valores.
         **/
        resultado = a + b;
        System.out.println("a + b = " + resultado);
        resultado = a - b;
        System.out.println("a - b = " + resultado);
        resultado = a * b;
        System.out.println("a * b = " + resultado);
        resultado = a / b;
        System.out.println("a / b = " + resultado);

        /**
         * b) Imprima o resultado dos seguintes testes
         * (imprima o resultado diretamente no 'println')
         *  (a == b)
         *  (a != b)
         *  (a >= b)
         *  (a <= b)
         **/
        //Testes
        System.out.println("a == b ? " + (a == b));
        System.out.println("a != b ? " + (a != b));
        System.out.println("a >= b ? " + (a >= b));
        System.out.println("a <= b ? " + (a <= b));

    }

}
