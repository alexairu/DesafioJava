  // Exercício 3: Contagem regressiva usando do-while
  import java.util.Scanner;

  public class ExerciciosRepeticao {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Digite um número para contagem regressiva: ");
          int numero = scanner.nextInt();
          do {
              System.out.println(numero);
              numero--;
          } while (numero >= 0);
  
  