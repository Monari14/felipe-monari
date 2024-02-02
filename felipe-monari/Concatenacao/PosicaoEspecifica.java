import java.util.Scanner;
class PosicaoEspecifica {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        System.out.println("Digite a posicao: ");
        int posicao = scan.nextInt();
        char letraPos = a.charAt(posicao);
        System.out.println(letraPos);
    }
}