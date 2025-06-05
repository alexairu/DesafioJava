import java.io.*;
import java.util.*;

public class AutomovelController {
    private static final String ARQUIVO_DADOS = "automoveis.txt";
    private ArrayList<Automovel> lista = new ArrayList<>();

    public AutomovelController() {
        carregar();
    }

    public boolean incluir(Automovel a) {
        if (buscarPorPlaca(a.getPlaca()) != null) return false;
        lista.add(a);
        return true;
    }

    public boolean remover(String placa) {
        Automovel a = buscarPorPlaca(placa);
        if (a != null) {
            lista.remove(a);
            return true;
        }
        return false;
    }

    public Automovel buscarPorPlaca(String placa) {
        for (Automovel a : lista) {
            if (a.getPlaca().equalsIgnoreCase(placa)) return a;
        }
        return null;
    }

    public List<Automovel> listarOrdenadoPor(String criterio) {
        Comparator<Automovel> comp = switch (criterio.toLowerCase()) {
            case "modelo" -> Comparator.comparing(Automovel::getModelo);
            case "marca" -> Comparator.comparing(Automovel::getMarca);
            default -> Comparator.comparing(Automovel::getPlaca);
        };

        List<Automovel> copia = new ArrayList<>(lista);
        copia.sort(comp);
        return copia;
    }

    public boolean alterar(String placa, String modelo, String marca, Integer ano, Double valor) {
        Automovel a = buscarPorPlaca(placa);
        if (a == null) return false;

        if (modelo != null && !modelo.isEmpty()) a.setModelo(modelo);
        if (marca != null && !marca.isEmpty()) a.setMarca(marca);
        if (ano != null) a.setAno(ano);
        if (valor != null) a.setValor(valor);
        return true;
    }

    public void salvar() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO_DADOS))) {
            for (Automovel a : lista) {
                bw.write(a.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }

    private void carregar() {
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
                    lista.add(new Automovel(placa, modelo, marca, ano, valor));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Erro ao carregar dados.");
        }
    }
}
