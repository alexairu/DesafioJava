import java.util.Scanner;

public class raio {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o valor do Raio: ");
        double raio = sc.nextDouble();

        double pi = 3.14;

        double area = pi * Math.pow(raio, 2); //Não usei chat, fui entender como fazer expoente. 

        System.out.print("A área do círculo é: " + area);

        sc.close(); // boa prática, NÃO OBRIGATÓRIA. 

    }
}