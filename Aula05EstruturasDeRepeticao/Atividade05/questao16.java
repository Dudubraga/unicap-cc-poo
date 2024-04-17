package Aula05EstruturasDeRepeticao.Atividade05;
import java.util.Scanner;

public class questao16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int alunos = 1, aprovados = 0;
        while(alunos <= 5){
            float nota = scan.nextInt();
            if(nota >= 7){
                aprovados++;
            }
            alunos++;
        }
        System.out.println(aprovados + " alunos aprovados");

        scan.close();
    }
}
