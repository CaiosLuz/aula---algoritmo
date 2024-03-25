package aula_4;
import java.util.Scanner;

public class PerimetroRetangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base do retângulo:");
        int base = scanner.nextInt();

        System.out.println("Digite o valor da altura do retângulo:");
        int altura = scanner.nextInt();

        int perimetro = 2 * (base + altura);

        System.out.println("O perímetro do retângulo é: " + perimetro);

        scanner.close();

    }
}
