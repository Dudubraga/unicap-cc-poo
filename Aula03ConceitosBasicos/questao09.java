package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o nome de um animal: ");
        String animal = scan.nextLine();
        System.out.println(animal + " foi o animal inserido");

        scan.close();
    }
}
