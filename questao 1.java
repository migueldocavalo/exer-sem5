import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("é par");
        } else {
            System.out.println("é ímpar");
        }

        scanner.close();
    }
}
