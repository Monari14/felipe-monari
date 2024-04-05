
public class OrdemServico {
    private double total = 0;
    private Cliente cliente;
    private Veiculo veiculo;
    private Servico servico;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public Veiculo getVeiculo(){
        return this.veiculo;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    public Servico getServico(){
        return this.servico;
    }

    public void addTotal(Double total) {
        this.total += total;
    }
    public Double getTotal() {
        return this.total;
    }

    public void imprimir(){
        System.out.println("-----------------------------------");
        System.out.println("Nome                  : "+ this.cliente.getNome());
        System.out.println("-----------------------------------");
        System.out.println("Endereco              : "+ this.cliente.getEndereco());
        System.out.println("-----------------------------------");
        System.out.println("CPF                   : "+ this.cliente.getCpf());
        System.out.println("-----------------------------------");
        System.out.println("Telefone              : "+ this.cliente.getTelefone());
        System.out.println("-----------------------------------");
        System.out.println("Descricao do veiculo  : "+ this.veiculo.getDescricao());
        System.out.println("-----------------------------------");
        System.out.println("Placa                 : "+ this.veiculo.getPlaca());
        System.out.println("-----------------------------------");
        System.out.println("Ano de fabricacao     : "+ this.veiculo.getAno());
        System.out.println("-----------------------------------");
        System.out.println("Servico               :"+ this.servico.getDescricao());
        System.out.println("-----------------------------------");
        System.out.println("Valor                 : "+ this.servico.getValor());
        System.out.println("-----------------------------------");
    }

}