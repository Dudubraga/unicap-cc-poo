public class Programador extends Funcionarios {
    private String linguagem;

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
