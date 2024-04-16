public class Programador extends Funcionarios implements Professor {
    private String linguagem;
    // create da classe (super -> referencia a super classe dessa subclasse)
    public Programador(String nome, double salario) {
        super(nome, salario);
    }
    // metodo abstrato herdado da classe funcionarios
    public double calcularBonificacao(){
        double bonificacao = this.getSalario() * 0.2;
        return bonificacao;
    }
    // metodo implementado da classe professor
    public void darAula(){
        System.out.println("Dando Aula");
    }
    // gets & sets
    public String getLinguagem() {
        return linguagem;
    }
    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

}
