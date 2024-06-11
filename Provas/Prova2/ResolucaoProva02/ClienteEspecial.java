public class ClienteEspecial extends Cliente {
  private int pontos;
  private double saldoDeCompras;

  public ClienteEspecial(String nome, int idade, String cpf, String endereco, boolean bomCliente, int pontos,
      double saldoDeCompras) {
    super(nome, idade, cpf, endereco, bomCliente);

    this.pontos = 0;
    this.saldoDeCompras = 0;
  }

  @Override
  public double finalizarCompra() {
    double subtotal = super.finalizarCompra();
    double desconto = subtotal - subtotal * 0.05;
    double total = subtotal - desconto;

    double saldo = this.getSaldoDeCompras() + desconto;

    if (saldo > 100) {
      this.setPontos(this.getPontos() + 5);
      this.setSaldoDeCompras(this.getSaldoDeCompras() - 100);
    }

    return total;
  }

  public double finalizarCompra(int pontosPorItem) {
    double subtotal = 0;

    for (Item item : super.getCarrinhoDeCompras()) {
      if (pontosPorItem <= this.pontos) {
        subtotal += item.getValor();
        this.setPontos(this.getPontos() - pontosPorItem);
      }
    }

    double total = super.finalizarCompra() - subtotal;

    return total;
  }

  public int getPontos() {
    return pontos;
  }

  public void setPontos(int pontos) {
    this.pontos = pontos;
  }

  public double getSaldoDeCompras() {
    return saldoDeCompras;
  }

  public void setSaldoDeCompras(double saldoDeCompras) {
    this.saldoDeCompras = saldoDeCompras;
  }
}
