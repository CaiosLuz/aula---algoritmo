package aula_4;
import java.util.Scanner;

public class PerimetroQuadrado {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado para saber o perímetro");

        int lado = scanner.nextInt();

        int perimetro = lado * 4;

        System.out.println("O perímetro do quadrado é: " + perimetro);

        scanner.close();

    }
}
