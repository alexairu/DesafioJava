import java.io.*;
import java.util.*;

public class CadastroAutomoveis {
    private static final String ARQUIVO_DADOS = "automoveis.txt";
    private ArrayList<Automovel> listaAutomoveis = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CadastroAutomoveis app = new CadastroAutomoveis();
        app.carregarDados();
        app.menu();
    }

    private void menu() {
        int opcao = 0;
        do {
            System.out.println("\n===== Cadastro de Automóveis =====");
            System.out.println("1 - Incluir automóvel");
            System.out.println("2 - Remover automóvel");
            System.out.println("3 - Alterar dados de automóvel");
            System.out.println("4 - Consultar automóvel por placa");
            System.out.println("5 - Listar automóveis (ordenado)");
            System.out.println("6 - Salvar e sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcao = 0;
            }

            switch (opcao) {
                case 1: incluirAutomovel(); break;
                case 2: removerAutomovel(); break;
                case 3: alterarAutomovel(); break;
                case 4: consultarAutomovel(); break;
                case 5: listarAutomoveis(); break;
                case 6: salvarEExit(); break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 6);
    }

    private void incluirAutomovel() {
        System.out.println("\n--- Inclusão de Automóvel ---");
        System.out.print("Informe a placa: ");
        String placa = scanner.nextLine().trim();

        if (buscarPorPlaca(placa) != null) {
            System.out.println("Erro: Já existe um automóvel cadastrado com essa placa!");
            return;
        }

        System.out.print("Informe o modelo: ");
        String modelo = scanner.nextLine().trim();

        System.out.print("Informe a marca: ");
        String marca = scanner.nextLine().trim();

        int ano = lerInt("Informe o ano: ");
        double valor = lerDouble("Informe o valor: ");

        Automovel novo = new Automovel(placa, modelo, marca, ano, valor);
        listaAutomoveis.add(novo);
        System.out.println("Automóvel incluído com sucesso!");
    }

    private void removerAutomovel() {
        System.out.println("\n--- Remoção de Automóvel ---");
        System.out.print("Informe a placa do automóvel a remover: ");
        String placa = scanner.nextLine().trim();

        Automovel a = buscarPorPlaca(placa);
        if (a == null) {
            System.out.println("Automóvel não encontrado.");
            return;
        }

        listaAutomoveis.remove(a);
        System.out.println("Automóvel removido com sucesso.");
    }

    private void alterarAutomovel() {
        System.out.println("\n--- Alteração de Automóvel ---");
        System.out.print("Informe a placa do automóvel a alterar: ");
        String placa = scanner.nextLine().trim();

        Automovel a = buscarPorPlaca(placa);
        if (a == null) {
            System.out.println("Automóvel não encontrado.");
            return;
        }

        System.out.println("Dados atuais: " + a);

        System.out.print("Informe o novo modelo (enter para manter): ");
        String modelo = scanner.nextLine().trim();
        if (!modelo.isEmpty()) a.setModelo(modelo);

        System.out.print("Informe a nova marca (enter para manter): ");
        String marca = scanner.nextLine().trim();
        if (!marca.isEmpty()) a.setMarca(marca);

        System.out.print("Informe o novo ano (enter para manter): ");
        String anoStr = scanner.nextLine().trim();
        if (!anoStr.isEmpty()) {
            try {
                int ano = Integer.parseInt(anoStr);
                a.setAno(ano);
            } catch (NumberFormatException e) {
                System.out.println("Ano inválido. Mantendo valor anterior.");
            }
        }

        System.out.print("Informe o novo valor (enter para manter): ");
        String valorStr = scanner.nextLine().trim();
        if (!valorStr.isEmpty()) {
            try {
                double valor = Double.parseDouble(valorStr);
                a.setValor(valor);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Mantendo valor anterior.");
            }
        }

        System.out.println("Automóvel atualizado: " + a);
    }

    private void consultarAutomovel() {
        System.out.println("\n--- Consulta de Automóvel ---");
        System.out.print("Informe a placa: ");
        String placa = scanner.nextLine().trim();

        Automovel a = buscarPorPlaca(placa);
        if (a == null) {
            System.out.println("Automóvel não encontrado.");
        } else {
            System.out.println(a);
        }
    }

    private void listarAutomoveis() {
        System.out.println("\n--- Listagem de Automóveis ---");
        System.out.println("Ordenar por:");
        System.out.println("1 - Placa");
        System.out.println("2 - Modelo");
        System.out.println("3 - Marca");
        System.out.print("Escolha a opção: ");

        int opcao = 0;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Opção inválida. Listando por placa.");
            opcao = 1;
        }

        Comparator<Automovel> comparator;

        switch (opcao) {
            case 1:
                comparator = Comparator.comparing(Automovel::getPlaca);
                break;
            case 2:
                comparator = Comparator.comparing(Automovel::getModelo);
                break;
            case 3:
                comparator = Comparator.comparing(Automovel::getMarca);
                break;
            default:
                System.out.println("Opção inválida. Listando por placa.");
                comparator = Comparator.comparing(Automovel::getPlaca);
        }

        listaAutomoveis.sort(comparator);

        if (listaAutomoveis.isEmpty()) {
            System.out.println("Nenhum automóvel cadastrado.");
        } else {
            for (Automovel a : listaAutomoveis) {
                System.out.println(a);
            }
        }
    }

    private void salvarEExit() {
        salvarDados();
        System.out.println("Dados salvos. Saindo...");
        System.exit(0);
    }

    private Automovel buscarPorPlaca(String placa) {
        for (Automovel a : listaAutomoveis) {
            if (a.getPlaca().equalsIgnoreCase(placa)) {
                return a;
            }
        }
        return null;
    }

    private void carregarDados() {
        File file = new File(ARQUIVO_DADOS);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                if (campos.length == 5) {
                    String placa = campos[0];
                    String modelo = campos[1];
                    String marca = campos[2];
                    int ano = Integer.parseInt(campos[3]);
                    double valor = Double.parseDouble(campos[4]);
                    listaAutomoveis.add(new Automovel(placa, modelo, marca, ano, valor));
                }
            }
            System.out.println("Dados carregados com sucesso.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
        }
    }

    private void salvarDados() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO_DADOS))) {
            for (Automovel a : listaAutomoveis) {
                bw.write(a.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    private int lerInt(String mensagem) {
        int valor = 0;
        boolean valido = false;
        do {
            System.out.print(mensagem);
            String entrada = scanner.nextLine().trim();
            try {
                valor = Integer.parseInt(entrada);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        } while (!valido);
        return valor;
    }

    private double lerDouble(String mensagem) {
        double valor = 0;
        boolean valido = false;
        do {
            System.out.print(mensagem);
            String entrada = scanner.nextLine().trim();
            try {
                valor = Double.parseDouble(entrada);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número decimal.");
            }
        } while (!valido);
        return valor;
    }
}
