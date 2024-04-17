package Aula07ClassesAtributosEMetodos.Atividade07.Questao03;

public class Lutador {
    String nome;
    int energia;
    int forca;

    public Lutador(String nome, int energia, int forca) {
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }

    public void aplicarGolpe(Lutador lutador2){
        lutador2.energia = lutador2.energia - this.forca;
    }

}
