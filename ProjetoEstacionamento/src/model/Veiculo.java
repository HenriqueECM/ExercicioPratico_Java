package model;

public class Veiculo {
	protected String marca, placa;
	
	public Veiculo(String marca, String placa) {
		this.marca = marca;
		this.placa = placa;
	}
	
	public void dados() {
		System.out.println("Marca: " + marca);
		System.out.println("Placa: " + placa);
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getPlaca() {
		return placa;
	}
}
