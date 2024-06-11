//import java.util.ArrayList;

public class Coordenador extends Professor{
    private String horarioDeAtendimento;

    public Coordenador(String nome, int idade, String curso, String matricula, String horario) {
        super(nome, idade, curso, matricula);
        this.horarioDeAtendimento = horario;
    }

    public void alterarStatusAluno(Aluno aluno){
        aluno.setStatus(!aluno.isStatus());
    }

    public void removerAlunoDaTurma(Professor professor, Aluno aluno){
        boolean removido = false;
        for (Aluno a : professor.getTurma()) {
            if(a.getMatricula() == aluno.getMatricula()){
                professor.getTurma().remove(aluno);
                removido = true;
            }
        }
        if(!removido){
            //throw AlunoInexistente("message");
        }
    }

    public String getHorarioDeAtendimento() {
        return horarioDeAtendimento;
    }
    public void setHorarioDeAtendimento(String horarioDeAtendimento) {
        this.horarioDeAtendimento = horarioDeAtendimento;
    }
}
