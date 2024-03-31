package aula5_ac1;
import java.util.Scanner;

public class MediaFacens {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota da AC1 (Avaliação Continuada 1):");
        Double notaAC1 = 0.15*scanner.nextDouble();

        System.out.println("Digite a nota da AC2 (Avaliação Continuada 2):");
        Double notaAC2 = 0.30*scanner.nextDouble();

        System.out.println("Digite a nota da AG (Avaliação Geral):");
        Double notaAG = 0.10*scanner.nextDouble();

        System.out.println("Digite a nota da AF (Avaliação final):");
        Double notaAF = 0.45*scanner.nextDouble();

        Double mediaFinal = notaAC1 + notaAC2 + notaAF + notaAG;

        System.out.println("A média final do aluno é: " + mediaFinal);

        scanner.close();

    }
}
