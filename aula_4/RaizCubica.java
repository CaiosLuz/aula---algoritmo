package aula_4;
import java.util.Scanner;

public class RaizCubica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para saber a raiz cúbica:");
        int numero = scanner.nextInt();

        System.out.println("A raiz cúbica do número: " + numero + " é: " + Math.cbrt(numero) );

        scanner.close();

    }
}