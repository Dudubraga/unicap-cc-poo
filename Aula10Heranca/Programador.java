public class Programador extends Funcionarios {
    private String linguagem;
    
    public Programador(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public double calcularBonificacao(){
        double bonificacao = this.getSalario() * 0.2;
        return bonificacao;
    }
    
    public String getLinguagem() {
        return linguagem;
    }
    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
