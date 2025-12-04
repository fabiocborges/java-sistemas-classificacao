import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        int temperatura = scanner.nextInt();

        if (temperatura < 10) {
            System.out.println("Muito Frio");
        } else if (temperatura <= 19) {
            System.out.println("Frio");
        } else if (temperatura <= 29) {
            System.out.println("Agradável");
        } else {
            System.out.println("Quente");
        }

        scanner.close();
    }
}
