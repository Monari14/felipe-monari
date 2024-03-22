
public class Produto {
    private String nome, descricao;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }
}
