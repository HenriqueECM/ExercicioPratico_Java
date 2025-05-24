package model;

public class Funcionario extends Pessoa{
	private String funcao;
	
	public Funcionario(String nome,String documento, String funcao) {
		super(nome, documento);
		this.funcao = funcao;
	}
	
	public void mostrarDados() {
		dados();
		System.out.println("Função: " + funcao);
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public String getFuncao() {
		return funcao;
	}
}
