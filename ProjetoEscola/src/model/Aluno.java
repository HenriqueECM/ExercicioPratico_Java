package model;

public class Aluno extends Pessoa {
	
    private String serie;

    public Aluno (String serie, String email, String nome) {
        super(email, nome); // Acessa metodos e construtores da superclasse (classe mãe)
        this.serie = serie; 
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSerie() {
        return serie;
    }

    public void mostrarDados() {
        dados();
        System.out.println("Série: " + serie);
    }
    
}