
import java.util.Scanner; 

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2= sc.nextDouble();

        double soma = num1 + num2;

        System.out.println("O resultado da soma é equivalente a: " + soma);

        // sc.close(); (boa prática somente, NÃO OBRIGATÓRIO)


        }
}
