class CalculadoraFunc{
    public static double somar(double n1, double n2){
        return n1 + n2;
    }
    public static double subtrair(double n1, double n2){
        return n1 - n2;
    }
    public static double multiplicar(double n1, double n2){
        return n1 * n2;
    }
    public static double dividir(double n1, double n2){
        return n1 / n2;
    }
    public static void main(String[] args) {
        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[2]);

        if(args[1].equals("+")){
            double res = somar(n1, n2);
            System.out.println(res);
            
        }else if(args[1].equals("-")){
            double res = subtrair(n1, n2);
            System.out.println(res);

        }else if(args[1].equals("x")){
            double res = multiplicar(n1, n2);
            System.out.println(res);

        }else if(args[1].equals("/")){
            double res = dividir(n1, n2);
            System.out.println(res);

        }
    }
    }