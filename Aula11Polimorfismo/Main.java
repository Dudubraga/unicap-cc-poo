package Aula11Polimorfismo;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Programador programador = new Programador("Augusto", 1000);
    Designer designer = new Designer("Maria", 1000);

    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    funcionarios.add(designer);
    funcionarios.add(programador);

    for (Funcionario funcionario : funcionarios) {
      System.out.println(funcionario.getNome());
      System.out.println(funcionario.calcularBonificacao());
      System.err.println("###");
    }
  }
}