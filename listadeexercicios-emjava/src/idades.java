import java.util.Scanner;

public class idades {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;

        for (int i = 1; i <= 75; i++) {

            System.out.println("Digite a idade da pessoa " + i + ": ");
            idade = scan.nextInt();

            if (idade >= 60) {
                System.out.println("Idoso");
            }
            else if (idade >= 18) {
                System.out.println("Maior de idade");
            }
            else {
                System.out.println("Menor de idade");
            }
        }

        scan.close();
    }
}