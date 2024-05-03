package Aula12Colecoes.Atividade12.Questao01;

public class Circulo{
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    double calcularArea(){
        return 3.14 * (this.raio * this.raio);
    }
}