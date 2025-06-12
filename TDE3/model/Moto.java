package model;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String marca, String modelo, int cilindradas) throws EntradaInvalidaException {
        super(placa, marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularIPVA() {
        return 15000.0 * 0.02; // IPVA de 2%
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("MOTO - Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Cilindradas: " + cilindradas + ", IPVA: R$" + calcularIPVA());
    }
}
