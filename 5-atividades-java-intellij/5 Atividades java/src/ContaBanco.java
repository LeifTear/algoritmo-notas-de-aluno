import java.util.Scanner;
public class ContaBanco {
    Scanner scan = new Scanner(System.in);
    double saldo;
    public void deposito(double valor){
        double quantidade = 0.0;
        System.out.println("Digite a quantidade que irá depositar");
        quantidade = scan.nextDouble();
        saldo = quantidade + saldo;
        System.out.println("Valor depositado");
    }
public void sacar(double valor){
    double saque;
        System.out.println("Digite a quantidade que deseja sacar");
    saque = scan.nextDouble();
    if (saque > saldo) {
        System.out.println("Erro, saldo insuficiente");
        return;
    }
saldo = saldo - saque;
    System.out.println("O valor de: " + saque + "foi retirado do seu saldo");
}
public void mostrar(){
    System.out.println("o valor atual em seu saldo é: " + saldo);
}

}
