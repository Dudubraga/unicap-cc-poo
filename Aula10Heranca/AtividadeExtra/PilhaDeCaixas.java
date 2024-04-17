package AtividadeExtra;
import java.util.Stack;
// 1.c)
public class PilhaDeCaixas {
    double alturaMax;
    Stack<Caixa> stack = new Stack<>();

    public PilhaDeCaixas(double alturaMax) {
        this.alturaMax = alturaMax;
    }
    // 1.d)
    public boolean empilhar(Caixa caixa){
        if(!this.stack.isEmpty()){
            if(this.alturaMax < this.alturaAtual() + caixa.getAltura()){
                System.out.println("A altura máxima foi atingida");
                return false;
            }
            /* Acessar o PesoMax de uma variavel CaixaFragil na pilha de tipo Caixa
               pra conseguir impedir que caixas frageis recebam caixas muito pesadas
               em cima delas;
            if(this.stack.peek().getIdentificador() == "fragil"){
                if(caixa.getPeso() > stack.peek().getPesoMax()){
                    return false;
                }
            }
            */
        }
        this.stack.push(caixa);
        return true;
    }
    // 1.e)
    public Caixa desempilhar(){
        if(this.stack.isEmpty()){
            System.out.println("\nA pilha de caixas está vazia");
        }
        return this.stack.pop();
    }
    // 1.f)
    public double alturaAtual(){
        double alturaTotal = 0;
        Stack<Caixa>temp = new Stack<>();
        while(!this.stack.isEmpty()){
            Caixa c = this.stack.pop();
            alturaTotal += c.getAltura();
            temp.push(c);
        }
        while(!temp.isEmpty()){
            this.stack.push(temp.pop());
        }
        return alturaTotal;
    }
    // 1.g)
    public double pesoAtual(){
        double pesoTotal = 0;
        Stack<Caixa>temp = new Stack<>();
        while(!this.stack.isEmpty()){
            Caixa c = this.stack.pop();
            pesoTotal += c.getPeso();
            temp.push(c);
        }
        while(!temp.isEmpty()){
            this.stack.push(temp.pop());
        }
        return pesoTotal;
    }
    // 1.h)
    public void exibirPilha(){
        System.out.println("Pilha Atualmente:");
        Stack<Caixa>temp = new Stack<>();
        while(!this.stack.isEmpty()){
            Caixa c = this.stack.pop();
            c.exibirEtiqueta();
            System.out.println();
            temp.push(c);
        }
        while(!temp.isEmpty()){
            this.stack.push(temp.pop());
        }
        System.out.println("Altura atual da pilha: " + this.alturaAtual());
        System.out.println("Peso atual da pilha: " + this.pesoAtual());
    }

    public double getAlturaMax() {
        return alturaMax;
    }
    public void setAlturaMax(double alturaMax) {
        this.alturaMax = alturaMax;
    }
}
