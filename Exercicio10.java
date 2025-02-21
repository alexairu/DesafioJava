
import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int anos = sc.nextInt();

        int dias = anos * 365;

        System.out.println("Você viveu aproximadamente " + dias + " dias.");
        
        sc.close(); // boa prática somente :)
    }
}
