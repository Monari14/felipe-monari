
class Exerc5 {
    public static void main(String args[]) {
        String mais = "";
        for(int i = 0; i < args.length; i++){
            mais += args[i];
        if(i >= 0){
            mais += " ";
        }
        }

        System.out.println(mais.toUpperCase());

    }
}
