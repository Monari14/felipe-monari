class Exerc2{
    public static void main(String args[]) {
        int soma = 0;
        int cont = 0;
        for(int i = 0; i < args.length; i++){
            int n = Integer.parseInt(args[i]);
            soma += n;
            cont++;
        }
        int media = soma / cont;
        System.out.println(media);

    }
}
