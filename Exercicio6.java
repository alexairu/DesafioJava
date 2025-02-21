import java.util.Scanner;

public class ConversaoMoeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em reais (R$): ");
        double reais = sc.nextDouble();

        System.out.print("Digite a cotação do dólar (US$): ");
        double cotacao = sc.nextDouble();

        double dolares = reais * cotacao;

        System.out.println("O valor em dólares (US$) é: " + dolares);

        sc.close(); // boa prática somente :)
    }
}