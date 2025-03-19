import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n1: ");
        double num1 = scanner.nextDouble();

        System.out.print("n2: ");
        double num2 = scanner.nextDouble();

        System.out.print(" operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        switch (operacao) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("divisão por zero .");
                }
                break;
            default:
                System.out.println("inválida.");
        }

        scanner.close();
    }
}
