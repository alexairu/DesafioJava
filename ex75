package dominio;

public class CaixaEletronico {
    private double saldo;

    public CaixaEletronico(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) {
        if (valor % 10 != 0) {
            System.out.println("Erro: O valor do saque deve ser múltiplo de R$ 10.");
        } else if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}

package controle;

import dominio.CaixaEletronico;
import java.util.Scanner;

public class SimuladorCaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o saldo inicial do caixa eletrônico: ");
        double saldoInicial = scanner.nextDouble();
        CaixaEletronico caixa = new CaixaEletronico(saldoInicial);
        
        int opcao;
        do {
            System.out.println("\n=== Caixa Eletrônico ===");
            System.out.println("1. Sacar");
            System.out.println("2. Exibir Saldo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor do saque: ");
                    double valor = scanner.nextDouble();
                    caixa.sacar(valor);
                    break;
                case 2:
                    caixa.exibirSaldo();
                    break;
                case 3:
                    System.out.println("Encerrando operações...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);
        
        scanner.close();
    }
}
