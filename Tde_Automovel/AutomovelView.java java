import java.util.*;

public class AutomovelView {
    private AutomovelController controller;
    private Scanner scanner = new Scanner(System.in);

    public AutomovelView(AutomovelController controller) {
        this.controller = controller;
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n===== Menu Automóveis =====");
            System.out.println("1 - Incluir");
            System.out.println("2 - Remover");
            System.out.println("3 - Alterar");
            System.out.println("4 - Consultar");
            System.out.println("5 - Listar ordenado");
            System.out.println("6 - Salvar e sair");
            System.out.print("Opção: ");
            opcao = lerInt();

            switch (opcao) {
                case 1 -> incluir();
                case 2 -> remover();
                case 3 -> alterar();
                case 4 -> consultar();
                case 5 -> listar();
                case 6 -> controller.salvar();
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
    }

    private void incluir() {
        System.out.print("Placa: ");
        String placa = scanner.nextLine().trim();
        if (controller.buscarPorPlaca(placa) != null) {
            System.out.println("Placa já existe.");
            return;
        }
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine().trim();
        System.out.print("Marca: ");
        String marca = scanner.nextLine().trim();
        int ano = lerInt("Ano: ");
        double valor = lerDouble("Valor: ");

        Automovel novo = new Automovel(placa, modelo, marca, ano, valor);
        if (controller.incluir(novo)) {
            System.out.println("Incluído com sucesso.");
        }
    }

    private void remover() {
        System.out.print("Placa a remover: ");
        String placa = scanner.nextLine().trim();
        if (controller.remover(placa)) {
            System.out.println("Removido com sucesso.");
        } else {
            System.out.println("Não encontrado.");
        }
    }

    private void alterar() {
        System.out.print("Placa do automóvel: ");
        String placa = scanner.nextLine().trim();
        Automovel a = controller.buscarPorPlaca(placa);
        if (a == null) {
            System.out.println("Não encontrado.");
            return;
        }

        System.out.println("Atual: " + a);

        System.out.print("Novo modelo (enter = manter): ");
        String modelo = scanner.nextLine().trim();

        System.out.print("Nova marca (enter = manter): ");
        String marca = scanner.nextLine().trim();

        System.out.print("Novo ano (enter = manter): ");
        String anoStr = scanner.nextLine().trim();
        Integer ano = anoStr.isEmpty() ? null : Integer.parseInt(anoStr);

        System.out.print("Novo valor (enter = manter): ");
        String valorStr = scanner.nextLine().trim();
        Double valor = valorStr.isEmpty() ? null : Double.parseDouble(valorStr);

        controller.alterar(placa, modelo, marca, ano, valor);
        System.out.println("Alterado.");
    }

    private void consultar() {
        System.out.print("Placa para consulta: ");
        String placa = scanner.nextLine().trim();
        Automovel a = controller.buscarPorPlaca(placa);
        if (a != null) {
            System.out.println(a);
        } else {
            System.out.println("Não encontrado.");
        }
    }

    private void listar() {
        System.out.println("Ordenar por: placa, modelo ou marca?");
        String crit = scanner.nextLine().trim().toLowerCase();
        List<Automovel> lista = controller.listarOrdenadoPor(crit);
        if (lista.isEmpty()) {
            System.out.println("Nenhum automóvel.");
        } else {
            for (Automovel a : lista) {
                System.out.println(a);
            }
        }
    }

    private int lerInt() {
        return lerInt("");
    }

    private int lerInt(String msg) {
        while (true) {
            if (!msg.isEmpty()) System.out.print(msg);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Número inválido.");
            }
        }
    }

    private double lerDouble(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Número inválido.");
            }
        }
    }
}
