package Aula07ClassesAtributosEMetodos.Questao02;

public class Endereco {
    String rua;
    String numero;
    String complemento;
    String bairro;
    String cidade;
    String uf;
    String cep;

    public Endereco(String rua, String numero, String complemento, 
    String bairro, String cidade, String uf, String cep){
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    } 
    public void modificarEndereco(String rua, String numero, String complemento, 
    String bairro, String cidade, String uf, String cep){
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    } 
}
