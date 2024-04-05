
public class Servico {
    private double valor;
    private String descricao;
 
    public void setValor(double valor) {
        this.valor += valor;
    }
    public double getValor(){
        return this.valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }

}