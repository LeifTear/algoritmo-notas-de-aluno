public class Pessoa {

    String nome;
    int idade;

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public void fazerAniversario() {
        idade++;
        System.out.println("Parabéns" + nome + "!" + "Agora você tem " + idade + " anos.");
    }
}