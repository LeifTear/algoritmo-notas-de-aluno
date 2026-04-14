import java.util.Scanner;

public class custodocarro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double custofabrica, impostos, distribuidor, custofinal;
        System.out.println("Digite o custo de fábrica");
        custofabrica = scan.nextDouble();
        impostos = custofabrica * 0.45;
        distribuidor = (custofabrica + impostos) * 0.28;
        custofinal = custofabrica + impostos + distribuidor;
        System.out.println("Custo ao consumidor é: R$" + custofinal);

        scan.close();
    }
}