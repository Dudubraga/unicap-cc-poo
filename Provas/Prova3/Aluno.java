public class Aluno extends Usuario implements IOperacoes{
    private String curso;
    private String matricula;
    private double[] notas;
    private boolean[] presencas;
    private boolean status;
    
    public Aluno(String nome, int idade, String curso, String matricula, boolean status) {
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
        this.notas = new double[3];
        this.presencas = new boolean[20];
        this.status = status;
    }
    @Override
    public void atividade() {
        System.out.println("Está assistindo aula");
    }

    @Override
    public double media() {
        int qnt_faltas = 0;
        for (int i = 0; i < this.presencas.length; i++) {
            if(this.presencas[i] == false){
                qnt_faltas++;
            }
        }
        if(qnt_faltas > 5){
            System.out.println("Reprovador por falta");
            return -1;
        }
        int qnt_notas = 0;
        double soma_notas = 0;
        for (int i = 0; i < this.notas.length; i++) {
            if(this.notas[i] >= 0){
                qnt_notas++;
            }
            soma_notas += this.notas[i];
        }
        if(qnt_notas < 3){
            System.out.println("O aluno está com nota pendente");
            return -1;
        }
        double media = soma_notas / 3;
        if(media >= 7){
            System.out.println("Aprovado por média");
        }
        else if(media >= 5 && media < 7){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
        return media;
    }
    @Override
    public void presenca() {
        int qnt_faltas = 0;
        for (int i = 0; i < this.presencas.length; i++) {
            if(this.presencas[i] == false){
                qnt_faltas++;
            }
        }
        System.out.println("Número de Faltas: " + qnt_faltas);
        System.out.println("Número de Presenças: " + (20-qnt_faltas));
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public boolean[] getPresencas() {
        return presencas;
    }
    public void setPresencas(boolean[] presencas) {
        this.presencas = presencas;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
