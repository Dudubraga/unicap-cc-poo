package Aula05EstruturasDeRepeticao;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] values = new int[5];
        for(int i = 0; i < 5; i++){
            values[i] = scan.nextInt();
        }

        System.out.println("Núemros inseridos:");
        for(int i : values){
            System.out.print(i + " ");
        } System.out.println();
        
        scan.close();
    }
}