package Atividade10;

public class Funcionario {
    private String nome;
    private String inscricao;
    private double salario;
    private String turno;

    public Funcionario(String nome, String inscricao, double salario, String turno) {
        this.nome = nome;
        this.inscricao = inscricao;
        this.salario = salario;
        this.turno = turno;
    }
    
    public void horariosDisponiveis(){
        /* */
    }
    public void horarioTrabalho(){
        /* */
    }
    public void informacoesFuncionaio(){
        /* */
    }
    public void funcaoDesempenhar(){
        /* */
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getInscricao() {
        return inscricao;
    }
    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
}
