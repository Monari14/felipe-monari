class CalculadoraStaticN{

    public static void main(String[] args) {
        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[2]);
        Calcular c = new Calcular(n1, n2);

        if(args[1].equals("+")){
            double res = c.somar();
            System.out.println(res);
        }else if(args[1].equals("-")){
            double res = c.subtrair();
            System.out.println(res);

        }else if(args[1].equals("x")){
            double res = c.multiplicar();
            System.out.println(res);

        }else if(args[1].equals("/")){
            double res = c.dividir();
            System.out.println(res);

        }else if(args[1].equals("p")){

            double res = c.potencia();
            System.out.println(res);

        }else if(args[1].equals("r")){
            double res = c.raiz();
            System.out.println(res);

        }else if(args[1].equals("!")){
            double res = c.fatorial();

            System.out.println(res);

        }
    }
    }
    class Calcular {
        private double numero1;
        private double numero2;
        
        Calcular(double numero1, double numero2) {
            this.numero1 = numero1;
            this.numero2 = numero2;
        }
        public double somar() {
            return this.numero1 + this.numero2;
        }
        public double subtrair() {
            return this.numero1 - this.numero2;
        }
        public double multiplicar() {
            return this.numero1 * this.numero2;
        }
        public double dividir() {
            return this.numero1 / this.numero2;
        }
        public double potencia() {
            return Math.pow(this.numero1, this.numero2);
        }
        public double raiz() {
            return Math.sqrt(this.numero1);

        }
    }