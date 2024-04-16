public abstract class Funcionarios{
    private String nome;
    private double salario;
    // create da classe
    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    // metodo abstrato que deve ser herdado por todas as subclasses
    public abstract double calcularBonificacao();
    // gets & sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}