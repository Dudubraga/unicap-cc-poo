import java.time.LocalDate;

public class DVD extends ItemBiblioteca {
    int duracao;

    public DVD(String titulo, int anoPublicacao, int numCopias, String dataDevolucao, int duracao) {
        super(titulo, anoPublicacao, numCopias, dataDevolucao);
        this.duracao = duracao;
    }

    public double calcular_multa(){
        LocalDate hoje = LocalDate.now();
        double multa = 0;
        String[] data = getDataDevolucao().split("/");
        int dia = Integer.parseInt(data[0]);
        int mes = Integer.parseInt(data[1]);
        int ano = Integer.parseInt(data[2]);
        long totalDias = (ano*365) + (mes*30) + dia;
        long totalHoje = (hoje.getYear() * 365) + (hoje.getMonthValue() * 30) + hoje.getDayOfMonth();
        if(totalDias > totalHoje){
            multa = (totalDias - totalHoje) * 0.5; // R$0.50 por dia de multa
        }
        return multa;
    }
}
