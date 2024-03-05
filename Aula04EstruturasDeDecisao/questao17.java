package Aula04EstruturasDeDecisao;
import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o estado civil: ");
        String civil = scan.nextLine();
        switch(civil){
            case "solteiro":
                System.out.println("É solteiro");
                break;
            case "casado":
                System.out.println("É casado");
                break;
            case "divorciado":
                System.out.println("É divorciado");
                break;
            case "viuvo":
                System.out.println("É viúvo");
                break;
        }

        scan.close();
    }
}
