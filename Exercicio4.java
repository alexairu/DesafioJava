import java.util.Scanner; 

public class salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário:");
        double salario = sc.nextDouble(); 

        System.out.print("Digite o desconto:");
        double desconto = sc.nextDouble(); 

        double salarioFinal = salario - desconto;

        System.out.println("Seu salário final é de: " + salarioFinal);

        sc.close();


    }
}