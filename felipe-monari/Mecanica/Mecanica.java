import java.util.Scanner;

public class Mecanica{
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        Cliente c = new Cliente();
        Servico s = new Servico();
        Veiculo v = new Veiculo();
        OrdemServico oS = new OrdemServico();
        String seguir = "";
        System.out.println("Nome: ");
        c.setNome(scan.nextLine().trim());

        System.out.println("Endereco: ");
        c.setEndereco(scan.nextLine().trim());

        System.out.println("CPF: ");
        c.setCpf(scan.nextLine().trim());

        System.out.println("Telefone: ");
        c.setTelefone(scan.nextLine().trim());

        oS.setCliente(c);

        System.out.println("Descricao do veiculo: ");
        v.setDescricao(scan.nextLine().trim());

        System.out.println("Placa: ");
        v.setPlaca(scan.nextLine().trim());

        System.out.println("Ano de fabricacao: ");
        v.setAno(scan.nextLine());

        oS.setVeiculo(v);
        do{
        System.out.println("Servico: ");
        s.setDescricao(scan.nextLine().trim());

        System.out.println("Valor: ");
        s.setValor(scan.nextDouble());
        System.out.println("Quer mais servicos?")
        seguir = scan.nextLine();
        oS.setServico(s);

        }while(seguir.equalsIgnoreCase("s"));
        oS.imprimir();

    }
}
