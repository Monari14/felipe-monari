
class Exerc7 {
    public static void main(String args[]) {
        String mais = "";

        for(int i = 0; i < args.length; i++){

            mais = mais + args[i].substring(0,1).toUpperCase() + args[i].substring(1).toLowerCase(); 
            if(i >= 0){
                mais+= " ";
            }
        }
            System.out.println(mais);
        }
    }
