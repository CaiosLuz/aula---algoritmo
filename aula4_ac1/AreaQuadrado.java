package aula4_ac1;
import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado para saber a área");

        int lado = scanner.nextInt();

        // Fórmula: A = L.L

        int area = lado * lado;

        System.out.println("A área do quadrado é: " + area);

        scanner.close();

    }
}
