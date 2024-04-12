import java.util.Scanner;
public class Pitzsaria{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo a Pitzsaria P.G.");
        Faturamento f = new Faturamento();

        Pedido pedido = new Pedido();
        String seguir = "s";
        System.out.println("Opcoes:");
        System.out.println("1. Pedido");
        System.out.println("2. Imprimir Historico");
        System.out.println("#. SAIR");
        
        String verifyy = scan.nextLine();

        switch(verifyy){
            case "1":
        
        do{
            ItemDoPedido item = new ItemDoPedido();

            System.out.print("Informe o tipo de pitzsa (Tradicional ou Especial): ");
            item.setTipo(scan.nextLine());

            System.out.print("Informe o sabor de pitzsa: ");
            item.setSabor(scan.nextLine());

            pedido.addItem(item);
            
            pedido.setTotal(item.getValor());

            System.out.println("> mais alguma coisa rlk?");
            seguir = scan.nextLine();

        } while(seguir.equalsIgnoreCase("s"));

        System.out.print("Nome do cliente: ");
        pedido.setCliente(scan.nextLine());

        System.out.print("Mora onde truta: ");
        pedido.setTaxaDeEntrega(scan.nextLine());

        pedido.setTotal(pedido.getTaxaDeEntrega());

        pedido.imprimir();
        
        case "2":
            f.imprimirRelatorio();
        case "#":
            break;
        }
        }
}