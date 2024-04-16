public class Designer extends Funcionarios {
    private String softwareEdicao;
    // create da classe (super -> referencia a super classe dessa subclasse)
    public Designer(String nome, double salario) {
        super(nome, salario);
    }
    // metodo abstrato herdado da classe funcionarios
    public double calcularBonificacao(){
        double bonificacao = this.getSalario() * 0.1;
        return bonificacao;
    }
    // gets & sets
    public String getSoftwareEdicao() {
        return softwareEdicao;
    }
    public void setSoftwareEdicao(String softwareEdicao) {
        this.softwareEdicao = softwareEdicao;
    }

}
