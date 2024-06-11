public class Empresa {
    private String nome;
    private String cnpj;
    private Trabalhador[] trabalhadores = new Trabalhador[20]; 
    private String endereco;
    private int num_funcionarios;
    private String ceo;

    public Empresa(String nome, String cnpj, String endereco, int num_funcionarios, String ceo) {
        setNome(nome);
        setCnpj(cnpj);
        setEndereco(endereco);
        setNum_funcionarios(num_funcionarios);
        setCeo(ceo);
    }

    public void contratar(Trabalhador trabalhador){
        this.trabalhadores[num_funcionarios] = trabalhador;
        this.num_funcionarios++;
    }
    
    public void trabalhar(){
        for(int i = 0; i < getNum_funcionarios(); i++){
            if(getTrabalhadores()[i].isFerias() == false){
                getTrabalhadores()[i].setHoras_trabalhadas(8);
            }
        }
    }

    public double calcularPagamento(){
        double valor_total = 0;
        for(int i = 0; i < getNum_funcionarios(); i++){
            double vh = getTrabalhadores()[i].getValor_hora();
            double ht = getTrabalhadores()[i].getHoras_trabalhadas();
            double valor = vh * ht;
            valor_total += valor;
        }
        return valor_total;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Trabalhador[] getTrabalhadores(){
        return trabalhadores;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNum_funcionarios() {
        return num_funcionarios;
    }
    public void setNum_funcionarios(int num_funcionarios) {
        this.num_funcionarios = num_funcionarios;
    }

    public String getCeo() {
        return ceo;
    }
    public void setCeo(String ceo) {
        this.ceo = ceo;
    }
    
}
