import java.util.Scanner;

public class combustivel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double consumo, distancia, consumomedio, milhas;
        System.out.println("Digite a distância percorrida em kilômetros por hora");
        distancia = scan.nextDouble();
        System.out.println("Digite o total de combustível consumido");
        consumo = scan.nextDouble();
        consumomedio = distancia / consumo;
        milhas = consumomedio * 2.352;
        System.out.println("O consumo em km/l foi de: " + consumomedio);
        System.out.println("O consumo em mp/l foi de: " + milhas);
        scan.close();
    }
}