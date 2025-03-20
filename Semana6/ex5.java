 // Exercício 5: Números primos em um intervalo
 import java.util.Scanner;

 public class ExerciciosRepeticao {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Digite o número inicial do intervalo: ");
         int inicio = scanner.nextInt();
         System.out.print("Digite o número final do intervalo: ");
         int fim = scanner.nextInt();
         System.out.println("Números primos no intervalo: ");
         for (int i = inicio; i <= fim; i++) {
             if (ehPrimo(i)) {
                 System.out.print(i + " ");
             }
         }
         scanner.close();
     }
     
     public static boolean ehPrimo(int num) {
         if (num < 2) return false;
         for (int i = 2; i <= Math.sqrt(num); i++) {
             if (num % i == 0) return false;
         }
         return true;
     }
 }
  