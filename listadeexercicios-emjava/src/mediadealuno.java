import java.util.Scanner;

public class mediadealuno {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        double n1, n2, n3, media;

        System.out.println("Digite o nome do aluno:");
        nome = scan.nextLine();

        System.out.println("Nota 1:");
        n1 = scan.nextDouble();

        System.out.println("Nota 2:");
        n2 = scan.nextDouble();

        System.out.println("Nota 3:");
        n3 = scan.nextDouble();

        media = (n1 + n2 + n3) / 3;

        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media <= 5) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Recuperação");
        }

        scan.close();
    }
}