package Aula06ArraysEFuncoes.Atividade06;
import java.util.Scanner;

public class questao01 {
    public static int dobro(int n){
        return n * 2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int n = scan.nextInt();
        System.out.println(dobro(n) + " é o dobro de " + n);

        scan.close();
    }
}
