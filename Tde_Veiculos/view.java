package veiculos.view;

import veiculos.model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class VeiculoView {
    private final ArrayList<Veiculo> lista = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public void iniciar() {
        int opcao;
        do {
            System.out.println("\n1 - Cadastrar novo veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Sair");
            System.out.print(">> ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> listar();
                case 3 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    }

    private void cadastrar() {
        System.out.print("Tipo (1-Carro, 2-Moto, 3-Caminhão): ");
        int tipo = sc.nextInt(); sc.nextLine();

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Placa: ");
        String placa = sc.nextLine();
        System.out.print("Ano: ");
        int ano = sc.nextInt(); sc.nextLine();

        switch (tipo) {
            case 1 -> {
                System.out.print("Quantidade de portas: ");
                int portas = sc.nextInt(); sc.nextLine();
                lista.add(new Carro(placa, modelo, ano, portas));
            }
            case 2 -> {
                System.out.print("Cilindrada: ");
                int cc = sc.nextInt(); sc.nextLine();
                lista.add(new Moto(placa, modelo, ano, cc));
            }
            case 3 -> {
                System.out.print("Capacidade de carga (toneladas): ");
                double carga = sc.nextDouble(); sc.nextLine();
                lista.add(new Caminhao(placa, modelo, ano, carga));
            }
            default -> System.out.println("Tipo inválido!");
        }
    }

    private void listar() {
        for (Veiculo v : lista) {
            v.exibirDados();
        }
    }
}
