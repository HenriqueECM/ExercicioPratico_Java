package model;

public class Hospede extends Pessoa {
	private int numeroQuarto;
	
	public Hospede(String nome, String documento, int numeroQuarto) {
		super(nome, documento);
		this.numeroQuarto = numeroQuarto;
	}
	
	public void mostrarDados() {
		dados();
		System.out.println("Numero do Quarto: " + numeroQuarto);
	}
	
	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	
	public int getNumeroQuarto() {
		return numeroQuarto;
	}
}
