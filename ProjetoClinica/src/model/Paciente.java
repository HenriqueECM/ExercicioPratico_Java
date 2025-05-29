package model;

public class Paciente extends Pessoa {
	private String planoSaude;
	
	// Metodo construtor
	public Paciente (String nome, String telefone, String planoSaude) {
		super(nome, telefone);
		this.planoSaude = planoSaude;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		
		System.out.println("Telefone: " + telefone);
	
		System.out.println("Plano de Saúde: " + planoSaude);
	}
	
	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	public String getPlanoSaude() {
		return planoSaude;
	}
	
}
