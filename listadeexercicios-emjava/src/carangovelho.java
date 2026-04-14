import java.util.Scanner;

public class carangovelho
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ano;
        double valor, desconto, valorFinal;
        int totalAte2010 = 0;
        int totalGeral = 0;
        String resposta;

        do {
            System.out.println("Digite o valor do carro:");
            valor = scan.nextDouble();

            System.out.println("Digite o ano do carro:");
            ano = scan.nextInt();

            if (ano <= 2010) {
                desconto = valor * 0.12;
                totalAte2010++;
            } else {
                desconto = valor * 0.07;
            }

            valorFinal = valor - desconto;

            System.out.println("Valor do desconto: " + desconto);
            System.out.println("Valor final: " + valorFinal);

            totalGeral++;

            System.out.println("Deseja continuar? (S/N): ");
            resposta = scan.next();

        } while (!resposta.equalsIgnoreCase("N"));

        System.out.println("Total de carros até 2010: " + totalAte2010);
        System.out.println("Total geral de carros: " + totalGeral);

        scan.close();
    }
}