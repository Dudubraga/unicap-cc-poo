package Aula07ClassesAtributosEMetodos.Atividade07.Questao02;

public class Medico {
    String codigo;
    String nome;
    String sexo;
    String especialidade;
    Endereco endereco;

    public Medico(String codigo, String nome, String sexo, 
    String especialidade, Endereco endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }
    public void modificarMedico(String codigo, String nome, String sexo,
    String especialidade, Endereco endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }
}
