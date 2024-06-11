/* TESTES */

public class Main {
    public static void main(String[] args) {
        Professor augusto = new Professor("Augusto", 30, "CC", "00");
        Aluno eduardo = new Aluno("Eduardo", 19, "CC", "01", true);
        Aluno julia = new Aluno("Julia", 19, "CC", "02", true);
        Aluno lucas = new Aluno("Lucas", 19, "CC", "03", true);
        augusto.adicionarAluno(eduardo);
        augusto.adicionarAluno(julia);
        augusto.adicionarAluno(lucas);

        augusto.presenca();

        augusto.atividade();
        for (Aluno aluno : augusto.getTurma()) {
            System.out.println("Presenças Aluno: " + aluno.getNome());
            aluno.presenca();
        }

        //Coordenador liliane = new Coordenador("Liliane", 50, "CC", "0000", "manha");
        //liliane.removerAlunoDaTurma(augusto, lucas);
        //System.out.println("Nova Lista de Alunos: ");
        //for (Aluno aluno : augusto.getTurma()) {
        //    System.out.println("\t" + aluno.getNome());
        //}


    }
}