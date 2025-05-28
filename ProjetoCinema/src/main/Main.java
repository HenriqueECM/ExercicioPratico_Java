package main;
import java.util.Scanner;
import model.Cliente;
import model.Funcionario;
import model.Pessoa;
import service.CadastroService;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CadastroService cadastro = new CadastroService();
		
		System.out.println("---- CADASTRO PESSOA ----");
		Pessoa pessoa = cadastro.cadastrarPessoa(sc);
		
		System.out.println("\n---- CADASTRO FUNCIONARIO ----");
		Funcionario funcionario = cadastro.cadastrarFuncionario(sc);
		
		System.out.println("\n---- CADASTRO CLIENTE ----");
		Cliente cliente = cadastro.cadastrarCliente(sc);
		
		System.out.println("\n---- DADOS CADASTRADOS ----\n");
		
		pessoa.dados();
		System.out.println();
		funcionario.mostrarDados();
		System.out.println();
		cliente.mostrarDados();
	}
}
