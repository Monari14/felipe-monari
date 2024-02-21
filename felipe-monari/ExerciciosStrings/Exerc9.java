
class Exerc9 {
    public static void main(String args[]) {
        String mais = "";
        for(int i = 0; i < args.length; i++){
            mais += args[i];
            if(i < args.length - 1){
                mais+= ("-");
            }
        }
            System.out.println(mais);
        }
    }
