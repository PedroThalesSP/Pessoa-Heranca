public class PessoaJuridica extends Cliente{
    private String cnpj;

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj=cnpj;
    }

    public PessoaJuridica (String nome, String endereco, int idade, String cnpj){
        super(nome,endereco,idade);
        this.cnpj = cnpj;
    }

    public String toString(){
        return  "\n Informações da empresa" +
                "\n Nome:" + getNome() +
                "\n Endereco:" + getEndereco() +
                "\n Idade:" + getIdade() +
                "\n Cnpj:" + getCnpj();

    }
}
