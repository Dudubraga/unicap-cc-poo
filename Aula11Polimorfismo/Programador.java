package Aula11Polimorfismo;

interface Professor {
  public void darAula();
}

public class Programador extends Funcionario implements Professor {
  public Programador(String nome, double salario) {
    super(nome, salario);
  }

  @Override
  public double calcularBonificacao() {
    return this.getSalario() * 0.2;
  }

  @Override
  public void darAula() {
    System.out.println("AULAAAA");
  }
}