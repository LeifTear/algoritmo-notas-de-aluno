import java.util.Scanner;

public class intervalodevalores {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A, B, maior;

        System.out.println("Digite o primeiro valor inteiro:");
        A = scan.nextInt();

        System.out.println("Digite o segundo valor inteiro:");
        B = scan.nextInt();

        if (A > B) {
            maior = A;
        } else {
            maior = B;
        }

        System.out.println("Maior valor: " + maior);

        if (maior >= 1 && maior <= 99) {
            System.out.println("Está entre 1 e 99");
        } else if (maior >= 100 && maior <= 199) {
            System.out.println("Está entre 100 e 199");
        } else {
            System.out.println("É maior que 200");
        }

        scan.close();
    }
}