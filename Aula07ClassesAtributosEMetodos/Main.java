package Aula07ClassesAtributosEMetodos;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaEduardo = new ContaBancaria(23, "4002", "8922", "Eduardo");
        
        System.out.println("Saldo na conta: R$" + contaEduardo.saldo);
        
        contaEduardo.creditar(77);
        
        System.out.println("Saldo na conta: R$" + contaEduardo.saldo);
        
        contaEduardo.debitar(50);
    
        System.out.println("Saldo na conta: R$" + contaEduardo.saldo);
    }    
}
