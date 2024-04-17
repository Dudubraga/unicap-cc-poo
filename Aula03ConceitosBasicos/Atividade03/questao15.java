package Aula03ConceitosBasicos.Atividade03;
import java.util.Scanner;

public class questao15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira sua altura em metros: ");
        float altura = scan.nextFloat();
        System.out.print("Insira sey peso em quilos: ");
        float peso = scan.nextFloat();
        float IMC = peso / (altura * altura);
        System.out.println("Seu Índice de Massa Corporal é: " + IMC);

        scan.close();
    }
}
