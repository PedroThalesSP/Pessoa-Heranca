public class Funcionario extends Pessoa{
    private int matricula;
    private double salario;

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario( double salario){
        this.salario = salario;
    }

    public Funcionario(String nome,String endereco, int matricula, double salario){
        super(nome, endereco);
        this.matricula = matricula;
        this.salario = matricula;
    }

}
