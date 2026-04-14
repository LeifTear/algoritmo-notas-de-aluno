import java.util.Scanner;

public class rendimento {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double deposito, rendimento, total;

        System.out.println("Digite o valor depositado:");
        deposito = scan.nextDouble();

        rendimento = deposito * 0.007;
        total = deposito + rendimento;

        System.out.println("Valor após 1 mês: " + total);

        scan.close();
    }
}