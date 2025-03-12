public class Fornecedor extends Pessoa {

    private String cnpj;
    private String pais;

    public String getCnpj (){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public Fornecedor (String nome, String endereco, String cnpj, String pais ){
        super(nome,endereco);
        this.cnpj = cnpj;
        this.pais = pais;
    }

    public String toString(){
        return  "\n Dados da pessoa funcionario" +
                "\n O nome do funcionario é " + getNome() +
                "\n O endereço da empresa é " + getEndereco() +
                "\n O cnpj da empresa é " + getCnpj() +
                "\n O pais é " + getPais();
    }

}
