import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua nota (0 a 10): ");
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("Resultado: Aprovado");
        } else if (nota >= 5) {
            System.out.println("Resultado: Recuperação");
        } else {
            System.out.println("Resultado: Reprovado");
        }

        scanner.close();
    }
}

