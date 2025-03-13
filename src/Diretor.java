public class Diretor extends Funcionario{
    private double gratificacao;

    public double getGratificacao(){
        return gratificacao;
    }

    public void setGratificacao(double gratificacao){
        this.gratificacao = gratificacao;
    }

    public Diretor(String nome, String endereco, int matricula, double salario, double gratificacao){
        super(nome,endereco,matricula,salario);
        this.gratificacao = gratificacao;
    }

    public String toString(){
        return  "\n Nome: " + getNome() +
                "\n Endereco: " + getEndereco() +
                "\n Matrícula: " +getMatricula() +
                "\n Salário: " + getSalario() +
                "\n Grafificação: " + getGratificacao();
    }
}
