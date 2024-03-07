package modelo;

class Veiculo {
    private String placa;
    private TipoVeiculo tipo;
    private boolean disponivel;

    public Veiculo(String placa, TipoVeiculo tipo) {
        this.placa = placa;
        this.tipo = tipo;
        this.disponivel = true;
    }

    public String getPlaca() {
        return placa;
    }
    public TipoVeiculo getTipo() {
        return tipo;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
