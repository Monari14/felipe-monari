
class Exerc4 {
    public static void main(String args[]) {
        String palavraI = "";
        String normal = "";

        for (int i = args.length - 1; i >= 0; i--) {
            normal = args[i];

            for(int j = normal.length() - 1; j >= 0; j--){
                palavraI += normal.charAt(j);
            }
            if(i > 0){
                palavraI += " ";
            }
        }
        System.out.println(palavraI);
    }
}
