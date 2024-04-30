package Aula12Colecoes;
import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<String>();
        paises.add("Brasil");
        paises.add("Argentina");
        paises.add("Portugal");
        paises.add("Inglaterra");
        paises.add("Canadá");
        paises.add("Nova Zelândia");
        
        System.out.println("Lista de países: " + paises);
    }
}
