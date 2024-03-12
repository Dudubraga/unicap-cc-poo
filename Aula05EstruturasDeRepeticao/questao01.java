package Aula05EstruturasDeRepeticao;
import java.util.Scanner;

public class questao01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira as 5 notas abaixo:");
        int aprovados = 0;
        for(int i = 0; i < 5; i++){
            float notas = scan.nextFloat();
            if(notas >= 7.0){ aprovados++; }
        }
        System.out.println(aprovados + " Alunos foram aprovados");

        scan.close();
    }
}
