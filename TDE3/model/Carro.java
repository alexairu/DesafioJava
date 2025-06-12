package model;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String placa, String marca, String modelo, int portas) throws EntradaInvalidaException {
        super(placa, marca, modelo);
        this.portas = portas;
    }

    @Override
    public double calcularIPVA() {
        return 4000.0 * 0.03; // IPVA de 3%
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("CARRO - Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Portas: " + portas + ", IPVA: R$" + calcularIPVA());
    }
}
