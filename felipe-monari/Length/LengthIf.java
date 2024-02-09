class lengthIf {
    public static void main(String[]args){
        int vez = args.length;
        for(int contador = 0; contador < vez; contador++){
            System.out.print(args[contador]);
        if(contador < vez - 1){
            System.out.print("-");
        }
    }
    System.out.println("");
}
}