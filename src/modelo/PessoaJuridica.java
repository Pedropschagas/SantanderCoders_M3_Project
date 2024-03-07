package modelo;

public class PessoaJuridica implements Cliente{
    private String nome;
    private String cnpj;
    public PessoaJuridica(String nome, String cnpj) {
        this.cnpj = cnpj;
        this.nome = nome;
    }
    @Override
    public String getIdentificador() {
        return cnpj;
    }
    @Override
    public String getNome(){
        return this.nome;
    }
    @Override
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    @Override
    public void setIdentificador(String novoIdentificador) {
        this.cnpj = novoIdentificador;
    }



}
