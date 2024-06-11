import java.util.Random;
import java.util.ArrayList;

public class Professor extends Usuario implements IOperacoes {
    private String curso;
    private String matricula;
    private ArrayList<Aluno> turma;

    public Professor(String nome, int idade, String curso, String matricula) {
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
        this.turma = new ArrayList<Aluno>(10);
    }
    
    public void adicionarAluno(Aluno aluno){
        this.turma.add(aluno);
    }
    
    @Override
    public void atividade() {
        System.out.println(this.getNome() + " Está dando aula para: ");
        for (Aluno aluno : this.turma) {
            System.out.println("\tAluno: " + aluno.getNome());
        }
    }

    @Override
    public double media() {
        double soma_medias = 0;
        for (Aluno aluno : this.turma) {
            if(aluno.media() >= 0){
                soma_medias += aluno.media();
            }else{
                throw new ArithmeticException("Turma ainda não finalizada");
            }
        }
        double media = soma_medias / 10;
        return media;
    }
    @Override
    public void presenca() {
        Random random = new Random();
        for (Aluno aluno : this.turma) {
            boolean[] p = new boolean[20];
            for (int i = 0; i < p.length; i++) {
                double numero = random.nextDouble();
                if(numero >= 0.8){
                    p[i] = false;
                }else{
                    p[i] = true;
                }
            }
            aluno.setPresencas(p);
        }
        //for (int i = 0; i < this.turma.length; i++) {
        //    boolean[] p = new boolean[20];
        //    for (int j = 0; j < p.length; j++) {
        //        double numero = random.nextDouble();
        //        if(numero >= 0.8){
        //            p[j] = false;
        //        }else{
        //            p[j] = true;
        //        }
        //    }
        //    this.turma[i].setPresencas(p);
        //}
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
    public ArrayList<Aluno> getTurma() {
        return turma;
    }
    public void setTurma(ArrayList<Aluno> turma) {
        this.turma = turma;
    }
}