import java.util.Scanner;

public class conversao {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double dolar, cotacao, real;
        System.out.println("Digite o valor em dólar");
        dolar = scan.nextDouble();
        System.out.println("Digite a cotação de dólar para real");
        cotacao = scan.nextDouble();
        real = dolar * cotacao;
        System.out.println("O valor em real é de: R$" + real);

        scan.close();


    }
}