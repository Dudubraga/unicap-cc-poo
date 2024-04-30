package Aula12Colecoes;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> estoque = new HashMap<String, Integer>();
        estoque.put("Banana", 2);
        estoque.put("Maça", 5);
        estoque.put("Pera", 7);
        estoque.put("Uva", 15);
        
        System.out.println("Mapa de estoque: " + estoque);
        
        SortedMap<Integer, String> votacao = new TreeMap<Integer, String>();
        votacao.put(2, "Eduardo");
        votacao.put(5, "Julia");
        votacao.put(7, "Lucas");
        votacao.put(15, "Augusto");
    
        System.out.println("Mapa ordenado de votação: " + votacao);
    }
}
