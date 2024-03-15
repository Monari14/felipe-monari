public class ItemDoPedido {

    private int n_pedido;
    private double valor;
    private String sabor;
    private String tipo;
    private int quantidade;
    private double soma;
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String getSabor() {
        return this.sabor;
    }
    public void setSoma(double soma){
        this.soma += this.valor;
    }
    public double getSoma(){
        return this.soma;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return this.valor;
    }
}