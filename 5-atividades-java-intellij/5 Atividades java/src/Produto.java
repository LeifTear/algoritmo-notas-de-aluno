public class Produto {

    String nome;
    double preco;
    int quantidade;

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public void exibirProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: " + calcularValorTotal());
    }
}