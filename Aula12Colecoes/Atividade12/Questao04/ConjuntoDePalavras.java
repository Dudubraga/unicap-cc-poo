package Aula12Colecoes.Atividade12.Questao04;
import java.util.*;

public class ConjuntoDePalavras {
    HashSet<String>set;

    public ConjuntoDePalavras(String palavas) {
        set = new HashSet<String>();
        String[] aux = palavas.split(",", 0);
        for(String s : aux){
            set.add(s);
        }
    }

    public boolean contemTodas(String palavras){
        String[] aux = palavras.split(",", 0);
        int contador = 0;
        for(String s : aux){
            if(set.contains(s)){ contador++; }
        }
        if(contador == set.size()){
            return true;
        }
        return false;
    }
    
}
