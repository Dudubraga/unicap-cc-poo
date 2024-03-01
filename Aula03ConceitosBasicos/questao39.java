package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira uma temperatura em Celsius: ");
        float c = scan.nextFloat();
        float f = (c * 9/5) + 32;
        System.out.println(c +"ºC equivalem a "+ f +"ºF");

        scan.close();
    }
}
