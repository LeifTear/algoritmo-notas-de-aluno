import java.util.Scanner;

public class Tabuada {

    public static void tabuada(int N, String O, int T) {

        for (int i = 1; i <= T; i++) {

            int resultado = 0;

            if (O.equals("S")) {
                resultado = N + i;
                System.out.println("A soma: " + N + " + " + i + " = " + resultado);
            }
            else if (O.equals("M")) {
                resultado = N * i;
                System.out.println("A multiplicação: " + N + " * " + i + " = " + resultado);
            }
            else if (O.equals("D")) {
                resultado = N / i;
                System.out.println("A divisão: " + N + " / " + i + " = " + resultado);
            }
            else if (O.equals("Sub")) {
                resultado = N - i;
                System.out.println("A subtração: " + N + " - " + i + " = " + resultado);
            }
            else {
                System.out.println("Operador inválido!");
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N, T;
        String O;

        System.out.println("Digite o valor da tabuada:");
        N = scan.nextInt();

        System.out.println("Digite o operador (S, M, D, Sub):");
        O = scan.next();

        System.out.println("Digite até onde vai:");
        T = scan.nextInt();

        tabuada(N, O, T);

        scan.close();
    }
}