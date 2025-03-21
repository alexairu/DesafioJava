 // Calcular Imc
\
import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
    
        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Você tem um peso normal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Você está com obesidade grau 1.");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Você está com obesidade grau 2.");
        } else {
            System.out.println("Você está com obesidade grau 3 (obesidade mórbida).");
        }
        
        scanner.close();
    }
}