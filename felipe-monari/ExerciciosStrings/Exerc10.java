
class Exerc10 {
    public static void main(String args[]) {
        String vogais = "aeiouAEIOU";
        int contador = 0;
        for(int i = 0; i < args.length; i++){
            String palavra = args[i];
            
            for(int p = 0; p < palavra.length(); p++){
                char letra = palavra.charAt(p);

                for(int j = 0; j < vogais.length(); j++){
                    char vogal = vogais.charAt(j);
                    if(letra == vogal){
                        contador++;
                    }
                }
            }
        }
        System.out.println(contador);
    }
}
