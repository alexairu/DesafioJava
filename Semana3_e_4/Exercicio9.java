
import java.util.Scanner;

public class DistanciaEntrePontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as coordenadas do primeiro ponto (x1, y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Digite as coordenadas do segundo ponto (x2, y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("A distância entre os pontos é: " + distancia);

        sc.close(); // boa pratica somente :)
    }
}
