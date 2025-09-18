public class Atividade1 {

    public class Lampada

        private boolean ligada;
        private int brilho; // 0-100
        private String cor;


        public Lampada() {

            this.ligada = false;
            this.brilho = 0;
            this.cor = "branca";
        }


        publiclampada(boolean ligada, int brilho, String cor) {

            this.ligada = ligada;

            this.brilho = validarBrilho(brilho);
            this.cor = cor;
        }



        private int validarBrilho(int brilho) {

            if (brilho < 0) {
                return 0;
            } else if (brilho > 100) {
                return 100;
            } else {
                return brilho;
            }
        }



        public void ligar() {

            if (!this.ligada) {
                this.ligada = true;
                System.out.println("Lâmpada ligada.");
            } else {
                System.out.println("A lâmpada já está ligada.");
            }
        }

        public void desligar() {

            if (this.ligada) {
                this.ligada = false;
                System.out.println("Lâmpada desligada.");
            } else {
                System.out.println("A lâmpada já está desligada.");
            }
        }

        public void aumentarBrilho(int valor) {

            if (this.ligada) {
                this.brilho = validarBrilho(this.brilho + valor);
                System.out.println("Brilho aumentado para " + this.brilho + "%.");
            } else {
                System.out.println("Não é possível ajustar o brilho, a lâmpada está desligada.");
            }
        }

        public void reduzirBrilho(int valor) {

            if (this.ligada) {
                this.brilho = validarBrilho(this.brilho - valor);
                System.out.println("Brilho reduzido para " + this.brilho + "%.");
            } else {
                System.out.println("Não é possível ajustar o brilho, a lâmpada está desligada.");
            }
        }

        public void mudarCor(String novaCor) {

            if (this.ligada) {
                this.cor = novaCor;
                System.out.println("Cor alterada para '" + this.cor + "'.");
            } else {
                System.out.println("Não é possível mudar a cor, a lâmpada está desligada.");
            }
        }


        public void imprimirEstado() {

            String estado = this.ligada ? "ligada" : "desligada";
            System.out.println("Estado: " + estado + ", Brilho: " + this.brilho + "%, Cor: " + this.cor);
        }
    }



