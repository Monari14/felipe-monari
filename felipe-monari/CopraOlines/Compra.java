import java.util.Scanner;

public class Compra {

    public static void main ( String [] args) {

        System.out.println("| Bem vindo ao Sex Shop Online |");

        Scanner scan = new Scanner (System.in);
        Usuario usuario = new Usuario();
        Produto produto = new Produto();
        Pedido pedido = new Pedido();
        System.out.println("- Usuario -");

        System.out.println("-------------------------");

        System.out.println("Informe o nome: ");
        String nome = scan.nextLine();
        usuario.setNome(nome);

        System.out.println("-------------------------");

        System.out.println("Informe o email: ");
        String email = scan.nextLine();
        usuario.setEmail(email);

        System.out.println("-------------------------");

        System.out.println("Informe a senha: ");
        String senha = scan.nextLine();
        usuario.setSenha(senha);

        System.out.println("-------------------------");
        String verify = "s";
        do{ 
        System.out.println("- Produto -");

        System.out.println("Informe o nome: ");
        String nomme = scan.next();
        produto.setNome(nomme);

        System.out.println("-------------------------");

        System.out.println("Informe o preco: ");
        try {
            produto.setPreco(scan.nextDouble());
            scan.nextLine();
        }catch(InputMismatchException e){
            System.err.println("VOCe eh 'BURRO' & DIJITO EHADO");
            System.exit(1);
        }


        System.out.println("-------------------------");

        System.out.println("Informe o descricao: ");
        String desc = scan.next();
        produto.setDescricao(desc);

        System.out.println("-------------------------");
        System.out.println("\n-------------------------");
        System.out.println(" mais alguma coisa rlk?");
        verify = scan.next();
        }while(verify.equalsIgnoreCase("s"));

        System.out.println("- Pedido -");
        
        System.out.println("Informe a Data: ");
        String data = scan.next();
        pedido.setData(data);

        System.out.println("-------------------------");

        System.out.println("Informe o Endereco: ");
        String ende = scan.nextLine();
        pedido.setEndereco(ende);

        System.out.println("-------------------------");

        System.out.println("Informacoes de pagamento: ");
        String info = scan.nextLine();
        pedido.setInfoPag(info);

        System.out.println("-------------------------");

        System.out.println("Informe o Frete: ");
        double frete = scan.nextDouble();
        pedido.setFrete(frete);
        System.out.println("-------------------------");
        pedido.imprime();
    }
}