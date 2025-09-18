public class Atividade3 {



    public class Veiculo {

        private String marca;
        private String modelo;
        private double velocidade;

        public Veiculo(String marca, String modelo) {

            this.marca = marca;
            this.modelo = modelo;
            this.velocidade = 0.0;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public double getVelocidade() {
            return velocidade;
        }

        public void acelerar(double valor) {

            if (valor > 0) {
                this.velocidade += valor;
                System.out.println("Acelerando... Velocidade atual: " + this.velocidade + " km/h");
            } else {
                System.out.println("Valor de aceleração inválido.");
            }
        }

        public void frear(double valor) {

            if (valor > 0) {
                if (this.velocidade - valor < 0) {
                    this.velocidade = 0;
                } else {
                    this.velocidade -= valor;
                }
                System.out.println("Freando... Velocidade atual: " + this.velocidade + " km/h");
            } else {
                System.out.println("Valor de frenagem inválido.");
            }
        }

        public String descricao() {

            return "Veículo [Marca: " + marca + ", Modelo: " + modelo + ", Velocidade: " + velocidade + " km/h]";
        }
    }



    public class Carro extends Veiculo {
        private int portas;

        public Carro(String marca, String modelo, int portas) {
            super(marca, modelo);
            this.portas = portas;
        }

        public int getPortas() {
            return portas;
        }

        public void setPortas(int portas) {
            this.portas = portas;
        }

        @Override
        public String descricao() {
            return "Carro [Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Portas: " + portas + ", Velocidade: " + getVelocidade() + " km/h]";
        }
    }


    public class Moto extends Veiculo {
        private int cilindradas;

        public Moto(String marca, String modelo, int cilindradas) {
            super(marca, modelo);
            this.cilindradas = cilindradas;
        }

        public int getCilindradas() {
            return cilindradas;
        }

        public void setCilindradas(int cilindradas) {
            this.cilindradas = cilindradas;
        }

        public String descricao() {
            return "Moto [Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Cilindradas: " + cilindradas + "cc, Velocidade: " + getVelocidade() + " km/h]";
        }
    }



    public class Main {
        public static void main(String[] args) {

            Carro meuCarro = new Carro("Ford", "Fusion", 4);
            Moto minhaMoto = new Moto("Honda", "CBR 600RR", 600);


            Veiculo veiculoGenerico;

            System.out.println(" Usando referência Veiculo para um objeto Carro ");
            veiculoGenerico = meuCarro;
            veiculoGenerico.acelerar(50.0);
            System.out.println(veiculoGenerico.descricao());
            veiculoGenerico.frear(20.0);
            System.out.println(veiculoGenerico.descricao());
            System.out.println("veiculoGenerico");

            System.out.println("veiculoGenerico");
            veiculoGenerico = minhaMoto;
            veiculoGenerico.acelerar(80.0);
            System.out.println(veiculoGenerico.descricao());
            veiculoGenerico.frear(40.0);
            System.out.println(veiculoGenerico.descricao());
            System.out.println("veiculoGenerico");
        }
    }
}
