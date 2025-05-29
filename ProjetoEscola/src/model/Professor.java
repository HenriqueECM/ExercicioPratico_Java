package model;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor (String email, String nome, String disciplina) {
        super(email, nome);
        this.disciplina = disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public void mostrarDados() {
        dados();
        System.out.println("Disciplina: " + disciplina);
    }
}
