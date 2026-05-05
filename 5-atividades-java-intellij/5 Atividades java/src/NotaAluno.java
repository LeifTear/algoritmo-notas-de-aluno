import java.util.Scanner;
public class NotaAluno {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno a1 = new Aluno();

        System.out.println("Digite o nome do aluno:");
        a1.nome = scan.nextLine();

        System.out.println("Digite a nota 1:");
        a1.nota1 = scan.nextDouble();

        System.out.println("Digite a nota 2:");
        a1.nota2 = scan.nextDouble();

        System.out.println("\n--- Resultado ---");
        System.out.println("Nome: " + a1.nome);
        System.out.println("Média: " + a1.calcularMedia());
        a1.verificarSituacao();

        scan.close();
    }
}