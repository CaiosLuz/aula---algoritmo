package aula4_ac1;
import java.util.Scanner;

public class CalculoJurosSimples {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do capital inicial:");
        double capital = scanner.nextDouble();

        System.out.println("Digite o valor da taxa de juros:");
        double taxa = scanner.nextDouble();

        // Converter a taxa para decimal para realizar a operação

        double taxaDecimal = taxa / 100;

        System.out.println("Digite o tempo de aplicação em anos:");
        double tempo = scanner.nextDouble();

        // Fórmula: J (juros) = C (capital inicial) * I (taxa/juros) * T (tempo)

        double juros = capital * taxaDecimal * tempo;

        System.out.println("O juros de R$" + capital + " aplicado em " + tempo + " anos é de R$" + juros);

        scanner.close();

    }
}
