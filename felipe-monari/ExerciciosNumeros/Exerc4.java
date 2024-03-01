class Exerc4{
    public static void main(String args[]) {
        int maior = 0;
        int cont = 0;
        for(int i = 0; i < args.length; i++){
            int n = Integer.parseInt(args[i]);

            if(n > maior){
                n += maior;
            }
        }
        System.out.println(maior);
    }
}
