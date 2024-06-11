public class ClienteEspecial extends Cliente{
    private int pontos;
    private double saldoDeCompras;
    
    public ClienteEspecial(String nome, int idade, String cpf, String endereco, boolean bomCliente, int pontos,
            double saldoDeCompras) {
        super(nome, idade, cpf, endereco, bomCliente);
        this.pontos = pontos;
        this.saldoDeCompras = saldoDeCompras;
    }

    public double finalizarCompra(){
        double total = 0;
        for(Item i : getCarrinhoDeCompras()){
            if(!i.isDisponibilidade() || i.getQuantidadeEmEstoque() <= 0){
                System.out.println("\tItem " + i.getNome() + " indisponivel ou fora de estoque");
            }else{
                if(this.pontos >= i.getValorPontos()){
                    System.out.println("\tItem " + i.getNome() + " comprado com Pontos");
                    i.setQuantidadeEmEstoque(i.getQuantidadeEmEstoque()-1);
                    this.pontos -= i.getValorPontos();
                }else{
                    total += i.getValor();
                    i.setQuantidadeEmEstoque(i.getQuantidadeEmEstoque()-1);
                    System.out.println("\tItem " + i.getNome() + " comprado");
                }
            }
        }
        getCarrinhoDeCompras().clear();
        
        double desconto = ((total / 100) * 5);
        System.out.println("Desconto de 5%: R$" + desconto);
        this.saldoDeCompras += desconto;
        if(getSaldoDeCompras() >= 100){
            this.saldoDeCompras -= 100;
            this.pontos += 5;
        }
        return total - desconto;
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
