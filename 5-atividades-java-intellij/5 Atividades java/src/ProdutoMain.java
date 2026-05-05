import java.util.Scanner;

public class ProdutoMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        System.out.println("Digite o nome do produto 1:");
        p1.nome = scan.nextLine();

        System.out.println("Digite o preço do produto 1:");
        p1.preco = scan.nextDouble();

        System.out.println("Digite a quantidade do produto 1:");
        p1.quantidade = scan.nextInt();

        scan.nextLine();

        System.out.println("\nDigite o nome do produto 2:");
        p2.nome = scan.nextLine();

        System.out.println("Digite o preço do produto 2:");
        p2.preco = scan.nextDouble();

        System.out.println("Digite a quantidade do produto 2:");
        p2.quantidade = scan.nextInt();

        System.out.println("\n--- Produto 1 ---");
        p1.exibirProduto();

        System.out.println("\n--- Produto 2 ---");
        p2.exibirProduto();

        scan.close();
    }
}