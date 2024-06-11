import java.util.ArrayList;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private boolean bomCliente;
    private ArrayList<Item> carrinhoDeCompras;

    public Cliente(String nome, int idade, String cpf, String endereco, boolean bomCliente) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.bomCliente = bomCliente;
        this.carrinhoDeCompras = new ArrayList<Item>(100);
    }

    public void adicionar(Item item){
        if(this.carrinhoDeCompras.size() > 100){
            System.out.println("Carrinho lotado, não é possivel adicionar Itens");
        }else{
            this.carrinhoDeCompras.add(item);
        }
    }
    public void cancelar(int codigo){
        for(Item i : this.carrinhoDeCompras){
            if(i.getCodigo() == codigo){
                this.carrinhoDeCompras.remove(i);
                System.out.println("Item " + i.getNome() + " cancelado");
            }
        }
    }
    public double finalizarCompra(){
        double total = 0;
        for(Item i : this.carrinhoDeCompras){
            if(!i.isDisponibilidade() || i.getQuantidadeEmEstoque() <= 0){
                System.out.println("\tItem " + i.getNome() + " indisponivel ou fora de estoque");
            }else{
                total += i.getValor();
                i.setQuantidadeEmEstoque(i.getQuantidadeEmEstoque()-1);
                System.out.println("\tItem " + i.getNome() + " comprado");
            }
        }
        this.carrinhoDeCompras.clear();
        return total;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public boolean isBomCliente() {
        return bomCliente;
    }
    public void setBomCliente(boolean bomCliente) {
        this.bomCliente = bomCliente;
    }
    public ArrayList<Item> getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }
    public void setCarrinhoDeCompras(ArrayList<Item> carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }
}