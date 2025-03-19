import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("idade: ");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("menor");
        } else if (idade >= 18 && idade <= 60) {
            System.out.println("adulto");
        } else {
            System.out.println("idoso");
        }

        scanner.close();
    }
}
