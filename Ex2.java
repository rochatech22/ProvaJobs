import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        int fibonacci1 = 0, fibonacci2 = 1, fibonacciAtual;

        while (fibonacci2 < numero) {
            fibonacciAtual = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacciAtual;
        }

        if (fibonacci2 == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
