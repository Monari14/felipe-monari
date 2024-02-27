class Exerc11 {
    public static void main(String args[]) {
        String vogais = "aeiouAEIOU";
        String virg = ",";
        String esp = " ";
        for(int i = 0; i < args.length; i++){
            String palavra = args[i];
            System.out.print(i + ":");
            for(int p = 0; p < palavra.length(); p++){
                char letra = palavra.charAt(p);
                for(int j = 0; j < vogais.length(); j++){
                    char vogal = vogais.charAt(j);
                    if(letra == vogal){
                        System.out.print(p);
                        if(p < palavra.length() - 1){
                        System.out.print(virg);
                        }else {
                            System.out.print(esp);
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
