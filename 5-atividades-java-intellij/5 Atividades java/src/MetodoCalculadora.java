public class MetodoCalculadora {
    int a, b;
    public int somar(int a, int b) {
        return a + b;
    }
    public int subtrair(int a, int b) {
        return a - b;
    }
    public int multiplicar(int a, int b) {
        return a * b;
    }
    public int dividir(int a, int b) {
        if (b == 0){
            System.out.println("Não existe divisão por 0");
            return 0;
        }
else {
        return a / b;}
    }
}
