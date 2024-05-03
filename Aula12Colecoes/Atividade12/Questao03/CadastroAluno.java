package Aula12Colecoes.Atividade12.Questao03;
import java.util.*;

public class CadastroAluno {
    ArrayList<Aluno>alunos;

    public CadastroAluno() {
        this.alunos = new ArrayList<Aluno>();
    }

    public void cadastrarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void mostrarLista(){
        System.out.println("\nLista de Alunos: ");
        for(Aluno a : this.alunos){
            System.out.println("\tNome: " + a.nome);
            System.out.println("\tMatrícula: " + a.matricula);
            System.out.println("\tIdade: " + a.idade);
            System.out.println("\tCurso: " + a.curso);
            System.out.println();
        }
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
