package main;
import java.util.Scanner;
import model.Hospede;
import model.Pessoa;
import model.Funcionario;
import service.CadastroService;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		CadastroService cadastro = new CadastroService();
		
		System.out.println("---- Sistema Hotel ----");
		
		System.out.println("\n---- CADASTRO PESSOA ----");
		Pessoa pessoa = cadastro.cadastrarPessoa(sc);
		
		System.out.println("\n---- CADASTRO FUNCIONARIO ----");
		Funcionario funcionario = cadastro.cadastrarFuncionario(sc);
		
		System.out.println("\n---- CADASTRO HOSPEDE ----");
		Hospede hospede = cadastro.cadastrarHospede(sc);
		
		System.out.println("------------------------");
		
		System.out.println("\n---- DADOS CADASTRADOS ----");
		
		System.out.println();
		pessoa.dados();
		System.out.println();
		funcionario.mostrarDados();
		System.out.println();
		hospede.mostrarDados();
	}
}
