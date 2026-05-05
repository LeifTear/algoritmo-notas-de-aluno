import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();
        Scanner scan = new Scanner(System.in);

        String nome;
        int opcao = 0;

        System.out.println("Digite seu nome");
        nome = scan.nextLine();

        while (opcao != 4) {
            System.out.println("\n O que gostaria de fazer "+ nome+"?");
            System.out.println("1 - Mostrar saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sair");

            opcao = scan.nextInt();

            if (opcao == 1) {
                conta.mostrar();

            } else if (opcao == 2) {
                conta.sacar(0);

            } else if (opcao == 3) {
                conta.deposito(0);

            } else if (opcao == 4) {
                System.out.println("Saindo...");

            } else {
                System.out.println("Opção inválida!");
            }
        }

        scan.close();
    }
}