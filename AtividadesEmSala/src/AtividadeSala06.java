public class AtividadeSala06 {
    //Operadores lógicos
    public static void main(String[] args) {
        //OPERADOR E(and): &&
        //OPERADOR OU(or): ||
        //OPERADOR NÃO(not): !
        int a = 5, b = -5, x = 30, y = 9;
        boolean teste, verdadeiro = true, falso = false;
        teste = (a > b) || (a < b);// true
        System.out.println("(a > b) || (a < b): " + teste);
        teste = (x > a) && (y > a);// true
        System.out.println("(x > a) && (y > a)" + teste);
        teste = !verdadeiro;
        System.out.println("Negação de um valor verdadeiro"
                +teste);
        //Imprima os resultados abaixo:
        teste = verdadeiro || falso;
        System.out.println(teste);
        teste = !(falso || falso) && verdadeiro;
        System.out.println(teste);
        teste = verdadeiro || falso && verdadeiro;
        System.out.println(teste);
        teste = verdadeiro && !(falso && falso);
        System.out.println(teste);
    }
}