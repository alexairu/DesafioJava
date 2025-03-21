import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = sc.nextDouble();

        double volume = (4.0 / 3.0) * 3.14159 * raio * raio * raio;

        System.out.println("O volume da esfera é: " + volume);

        sc.close();
    }
}