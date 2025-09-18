public class Atividade2 {

    public class ContaBancaria {

        private String titular;
        private String numero;
        private double saldo;


        public ContaBancaria() {
            this.saldo = 0.0;
        }

        public ContaBancaria(String titular, String numero, double saldoInicial) {
            if (saldoInicial < 0) {
                System.out.println("O saldo inicial não pode ser negativo. A conta será criada com saldo 0.");
                this.saldo = 0.0;
            } else {
                this.titular = titular;
                this.numero = numero;
                this.saldo = saldoInicial;
            }
        }

        public void depositar(double valor) {
            if (valor > 0) {
                this.saldo += valor;
                System.out.println("Depósito de " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Valor de depósito inválido. Use um valor maior que zero.");
            }
        }

        public boolean sacar(double valor) {
            if (valor > 0) {
                if (this.saldo >= valor) {
                    this.saldo -= valor;
                    System.out.println("Saque de " + valor + " realizado com sucesso.");
                    return true;
                } else {
                    System.out.println("Saldo insuficiente para o saque.");
                    return false;
                }
            } else {
                System.out.println("Valor de saque inválido. Use um valor maior que zero.");
                return false;
            }
        }

        public boolean transferir(ContaBancaria destino, double valor) {
            if (valor > 0) {
                if (this.sacar(valor)) {
                    destino.depositar(valor);
                    System.out.println("Transferência de " + valor + " para a conta " + destino.getNumero() + " realizada com sucesso.");
                    return true;
                } else {
                    System.out.println("Transferência não pôde ser concluída.");
                    return false;
                }
            } else {
                System.out.println("Valor de transferência inválido. Use um valor maior que zero.");
                return false;
            }
        }


        public String getTitular() {
            return titular;
        }

        public String getNumero() {
            return numero;
        }

        public double getSaldo() {
            return saldo;
        }
    }
}
