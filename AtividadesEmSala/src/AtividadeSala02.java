public class AtividadeSala02 {
    /*
     * Crie uma variável String nomeada como "nome";
     * Crie uma variável String nomeada como "sobrenome";
     * Crie uma variável idade do tipo inteiro;
     * Crie uma variável com nome 'peso' do tipo real;
     * Crie uma variável altura do tipo real;
     * Faça:
     *   Um script que imprima o nome e sobrenome da pessoa;
     *   Imprima o ano de nascimento da pessoa;
     *   Imprima o peso e a altura na mesma linha;
     *   Imprima o IMC da pessoa;
     * */
    public static void main(String[] args){
        String nome = "Victor";
        String sobrenome = "Silva";
        int idade = 29;
        double peso = 89;
        double altura = 1.9;
        double imc = 0;
        //Um script que imprima o nome e sobrenome da pessoa;
        System.out.println(nome + " " + sobrenome);
        //Imprima o ano de nascimento da pessoa;
        int anoNasc = 2025 - idade;
        System.out.println("Ano de nascimento: " + anoNasc);
        //Imprima o peso e a altura na mesma linha;
        String txtPesoAltura = "Peso: " + peso + "; Altura: " + altura;
        System.out.println(txtPesoAltura);
        //Imprima o IMC da pessoa;
        imc = peso/(altura*altura);
        System.out.println("Base calc IMC: " +peso+"/"+altura+"² = " + imc);
        //System.out.println("IMC é: " +  imc);



    }
}
