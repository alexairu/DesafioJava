  // Exercício 2: Tabuada de um número
import java.util.Scanner;

public class ExerciciosRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver sua tabuada: ");
        int num = scanner.nextInt();
        int contador = 1;
        while (contador <= 10) {
            System.out.println(num + " x " + contador + " = " + (num * contador));
            contador++;
        }

