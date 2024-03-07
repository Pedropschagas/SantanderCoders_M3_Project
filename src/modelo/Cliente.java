package modelo;

public interface Cliente {
    void setNome(String novoNome);
    void setIdentificador(String novoIdentificador);
    String getIdentificador();
    String getNome();
}
