package aula_4;
import java.util.Scanner;

public class CalculoJurosSimples {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do capital inicial");
        double capital = scanner.nextDouble();

        System.out.println("Digite o valor da taxa de juros");
        double taxa = scanner.nextDouble();

        double taxaDecimal = taxa / 100;

        System.out.println("Digite o tempo de aplicação em anos");
        double tempo = scanner.nextDouble();

        double juros = capital * taxaDecimal * tempo;

        System.out.println("O juros de " + capital + " é de: " + juros);

        scanner.close();

    }
}
