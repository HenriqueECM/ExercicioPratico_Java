package model;

public class Cliente extends Pessoa {
	private String preferenciaPagamento;
	
	public Cliente (String nome, String telefone, String preferenciaPagamento) {
		super(nome, telefone);
		this.setPreferenciaPagamento(preferenciaPagamento);
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
	}

	public String getPreferenciaPagamento() {
		return preferenciaPagamento;
	}

	public void setPreferenciaPagamento(String preferenciaPagamento) {
		this.preferenciaPagamento = preferenciaPagamento;
	}
}
