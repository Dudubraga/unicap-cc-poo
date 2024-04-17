package Aula08AbstracaoEEncapsulamento.Atividade08.Questao02;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double velocidade; // velocidade em km/h
    
    public Carro(String marca, String modelo, int anoFabricacao, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidade = velocidade;
    }

    public void acelerar(double v){
        this.velocidade += v; // aumenta a velocidade em v km/h
    }
    public void desacelerar(double v){
        this.velocidade -= v; // diminui a velocidade em v km/h
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
