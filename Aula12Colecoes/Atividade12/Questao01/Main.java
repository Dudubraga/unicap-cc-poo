package Aula12Colecoes.Atividade12.Questao01;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Circulo>circulos = new ArrayList<>(5);
        for(int i = 1; i <= 5; i++){
            Circulo c = new Circulo(i);
            circulos.add(c);
        }
        for(Circulo c : circulos){
            System.out.println("Área do círculo de raio: " + c.raio + " = " + c.calcularArea());
        }
    }
}
