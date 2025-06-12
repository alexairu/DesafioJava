package model;

public abstract class Veiculo implements Exibivel {
    protected String placa;
    protected String marca;
    protected String modelo;

    public Veiculo(String placa, String marca, String modelo) throws EntradaInvalidaException {
        if (placa == null || placa.trim().isEmpty()) {
            throw new EntradaInvalidaException("Placa inválida!");
        }
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract double calcularIPVA();

    @Override
    public void exibirDetalhes() {
        System.out.println("VEÍCULO - Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
