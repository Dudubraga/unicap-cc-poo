package AtividadeExtra;
// 1.b)
public class CaixaFragil extends Caixa {
    private double pesoMax;

    public CaixaFragil(String identificador, String conteudo, double peso, double altura, double pesoMax) {
        super(identificador, conteudo, peso, altura);
        this.pesoMax = pesoMax;
    }

    public void exibirEtiqueta(CaixaFragil caixa){
        System.out.println("Identificador: " + caixa.getIdentificador());
        System.out.println("Conteúdo: " + caixa.getConteudo());
        System.out.println("Peso: " + caixa.getPeso());
        System.out.println("Altura: " + caixa.getAltura());
        System.out.println("Peso Máximo Suportado: " + getPesoMax());
    }

    public double getPesoMax() {
        return pesoMax;
    }
    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }
}
