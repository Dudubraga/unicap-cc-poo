package Aula12Colecoes.Atividade12.Questao03;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CadastroAluno cadastro = new CadastroAluno();
        for(int i = 0; i < 10; i++){
            System.out.print("Digite o nome do Aluno: ");
            String nome = scan.next();
            System.out.print("Digite a matrícula do Aluno: ");
            String matricula = scan.next();
            System.out.print("Digite a idade do Aluno: ");
            int idade = scan.nextInt();
            System.out.print("Digite o curso do Aluno: ");
            String curso = scan.next();
            System.out.println();
            Aluno aluno = new Aluno(nome, matricula, idade, curso);
            cadastro.cadastrarAluno(aluno);
        }
        cadastro.mostrarLista();

        scan.close();
    }
}
