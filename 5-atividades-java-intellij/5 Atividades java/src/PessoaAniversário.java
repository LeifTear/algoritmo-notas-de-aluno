import java.util.Scanner;

public class PessoaAniversário {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Pessoa p1 = new Pessoa();

        System.out.println("Digite o nome:");
        p1.nome = scan.nextLine();

        System.out.println("Digite a idade:");
        p1.idade = scan.nextInt();

        System.out.println("\nDeseja fazer aniversário? (S/N): ");
        String resposta = scan.next();

        if (resposta.equalsIgnoreCase("S")) {
            p1.fazerAniversario();
        } else {
            System.out.println("\nOk");
        }

        p1.apresentar();

        scan.close();
    }
}