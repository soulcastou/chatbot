import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de términos de la serie de Fibonacci: ");
        int n = scanner.nextInt();

        int num1 = 0, num2 = 1;

        System.out.print("Serie de Fibonacci hasta " + n + " términos: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");

            // Calcular el siguiente número de la serie
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
