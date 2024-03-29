import java.util.ArrayList;
public class Pedido{
    private ArrayList<ItemDoPedido> itemDoPedido = new ArrayList<>();
    private String cliente;
    private double total = 0;
    private String taxaEntrega;

    public void addItem(ItemDoPedido item){
        this.itemDoPedido.add(item);
    }

    public void setCliente(String nome){
        this.cliente = nome;
    }

    public void setTotal(double total){
        this.total += total;
    }

    public void setTaxaDeEntrega(String taxaEntrega){
        this.taxaEntrega = taxaEntrega.trim();
    }

    public double getTaxaDeEntrega(){

        if(this.taxaEntrega.equalsIgnoreCase("centro")){
            return 10;
        }else if(this.taxaEntrega.equalsIgnoreCase("periferia")){
            return 15;
        }else{
            return 20;
        }

    }
    public void setTaxa(String taxaEntrega){
            this.taxaEntrega = taxaEntrega;
        }
    public String getTaxa(){
        return this.taxaEntrega;
    }
    public void imprimir(){
        System.out.println("----------------------------------------");
        System.out.println("              Pitzsaria P.G             ");
        System.out.println("----------------------------------------");
        System.out.println(formatar("Cliente                :", this.cliente));
        System.out.println("----------------------------------------");
        for(int i = 0; i < itemDoPedido.size(); i++){
            System.out.println(formatar("Tipo                   :", this.itemDoPedido.get(i).getTipo()));
            System.out.println(formatar("Sabor                  :", this.itemDoPedido.get(i).getSabor()));
            System.out.println(formatar("Valor                  :", String.valueOf(this.itemDoPedido.get(i).getValor())));
        System.out.println("----------------------------------------");
        }
        System.out.println("----------------------------------------");
        System.out.println(formatar("Tx. Entrega            :", String.valueOf(this.getTaxaDeEntrega())));
        System.out.println("----------------------------------------");
        System.out.println(formatar("Local                  :", String.valueOf(this.getTaxa())));
        System.out.println("----------------------------------------");

        System.out.println(formatar("Total                  :", String.valueOf(this.total)));
        System.out.println("----------------------------------------");
    }

    private static String formatar(String titulo, String item){
        String div = "----------------------------------------";
        int finalDiv = div.length() -1;
        int finalItem = titulo.length() + item.length() -1;

        while(finalDiv != finalItem && item.length() < div.length()){
            item = " " + item;
            finalItem = titulo.length() + item.length() -1;

        }
        return titulo + item;
    }
}