    // Exercício 4: Média de notas de uma turma
    import java.util.Scanner;

    public class ExerciciosRepeticao {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a quantidade de alunos na turma: ");
            int alunos = scanner.nextInt();
            double totalNotas = 0;
            for (int i = 1; i <= alunos; i++) {
                System.out.print("Digite a nota do aluno " + i + ": ");
                totalNotas += scanner.nextDouble();
            }
            double media = totalNotas / alunos;
            System.out.println("A média da turma é: " + media);
        