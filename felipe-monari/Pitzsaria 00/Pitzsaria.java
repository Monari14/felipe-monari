import java.util.Scanner;

public class Pitzsaria {

    public static void main ( String [] args) {

        System.out.println("| Bem vindo à Pitzsaria |");

        Scanner scan = new Scanner (System.in);

        Pedido pedido = new Pedido();
        ItemDoPedido item = new ItemDoPedido();
        System.out.println("-------------------------");
        System.out.println("Informe o tipo da Pitzsa: ");
        item.setTipo(scan.nextLine());
        System.out.println("-------------------------");

        System.out.println("Informe o tipo da Pitzsa: ");
        item.setTipo(scan.nextLine());
        System.out.println("-------------------------");

        System.out.println("Informe o sabor: ");
        item.setSabor(scan.nextLine());
        System.out.println("-------------------------");

        System.out.println("Informe o valor: ");
        item.setValor(scan.nextDouble());
        pedido.adicionarItemDoPedido(item);
        System.out.println("-------------------------");

        System.out.println("Nome do cliente: ");
        pedido.setCliente(scan.next());
        System.out.println("-------------------------");

        System.out.println("Taxa de entrega: ");
        pedido.setTaxaEntrega(scan.nextDouble());
        System.out.println("-------------------------\n");

        pedido.imprimir();
    }
}