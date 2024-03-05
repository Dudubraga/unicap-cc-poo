package Aula04EstruturasDeDecisao;
import java.util.Scanner;

public class questao09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o peso em kg: ");
        float peso = scan.nextFloat();
        System.out.print("Insira a altura em metros (x,xx): ");
        float altura = scan.nextFloat();
        float IMC = peso / (altura * altura);
        if(IMC < 18.5){ System.out.println("Abaixo do peso"); }
        else if(IMC < 25){ System.out.println("Peso normal"); }
        else if(IMC < 30){ System.out.println("Sobrepeso"); }
        else if(IMC < 40){ System.out.println("Obesa"); }
        else{ System.out.println("Muito obesa"); }

        scan.close();
    }
}
