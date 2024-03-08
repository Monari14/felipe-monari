class Calculadora{
    public static void main(String[] args) {
        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[2]);

        double calcSoma = n1 + n2;
        double calcSub = n1 - n2;
        double calcMulti = n1 * n2;
        double calcDivi = n1 / n2;

        if(args[1].equals("+")){
            System.out.println("Soma: "+calcSoma);
        }else if(args[1].equals("-")){
            System.out.println("Subtracao: "+calcSub);
        }else if(args[1].equals("x")){
            System.out.println("Multiplicacao: "+calcMulti);
        }else if(args[1].equals("/")){
            System.out.println("Divisao: "+calcDivi);
        }
    }
    }