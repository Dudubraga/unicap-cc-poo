public class Main{
    public static void main(String[] args) {
        Item banana = new Item("banana", 1, 1.50, 
        3, true, 5);
        Item uva = new Item("uva", 2, 1.0, 
        2, true, 3);
        Item biscoito = new Item("biscoito", 3, 3.0, 
        1, true, 10);

        Cliente eduardo = new Cliente("eduardo", 19, 
        "cpf1", "end1", true);
        ClienteEspecial julia = new ClienteEspecial("julia", 19, 
        "cpf2", "end2", false, 0, 
        0);
        Funcionario lucas = new Funcionario("lucas", 19, 
        "cpf3", "end3", true, 5, 
        110, "setor", 1, 5500);

        eduardo.adicionar(biscoito);
        eduardo.adicionar(biscoito);
        eduardo.adicionar(banana);
        eduardo.adicionar(uva);
        System.out.println("Carrinho de Eduardo: ");
        for(Item i : eduardo.getCarrinhoDeCompras()){
            System.out.println("\tItem: " + i.getNome());
            System.out.println("\tQntEstoque: " + i.getQuantidadeEmEstoque());
            System.out.println("\tValor: R$" + i.getValor());
            System.out.println();
        }
        System.out.println("Total a pagar Eduardo: R$" + eduardo.finalizarCompra());

        System.out.println();
        julia.adicionar(biscoito);
        julia.adicionar(banana);
        julia.adicionar(banana);
        julia.adicionar(uva);
        System.out.println("Carrinho de Julia: ");
        for(Item i : julia.getCarrinhoDeCompras()){
            System.out.println("\tItem: " + i.getNome());
            System.out.println("\tQntEstoque: " + i.getQuantidadeEmEstoque());
            System.out.println("\tValor: R$" + i.getValor());
            System.out.println();
        }
        System.out.println("Saldo de Julia Antes: " + julia.getSaldoDeCompras());
        System.out.println("Pontos de Julia Antes: " + julia.getPontos());
        System.out.println("Total a pagar Julia: R$" + julia.finalizarCompra());
        System.out.println("Saldo de Julia Depois: " + julia.getSaldoDeCompras());
        System.out.println("Pontos de Julia Depois: " + julia.getPontos());

        System.out.println();
        lucas.renovarEstoque(5, biscoito);
        lucas.renovarEstoque(5, banana);
        lucas.renovarEstoque(5, uva);
        lucas.adicionar(biscoito);
        lucas.adicionar(biscoito);
        lucas.adicionar(uva);
        lucas.adicionar(uva);
        lucas.adicionar(uva);
        lucas.adicionar(banana);
        lucas.adicionar(banana);
        lucas.bloquearItem(banana);
        System.out.println("Carrinho de Lucas: ");
        for(Item i : lucas.getCarrinhoDeCompras()){
            System.out.println("\tItem: " + i.getNome());
            System.out.println("\tQntEstoque: " + i.getQuantidadeEmEstoque());
            System.out.println("\tValor: R$" + i.getValor());
            System.out.println();
        }
        System.out.println("Saldo de Lucas Antes: " + lucas.getSaldoDeCompras());
        System.out.println("Pontos de Lucas Antes: " + lucas.getPontos());
        System.out.println("Total a pagar Lucas: R$" + lucas.finalizarCompra());
        System.out.println("Saldo de Lucas Depois: " + lucas.getSaldoDeCompras());
        System.out.println("Pontos de Lucas Depois: " + lucas.getPontos());

    }
}