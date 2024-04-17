package Aula11Polimorfismo;

public class Designer extends Funcionario {

  public Designer(String nome, double salario) {
    super(nome, salario);
  }

  @Override
  public double calcularBonificacao() {
    return this.getSalario() * 0.1;
  }

}
