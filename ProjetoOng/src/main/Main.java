package main;
import model.Pessoa;
import model.Coordenador;
import model.Voluntario;
import java.util.Scanner;
import service.CadastroService;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
	
		CadastroService cadastro = new CadastroService();
		
		System.out.println("---- SISTEMA DE CADASTRO ONG ----");
		
		System.out.println("\n---- CADASTRO PESSOA ----");
		Pessoa pessoa = cadastro.cadastrarPessoa(sc);
		
		System.out.println("\n---- CADASTRO VOLUNTARIO ----");
		Voluntario volunt = cadastro.cadastrarVoluntario(sc);
		
		System.out.println("\n---- CADASTRO COORDENADOR ----");
		Coordenador coord = cadastro.cadastrarCoordenador(sc);
		
		System.out.println("\n---- DADOS CADASTRADOS ----\n");
		
		pessoa.dados();
		System.out.println();
		volunt.mostrarDados();
		System.out.println();
		coord.mostrarDados();
		
	}
}
