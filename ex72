package dominio;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private String categoria;

    public Funcionario(String nome, double salarioBase, String categoria) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.categoria = categoria;
    }

    public double calcularSalarioFinal() {
        double salarioFinal = salarioBase;
        
        switch (categoria.toUpperCase()) {
            case "A":
                salarioFinal += salarioBase * 0.20;
                break;
            case "B":
                salarioFinal += salarioBase * 0.10;
                break;
            case "C":
                // Sem bônus
                break;
            default:
                System.out.println("Categoria inválida! Considerando sem bônus.");
        }
        
        return salarioFinal;
    }

    public void exibirSalarioFinal() {
        System.out.println("Salário final de " + nome + ": R$" + calcularSalarioFinal());
    }
}

package controle;

import dominio.Funcionario;
import java.util.Scanner;

public class GerenciadorFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o nome do funcionário: ");
        String nome = scanner.nextLine();
        
        System.out.print("Informe o salário base: ");
        double salarioBase = scanner.nextDouble();
        
        System.out.print("Informe a categoria (A, B ou C): ");
        String categoria = scanner.next().toUpperCase();
        
        Funcionario funcionario = new Funcionario(nome, salarioBase, categoria);
        funcionario.exibirSalarioFinal();
        
        scanner.close();
    }
}