import java.util.Scanner;
public class Pitzsaria{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo a Pitzsaria P.G.");

        Pedido pedido = new Pedido();
        
        String seguir = "s";

        do{
            ItemDoPedido item = new ItemDoPedido();

            System.out.print("Informe o tipo de pitzsa (Tradicional ou Especial): ");
            item.setTipo(scan.nextLine());

            System.out.print("Informe o sabor de pitzsa: ");
            item.setSabor(scan.nextLine());

            pedido.addItem(item);
            
            pedido.setTotal(item.tipos());

            System.out.println("> mais alguma coisa rlk?");
            seguir = scan.nextLine();

        } while(seguir.equalsIgnoreCase("s"));

        System.out.print("Nome do cliente: ");
        pedido.setCliente(scan.nextLine());

        System.out.print("Taxa de entrega: ");
        pedido.setTaxaDeEntrega(scan.nextDouble());
        scan.nextLine();

        pedido.setTotal(pedido.getTaxaDeEntrega());

        pedido.imprimir();
    }
}
