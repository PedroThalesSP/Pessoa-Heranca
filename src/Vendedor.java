public class Vendedor extends Funcionario{

    private String setorDeVendas;
    private double comissao;
    private double totalDeVendidos;

    public String getSetorDeVendas(){
        return setorDeVendas;
    }

    public void setSetorDeVendas(String setorDeVendas){
        this.setorDeVendas = setorDeVendas;
    }

    public double getComissao(){
        return comissao;
    }

    public void setComissao(double comissao){
        this.comissao = comissao;
    }

    public double getTotalDeVendidos(){
        return totalDeVendidos;
    }

    public void setTotalDeVendas(double totalDeVendas){
        this.totalDeVendidos = totalDeVendas;
    }

    public Vendedor (String nome, String endereco, int matricula, double salario,
                           String setorDeVendas, double comissao, double totalDeVendidos){
        super(nome,endereco,matricula,salario);
        this.setorDeVendas = setorDeVendas;
        this.comissao = comissao;
        this.totalDeVendidos = getTotalDeVendidos();
    }

    public String toString(){
        return  "\n Nome:" + getNome() +
                "\n Endereco:" + getEndereco() +
                "\n Matricula" + getMatricula() +
                "\n Salário:" + getSalario()+
                "\n Setor de Vendas" + getSetorDeVendas()+
                "\n Comissão:" + getComissao() +
                "\n Total vendido" + getTotalDeVendidos();
    }
}
