
public class Pedido {
    private String produtos, data, endereco, infoPagamento;
    private double frete;
    public void setData(String data) {
        this.data = data;
    }
    public String getData(){
        return this.data;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setInfoPag(String infoPagamento) {
        this.infoPagamento = infoPagamento;
    }
    public String getInfoPag(){
        return this.infoPagamento;
    }
    public void setFrete(double frete) {
        this.frete = frete;
    }
    public double getFrete(){
        return this.frete;
    }
    public void imprime(){
        Produto p = new Produto();
        System.out.print("Nome: "+p.getNome()+ " Preco: "+p.getPreco() + " Descricao: "+p.getDescricao());
    }

}