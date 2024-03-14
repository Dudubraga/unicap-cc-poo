package Aula06ArraysEFuncoes;
import java.util.Scanner;

public class questao07 {
    public static int fahrenheit(double C){
        return (int)(C * (9.0 / 5.0) + 32.0);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira a temperatura em Celsius: ");
        double celsius = scan.nextDouble();
        System.out.println((int)celsius + "ºC equivalem a " + 
            fahrenheit(celsius) + "ºF");

        scan.close();
    }
}
