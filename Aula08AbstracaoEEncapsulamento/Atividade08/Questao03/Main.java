package Aula08AbstracaoEEncapsulamento.Atividade08.Questao03;
//import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList<String>lista = new ArrayList<>();
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Maça");
        carrinho.adicionarItem("Banana");
        carrinho.adicionarItem("Pera");
        carrinho.adicionarItem("Uva");
        carrinho.adicionarItem("Melancia");

        carrinho.listarItens();
        
        carrinho.removerItem("Pera");
        
        carrinho.listarItens();
    }
}
