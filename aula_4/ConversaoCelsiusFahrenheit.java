package aula_4;
import java.util.Scanner;

public class ConversaoCelsiusFahrenheit {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em celsius para converter em fahrenheit");
        double celsius = scanner.nextInt();

        // a variavel do tipo double serve para armazenar números com casas decimais em alta precisão
        // Fórmula: F = C.1,8+32

        double fahrenheit = celsius * 1.8 + 32;

        System.out.println(celsius +"°C em Fahrenheit é: " + fahrenheit + "°F");

        scanner.close();

    }
}
