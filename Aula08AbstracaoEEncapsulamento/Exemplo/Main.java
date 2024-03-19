package Aula08AbstracaoEEncapsulamento.Exemplo;

public class Main {
    public static void main(String[] args) {
        Carro carroEduardo = new Carro("preto", "modelX", 
        "automático", "tesla");
        
        System.out.println(carroEduardo.getMarca());
        carroEduardo.setMarca("tesla");
        System.out.println(carroEduardo.getMarca());
    }
}
