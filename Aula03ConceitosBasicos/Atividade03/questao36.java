package Aula03ConceitosBasicos.Atividade03;
import java.util.Scanner;

public class questao36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um valor em reais: ");
        float reais = scan.nextFloat();
        System.out.print("Insira a cotação do dolar: ");
        float cota = scan.nextFloat();
        float dolar = reais * cota;
        System.out.println("R$ " + reais + " equivalem a $" +  dolar);

        scan.close();
    }
}
