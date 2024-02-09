class LengthInverso {
    public static void main(String[]args){
        int vez = args.length;
        for(int i = vez - 1; i >= 0; i--){
            System.out.print(args[i]);
            if(i > 0){
                System.out.print("-");
            }
        }
        System.out.println("");
    }
}