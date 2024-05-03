package Aula12Colecoes.Atividade12.Questao05;
import Aula12Colecoes.Atividade12.Questao03.*;
import java.util.*;

public class TesteMapaAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CadastroAluno cadastro = new CadastroAluno();
        Aluno aluno1 = new Aluno("Eduardo", "001", 19, "CC");
        Aluno aluno2 = new Aluno("Julia", "002", 19, "CC");
        Aluno aluno3 = new Aluno("Lucas", "003", 19, "CC");
        Aluno aluno4 = new Aluno("Pedro", "004", 20, "CC");
        Aluno aluno5 = new Aluno("Bia", "005", 19, "CC");

        cadastro.cadastrarAluno(aluno1);
        cadastro.cadastrarAluno(aluno2);
        cadastro.cadastrarAluno(aluno3);
        cadastro.cadastrarAluno(aluno4);
        cadastro.cadastrarAluno(aluno5);

        HashMap<String, Aluno>map = new HashMap<>();
        for(Aluno a : cadastro.getAlunos()){
            map.put(a.getMatricula(), a);
        }

        for(int i = 0; i < 5; i++){
            System.out.print("Digite a matrícula: ");
            String matricula = scan.next();
            if(map.containsKey(matricula)){
                System.out.println("A matrícula corresponde ao Aluno " + map.get(matricula).getNome());
            }else{
                System.out.println("Aluno não encontrado");
            }
        }

        scan.close();
    }
    
}
