class Exerc5{
    public static void main(String args[]) {
        int calculo = 1;
        int o = Integer.parseInt(args[0]);

        for(int i = o; i > 1; i--){

            calculo *= i;

        }
        System.out.println(calculo);   

    }
}
