package Aula04EstruturasDeDecisao.Atividade04;
import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira dois números inteiros: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.print("1-soma, 2-subtração,3-multiplicação, 4-divisão: ");
        int op = scan.nextInt();
        switch(op){
            case 1:
                System.out.println(a +" + "+ b +" = " + (a+b));
                break;
            case 2:
                System.out.println(a +" - "+ b +" = "+ (a-b));
                break;
            case 3:
                System.out.println(a +" * "+ b +" = "+ (a*b));
                break;
            case 4:
                System.out.println(a +" / "+ b +" = "+ (a/b));
                break;
        }

        scan.close();
    }
}
