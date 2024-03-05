package Aula04EstruturasDeDecisao;
import java.util.Scanner;

public class questao08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira três números: ");
        int maior = 0, menor = 0, meio = 0;
        int[] values = new int[3];
        for(int i = 0; i < 3; i++){
            values[i] = scan.nextInt();
            if(i == 0){ menor = values[i]; }
            if(values[i] > maior){ maior = values[i]; }
            if(values[i] < menor){ menor = values[i]; }
            meio += values[i];
        }
        meio -= maior + menor; 
        System.out.println(menor +" "+ meio +" "+ maior);
        
        scan.close();
    }
}
