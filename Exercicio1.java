import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = sc.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("A área do retângulo é: " + area);
        System.out.println("O perímetro do retângulo é: " + perimetro);

        sc.close(); // boa pratica somente :)
    }
}