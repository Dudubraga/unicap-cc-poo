package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o nome de um produto: ");
        String produto = scan.nextLine();
        System.out.print("Insira o valor desse produto: ");
        float preco = scan.nextFloat();
        String pp = produto + " por R$ " + preco;
        System.out.println(pp);

        scan.close();
    }
}
