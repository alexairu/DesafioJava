package model;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, String marca, String modelo, int eixos) throws EntradaInvalidaException {
        super(placa, marca, modelo);
        this.eixos = eixos;
    }

    @Override
    public double calcularIPVA() {
        return 80000.0 * 0.015; // IPVA de 1.5%
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("CAMINHÃO - Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Eixos: " + eixos + ", IPVA: R$" + calcularIPVA());
    }
}
