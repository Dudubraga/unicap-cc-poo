package Aula07ClassesAtributosEMetodos.Atividade07.Questao01;

public class Paciente {
    String codigo;
    String nome;
    String dataNascimento;
    String sexo;
    String planoSaude;
    String alergia;
    String tipoSanguineo;

    public Paciente(String codigo, String nome, String dataNascimento, 
    String sexo, String planoSaude, String alergia, String tipoSanguineo){
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
    }

    public void modificar(String codigo, String nome, String dataNascimento, 
    String sexo, String planoSaude, String alergia, String tipoSanguineo){
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
    }
}
