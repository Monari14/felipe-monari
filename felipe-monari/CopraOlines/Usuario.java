
public class Usuario {
    private String nome, email, senha;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getSenha(){
        return this.senha;
    }
}
/*
Exercício pra hoje:
Projetar um sistema orientado a objetos para uma plataforma de compras on-line. Suas classes devem incluir
- Usuário: nome, e-mail e senha;
- ⁠Produto: nome, preço e descrição; 
- ⁠Pedido: produtos, data, endereço, informações de pagamento e frete;
Use o encapsulamento para proteger dados confidenciais e a composição para criar relações entre objetos conforme necessário.
*/