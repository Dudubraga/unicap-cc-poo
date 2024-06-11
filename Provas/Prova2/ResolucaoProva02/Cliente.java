import java.util.ArrayList;

/**
 * Cliente
 */
public class Cliente {
  private String nome;
  private int idade;
  private String cpf;
  private String endereco;
  private boolean bomCliente;
  private ArrayList<Item> carrinhoDeCompras = new ArrayList<>();

  public Cliente(String nome, int idade, String cpf, String endereco, boolean bomCliente) {
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
    this.endereco = endereco;
    this.bomCliente = bomCliente;
  }

  public void adicionar(Item item) {
    if (this.carrinhoDeCompras.size() > 100) {
      throw new Error("Carrinho cheio.");
    }
    this.carrinhoDeCompras.add(item);
  }

  public void cancelar(int codigo) {
    for (Item item : carrinhoDeCompras) {
      if (codigo == item.getCodigo()) {
        this.carrinhoDeCompras.remove(item);
        break;
      }
    }
  }

  public double finalizarCompra() {
    double total = 0;

    for (Item item : carrinhoDeCompras) {
      total += item.getValor();
      item.setQuantidadeEmEstoque(item.getQuantidadeEmEstoque() - 1);
    }

    return total;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public boolean isBomCliente() {
    return bomCliente;
  }

  public void setBomCliente(boolean bomCliente) {
    this.bomCliente = bomCliente;
  }

  public ArrayList<Item> getCarrinhoDeCompras() {
    return carrinhoDeCompras;
  }

  public void setCarrinhoDeCompras(ArrayList<Item> carrinhoDeCompras) {
    this.carrinhoDeCompras = carrinhoDeCompras;
  }

}