package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira dois números: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a == b){ System.out.println(a + " e " + b + " são iguais"); }
        else if(a > b){ System.out.println(a + " é o maior número"); }
        else{ System.out.println(b + " é o maior número"); }

        scan.close();
    }
}
