package AtividadeExtra;
// 1.a)
public class Caixa {
    private String identificador;
    private String conteudo;
    private double peso;
    private double altura;

    public Caixa(String identificador, String conteudo, double peso, double altura) {
        this.identificador = identificador;
        this.conteudo = conteudo;
        this.peso = peso;
        this.altura = altura;
    }

    public void exibirEtiqueta(){
        System.out.println("\tConteúdo: " + this.getConteudo());
        System.out.println("\tIdentificador: " + this.getIdentificador());
        System.out.println("\tPeso: " + this.getPeso());
        System.out.println("\tAltura: " + this.getAltura());
    }

    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
