
class Exerc8 {
    public static void main(String args[]) {
        String mais = "";
        for(int i = 0; i < args.length; i++){
            mais += args[i].toLowerCase();
            if(i < args.length - 1){
                mais+= ("_");
            }
        }
            System.out.println(mais);
        }
    }
