package Aula07ClassesAtributosEMetodos.Atividade07.Questao03;

public class Main {
    public static void main(String[] args) {
        Lutador lutador = new Lutador("Ryu", 100, 10);
        Lutador inimigo = new Lutador("Bison", 100, 12);
        
        System.out.println("Ryu atacou Bison");
        for(int i = 0; i < 3; i++){
            lutador.aplicarGolpe(inimigo);
        }
        System.out.println("Bison ficou com " + inimigo.energia + " de energia");
        System.out.println("Bison atacou Ryu");
        for(int i = 0; i < 8; i++){
            inimigo.aplicarGolpe(lutador);
        }
        System.out.println("Ryu ficou com " + lutador.energia + " de energia");
    }   
}
