package AtividadeExtra;

public class Main {
    public static void main(String[] args) {
        // 1.i)
        PilhaDeCaixas pilha = new PilhaDeCaixas(1000);
        Caixa caixa1 = new Caixa("forte", "MADEIRA", 30, 400);
        if(pilha.empilhar(caixa1)){ System.out.println("Empilhou Caixa1");}
        System.out.println("Altura Atual: " + pilha.alturaAtual());
        System.out.println("Peso Atual: " + pilha.pesoAtual());

        Caixa caixa2 = new Caixa("forte", "PLASTICO", 10, 200);
        if(pilha.empilhar(caixa2)){ System.out.println("\nEmpilhou Caixa2");}
        System.out.println("Altura Atual: " + pilha.alturaAtual());
        System.out.println("Peso Atual: " + pilha.pesoAtual());

        CaixaFragil caixaFragil3 = new CaixaFragil("fragil", "VIDRO", 20, 200, 15);
        if(pilha.empilhar(caixaFragil3)){ System.out.println("\nEmpilhou Caixa3");}
        System.out.println("Altura Atual: " + pilha.alturaAtual());
        System.out.println("Peso Atual: " + pilha.pesoAtual());

        Caixa caixa4 = new Caixa("forte", "METAL", 50, 100);
        if(pilha.empilhar(caixa4)){ System.out.println("\nEmpilhou Caixa4");}
        System.out.println("Altura Atual: " + pilha.alturaAtual());
        System.out.println("Peso Atual: " + pilha.pesoAtual());

        Caixa caixa5 = new Caixa("forte", "TECIDO", 5, 100);
        if(pilha.empilhar(caixa5)){ System.out.println("\nEmpilhou Caixa5");}
        System.out.println("Altura Atual: " + pilha.alturaAtual());
        System.out.println("Peso Atual: " + pilha.pesoAtual());

        if(pilha.empilhar(caixa5)){ System.out.println("\nEmpilhou Caixa5 2");}
        System.out.println("Altura Atual: " + pilha.alturaAtual());
        System.out.println("Peso Atual: " + pilha.pesoAtual());

        if(pilha.empilhar(caixa5)){ System.out.println("\nEmpilhou Caixa5 3");}
        System.out.println("Altura Atual: " + pilha.alturaAtual());
        System.out.println("Peso Atual: " + pilha.pesoAtual());

        System.out.println();
        pilha.exibirPilha();
        System.out.println();
        
        System.out.println("Removendo da Pilha:");
        pilha.desempilhar().exibirEtiqueta();
        System.out.println();
        pilha.desempilhar().exibirEtiqueta();

        System.out.println();
        pilha.exibirPilha();
        System.out.println();
    }
}
