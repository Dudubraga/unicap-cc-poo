package Aula08AbstracaoEEncapsulamento;

public class Carro {
    private String cor;
    private String modelo;
    private String tipoCambio;
    private String marca;

    public Carro(String cor, String modelo, String tipoCambio, String marca){
        this.cor = cor;
        this.modelo = modelo;
        this.tipoCambio = tipoCambio;
        this.marca = marca;
    }

    String getMarca(){
        return this.marca;
    }
    void setMarca(String marca){
        this.marca = marca;
    }
    public String getCor() {
        return cor;
    }
    public String getModelo() {
        return modelo;
    }
    public String getTipoCambio() {
        return tipoCambio;
    }
}
