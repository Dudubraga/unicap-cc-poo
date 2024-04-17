package Aula08AbstracaoEEncapsulamento.Atividade08.Questao01;

public class ContaBancaria {
    private String nome;
    private String numeroConta;
    private double saldo;
    
    public ContaBancaria(String nome, String numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
