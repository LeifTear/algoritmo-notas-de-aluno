import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.println("Digite a temperatura em Celsius:");
        celsius = scan.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        scan.close();
    }
}