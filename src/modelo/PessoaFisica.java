package modelo;

public class PessoaFisica implements Cliente{
    private String nome;
    private String cpf;
    public PessoaFisica(String nome, String cpf) {
        this.cpf = cpf;
        this.nome = nome;
    }
    @Override
    public String getIdentificador() {
        return cpf;
    }
    @Override
    public String getNome() {
        return null;
    }
    @Override
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    @Override
    public void setIdentificador(String novoIdentificador) {
        this.cpf = novoIdentificador;
    }


}
