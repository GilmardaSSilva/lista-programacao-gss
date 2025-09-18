public class Atividade4 {

    public class Funcionario {

        private String nome;
        private double salarioBase;

        public Funcionario(String nome, double salarioBase) {
            this.nome = nome;
            this.salarioBase = salarioBase;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getSalarioBase() {
            return salarioBase;
        }

        public void setSalarioBase(double salarioBase) {
            this.salarioBase = salarioBase;
        }

        public double calcularPagamento() {
            return salarioBase;
        }
    }


    public class Vendedor extends Funcionario {
        private double comissao;

        public Vendedor(String nome, double salarioBase, double comissao) {
            super(nome, salarioBase);
            this.comissao = comissao;
        }

        public double getComissao() {
            return comissao;
        }

        public void setComissao(double comissao) {
            this.comissao = comissao;
        }


        public double calcularPagamento() {
            return getSalarioBase() + comissao;
        }
    }


    public class Gerente extends Funcionario {
        private double bonus;

        public Gerente(String nome, double salarioBase, double bonus) {
            super(nome, salarioBase);
            this.bonus = bonus;
        }

        public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }


        public double calcularPagamento() {
            return getSalarioBase() + bonus;
        }
    }


    public class Folha {
        public void pagar(Funcionario f) {
            System.out.println("Processando pagamento para: " + f.getNome());
            System.out.println("Valor a ser pago: R$ " + String.format("%.2f", f.calcularPagamento()));
            System.out.println("valor a ser pago");
        }
    }


    public class Main {
        public static void main(String[] args) {

            Funcionario Gilmar = new Funcionario("Gilmar Silva", 3000.00);
            Vendedor Sebastião = new Vendedor("Sebastião silva", 2500.00, 500.00);
            Gerente Antonio = new Gerente("Antonio Onezimo", 5000.00, 1500.00);

            Folha folhaDePagamento = new Folha();

            System.out.println(" Gerando Folha de Pagamento ");

            folhaDePagamento.pagar(Gilmar);
            folhaDePagamento.pagar(Sebastião);
            folhaDePagamento.pagar(Antonio);

            System.out.println("Folha de pagamento concluída.");
        }
    }

}
