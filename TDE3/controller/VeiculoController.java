package controller;

import model.*;
import model.excecao.*;

import java.util.ArrayList;
import java.util.List;

public class VeiculoController {
    private List<Veiculo> veiculos = new ArrayList<>();

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            for (Veiculo v : veiculos) {
                v.exibirDetalhes();
            }
        }
    }

    public void atualizarVeiculo(String placa, String novaMarca, String novoModelo) throws VeiculoNaoEncontradoException {
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                v.setMarca(novaMarca);
                v.setModelo(novoModelo);
                System.out.println("Veículo atualizado com sucesso!");
                return;
            }
        }
        throw new VeiculoNaoEncontradoException("Veículo com placa " + placa + " não encontrado.");
    }

    public void removerVeiculo(String placa) throws VeiculoNaoEncontradoException {
        Veiculo veiculoRemover = null;
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                veiculoRemover = v;
                break;
            }
        }
        if (veiculoRemover != null) {
            veiculos.remove(veiculoRemover);
            System.out.println("Veículo removido com sucesso!");
        } else {
            throw new VeiculoNaoEncontradoException("Veículo com placa " + placa + " não encontrado.");
        }
    }
}
