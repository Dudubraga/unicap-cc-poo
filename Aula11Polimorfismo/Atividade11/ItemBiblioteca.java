import java.time.LocalDate;

public class ItemBiblioteca{
    private String titulo;
    private int anoPublicacao;
    private int numCopias;
    private String dataDevolucao;
 
    public ItemBiblioteca(String titulo, int anoPublicacao, int numCopias, String dataDevolucao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.numCopias = numCopias;
        this.dataDevolucao = dataDevolucao;
    }
    /* Emprestar e Devolver */
    public void emprestarItem(ItemBiblioteca item) {
        if (item.getNumCopias() > 0) {
            item.setNumCopias(item.getNumCopias() - 1);
            System.out.println("Item emprestado!");
        } else {
            System.out.println("Não há cópias disponíveis para empréstimo.");
        }
    }
    public void devolverItem(ItemBiblioteca item) {
        double multa = item.calcular_multa();
        if(multa > 0){
            System.out.println("Item devolvido com atraso.");
            LocalDate hoje = LocalDate.now();
            System.out.println("Data de Hoje: " + hoje.getDayOfMonth() + "/" + 
            hoje.getMonthValue() + "/" + hoje.getYear());
            System.out.println("Data de Devolução Esperada: " + getDataDevolucao());
            System.out.println("Multa a ser paga: R$" + multa);
        }else{
            System.out.println("Item devolvido!");
        }
        item.setNumCopias(item.getNumCopias() + 1);
    }
    public double calcular_multa(){
        return 0;
    }
    /* Gets e Sets */
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public int getNumCopias() {
        return numCopias;
    }
    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }
    public String getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}