public class Trabalhador {
    private String nome;
    private int idade;
    private double valor_hora;
    private int horas_trabalhadas;
    private boolean ferias;

    public Trabalhador(String nome, int idade, double valor_hora, int horas_trabalhadas, boolean ferias) {
        setNome(nome);
        setIdade(idade);
        setValor_hora(valor_hora);
        setHoras_trabalhadas(horas_trabalhadas);
        setFerias(ferias);
    }

    public void ferias(){
        if(this.isFerias() == true){
            this.setFerias(false);
        }else{
            this.setFerias(true);
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValor_hora() {
        return valor_hora;
    }
    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }

    public int getHoras_trabalhadas() {
        return horas_trabalhadas;
    }
    public void setHoras_trabalhadas(int horas_trabalhadas) {
        this.horas_trabalhadas = this.horas_trabalhadas + horas_trabalhadas;
    }

    public boolean isFerias() {
        return ferias;
    }
    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }

}
