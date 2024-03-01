package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o raio de uma circunferência: ");
        float r = scan.nextFloat();
        double p = 2 * 3.1415 * r;
        System.out.println("O perímetro do círculo mede " + p + " cm²");

        scan.close();
    }
}
