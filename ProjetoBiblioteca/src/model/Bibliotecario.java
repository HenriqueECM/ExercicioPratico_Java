package model;

public class Bibliotecario extends Pessoa {
	private String turno;
	
	public Bibliotecario (String nome, String cpf, String turno) {
		super(nome, cpf);
		this.turno = turno;
	}
	
	public void mostrarDados() {
		dados();
		System.out.println("Turno: " + turno);
	}
	
	public void setTurno (String turno) {
		this.turno = turno;
	}
	
	public String getTurno() {
		return turno;
	}
}
