class LengthSemIf {
    public static void main(String[]args){
        int vez = args.length;

        String junc = "";
        for(int contador = 0; contador < vez; contador++){
            System.out.print(junc + args[contador]);
            junc = "-";
        }
        System.out.println("");
        }
}