class Exerc3{
    public static void main(String args[]) {
        int soma = 0;
        int cont = 0;
        for(int i = 0; i < args.length; i++){
            int n = Integer.parseInt(args[i]);

            if(n % 2 == 0){
                System.out.println("O " +args[i]+ " e par");
            }else{
                System.out.println("O " +args[i]+ " e impar");
            }
        }
        
    }
}
