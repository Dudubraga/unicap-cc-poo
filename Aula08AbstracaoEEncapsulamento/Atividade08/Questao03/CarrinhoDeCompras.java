package Aula08AbstracaoEEncapsulamento.Atividade08.Questao03;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<String>lista;

    public CarrinhoDeCompras() {
        this.lista = new ArrayList<>();
    }

    public void adicionarItem(String item){
        this.lista.add(item);
    }
    public void removerItem(String item){
        this.lista.remove(item);
    }
    public void listarItens(){
        if(!lista.isEmpty()){
            System.out.println("Itens no Carrinho:");
            for(String s : this.lista){
                System.out.println("\t" + s);
            }
        }else{
            System.out.println("O carrinho está vazio.");
        }
        System.out.println();
    }
    
}
