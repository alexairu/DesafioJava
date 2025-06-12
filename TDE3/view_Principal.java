package view;

import controller.VeiculoController;
import model.*;
import model.excecao.*;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VeiculoController controller = new VeiculoController();

        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Cadastrar Veículo");
            System.out.println("2. Listar Veículos");
            System.out.println("3. Atualizar Veículo");
            System.out.println("4. Remover Veículo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    cadastrarVeiculo(scanner, controller);
                    break;
                case 2:
                    controller.listarVeiculos();
                    break;
                case 3:
                    atualizarVeiculo(scanner, controller);
                    break;
                case 4:
                    removerVeiculo(scanner, controller);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    private static void cadastrarVeiculo(Scanner scanner, VeiculoController controller) {
        System.out.println("Tipo de veículo: 1-Carro | 2-Moto | 3-Caminhão");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        try {
            switch (tipo) {
                case 1:
                    System.out.print("Quantidade de portas: ");
                    int portas = scanner.nextInt();
                    controller.adicionarVeiculo(new Carro(placa, marca, modelo, portas));
                    break;
                case 2:
                    System.out.print("Cilindradas: ");
                    int cilindradas = scanner.nextInt();
                    controller.adicionarVeiculo(new Moto(placa, marca, modelo, cilindradas));
                    break;
                case 3:
                    System.out.print("Número de eixos: ");
                    int eixos = scanner.nextInt();
                    controller.adicionarVeiculo(new Caminhao(placa, marca, modelo, eixos));
                    break;
                default:
                    System.out.println("Tipo inválido.");
            }
            System.out.println("Veículo cadastrado com sucesso!");
        } catch (EntradaInvalidaException e) {
            System.out.println("Erro ao cadastrar veículo: " + e.getMessage());
        }
    }

    private static void atualizarVeiculo(Scanner scanner, VeiculoController controller) {
        System.out.print("Placa do veículo a ser atualizado: ");
        String placa = scanner.nextLine();
        System.out.print("Nova marca: ");
        String marca = scanner.nextLine();
        System.out.print("Novo modelo: ");
        String modelo = scanner.nextLine();

        try {
            controller.atualizarVeiculo(placa, marca, modelo);
        } catch (VeiculoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void removerVeiculo(Scanner scanner, VeiculoController controller) {
        System.out.print("Placa do veículo a ser removido: ");
        String placa = scanner.nextLine();

        try {
            controller.removerVeiculo(placa);
        } catch (VeiculoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
