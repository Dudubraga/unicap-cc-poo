package Aula04EstruturasDeDecisao.Atividade04;
import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o salário: ");
        float salario = scan.nextFloat();
        float aumento = 0;
        if(salario > 1500){ aumento = (salario / 10); }
        else{ aumento += (salario / 100) * 15; }
        System.out.println("R$ " + aumento + " de acréscimo");
        
        scan.close();
    }
}
