package Aula12Colecoes;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> mamiferos = new HashSet<String>();
        mamiferos.add("Cavalo");
        mamiferos.add("Macaco");
        mamiferos.add("Cachorro");
        mamiferos.add("Porco");
        mamiferos.add("Elefante");

        System.out.println("Set de mamíferos: " + mamiferos);
        
        SortedSet<Integer> notas = new TreeSet<Integer>();
        notas.add(8);
        notas.add(5);
        notas.add(7);
        notas.add(10);
        notas.add(2);

        System.out.println("Set de notas em ordem: " + notas);
    }
}