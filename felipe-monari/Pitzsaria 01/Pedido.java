import java.util.ArrayList;

public class Pedido {
    private double taxaEntrega;
    private ItemDoPedido itemDoPedido;
    private String cliente;
    private double total;

    public void adicionarItemDoPedido(ItemDoPedido item) {
        this.itemDoPedido = item;
    }

    public void setCliente(String nome) {
        this.cliente = nome;

    }
    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }
    public double getTotal(){
        return this.taxaEntrega + this.itemDoPedido.getValor();
    }

    public void imprimir(){
        System.out.println("-------------------------");
        System.out.println("   - Pitzsaria P.G. -    ");
        System.out.println("-------------------------");
        System.out.println(" Cliente   : "+this.cliente);
        System.out.println("-------------------------");
        System.out.println(" Tipo      : "+this.itemDoPedido.getTipo());
        System.out.println(" Sabor     : "+this.itemDoPedido.getSabor());
        System.out.println(" Valor     : R$"+this.itemDoPedido.getValor());
        System.out.println("-------------------------");
        System.out.println(" Tx Entrega: R$"+this.taxaEntrega);
        System.out.println("-------------------------");
        System.out.println(" Total     : R$"+this.getTotal());
        System.out.println("-------------------------");
    }

}