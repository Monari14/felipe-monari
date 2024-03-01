
class Exerc6 {

    public static void main(String args[]) {

        int num = Integer.parseInt(args[0]);
        int vez = 0;
        
        if(num < 2) {
            System.out.println(num + " Nao e primo! ");
        } else {
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    vez++;
                    System.out.println(num + " Nao e primo");
                    break;
                }
            }
            if(vez == 0){
                System.out.println(num + " E primo! ");
            }
        }
    }
}
