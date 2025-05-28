package main;
import java.util.Scanner;
import model.Veiculo;
import model.Carro;
import model.Moto;
import service.CadastroService;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		CadastroService cadastro = new CadastroService();
		
		System.out.println("==== SISTEMA ESTACIONAMENTO ====");
		
		System.out.println("\n--- CADASTRO DO VEÍCULO ---");
		Veiculo veiculo = cadastro.cadastrarVeiculo(sc);
		
		System.out.println("\n--- CADASTRO DO CARRO ---");
		Carro carro = cadastro.cadastrarCarro(sc);
		
		System.out.println("\n--- CADASTRO DA MOTO ---");
		Moto moto = cadastro.cadastrarMoto(sc);
		
		System.out.println("\n===============================");
		
		System.out.println("\n--- DADOS CADASTRADOS ---");
		
		veiculo.dados();
		System.out.println();
		carro.mostrarDados();
		System.out.println();
		moto.mostrarDados();
	}
}
