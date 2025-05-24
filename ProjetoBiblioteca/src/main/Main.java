package main;
import java.util.Scanner;
import model.Bibliotecario;
import model.Pessoa;
import model.Leitor;
import service.CadastroService;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		CadastroService cadastro = new CadastroService();
		
		System.out.println("==== SISTEMA DE CADASTRO ====");
		
		System.out.println("\n--- Cadastro Pessoa ---");
		Pessoa pessoa = cadastro.cadastroPessoa(sc);
		
		System.out.println("\n--- Cadastro Leitor ---");
		Leitor leitor = cadastro.cadastroLeitor(sc);
		
		System.out.println("\n--- Cadastro Bibliotecario ---");
		Bibliotecario bibliotecario = cadastro.cadastrarBibliotecario(sc);
		
		System.out.println("\n===========================");
		
		System.out.println("\n==== DADOS CADASTRADOS ====");
		
		System.out.println();
		pessoa.dados();
		System.out.println();
		leitor.mostrarDados();
		System.out.println();
		bibliotecario.mostrarDados();
	}
}
