package Aula12Colecoes.Atividade12.Questao02;
import java.util.*;

public class TesteHashSetCPF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String>hash = new HashSet<>();
        for(int i = 0; i < 10; i++){
            System.out.print("Digite um CPF: ");
            String cpf = scan.next();
            hash.add(cpf);
        }
        System.out.println("\nLista de CPF's inseridos: ");
        for(String s : hash){
            System.out.println("\t" + s);
        }
        scan.close();
    }
}
