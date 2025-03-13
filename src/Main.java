
public class Main {
    public static void main(String[] args) {
        // Pessoas + Fornecedor
        Fornecedor f = new Fornecedor("Pedro", "Brasilia","123123","Brasil");
        System.out.println(f);
        // Pessoa + PF
        PessoaFisica PF = new PessoaFisica("Marcos","São Paulo",20,"321321");
        System.out.println(PF);
        // Pessoa + PJ
        PessoaJuridica PJ = new PessoaJuridica("DNA","Rio de Janeiro", 5, "121212");
        System.out.println(PJ);
        // Pessoa + Vendedor
        Vendedor V = new Vendedor ("Matheus","Maranhão",54321,10820, "Peças",
                1500,100);
        System.out.println(V);
        // Pessoa + Diretor

        Diretor Dir = new Diretor ("Thales", "Areal", 456,3000.0, 1000);
        System.out.println(Dir);
    }
}

