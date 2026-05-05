import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao, a , b;
        MetodoCalculadora calcular = new MetodoCalculadora();
        System.out.println("Qual operação deseja fazer? " +
                "1 - Soma " +
                "2 - Subtração " +
                "3 - Divisão " +
                "4 - Multiplicação");
        opcao = scan.nextInt();
        System.out.println("Digite o primeiro número da operação");
        a = scan.nextInt();
        System.out.println("Digite o segundo número da operação");
        b = scan.nextInt();
        if (opcao == 1) {
            System.out.println("A soma é: " + calcular.somar(a, b));
        } else if (opcao == 2) {
            System.out.println("A subtração é: " + calcular.subtrair(a, b));
        } else if (opcao == 3) {
            System.out.println("A divisão é:" + calcular.dividir(a, b));
        } else if (opcao ==4) {
            System.out.println("A multiplicação é:" + calcular.multiplicar(a, b));
        } else {
            System.out.println("Erro, o número da opção foi inválido (1 a 4)");

        }

    }
}
