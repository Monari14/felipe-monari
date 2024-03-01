class Exerc1{
    public static void main(String args[]) {
        int soma = 0;
        for(int i = 0; i < args.length; i++){
            int n = Integer.parseInt(args[i]);
            soma += n;
            
        }
        System.out.println(soma);

    }
}
