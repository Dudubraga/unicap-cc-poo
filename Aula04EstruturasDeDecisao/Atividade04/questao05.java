package Aula04EstruturasDeDecisao.Atividade04;
import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira as três notas: ");
        float a = scan.nextInt();
        float b = scan.nextInt();
        float c = scan.nextInt();
        float media = (a + b + c) / 3;
        if(media >= 7){
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }

        scan.close();
    }
}
