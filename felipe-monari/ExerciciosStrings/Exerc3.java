
class Exerc3 {
    public static void main(String args[]) {
        String inverso = "";
        for (int i = args.length - 1; i >= 0; i--) {
            inverso = inverso + args[i];
            if(i > 0){
                inverso += " ";
            }
        }
        System.out.println(inverso);
    }
}
