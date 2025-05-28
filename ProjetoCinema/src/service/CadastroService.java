package service;
import java.util.Scanner;
import model.Pessoa;
import model.Funcionario;
import model.Cliente;

public class CadastroService {
	
	public Pessoa cadastrarPessoa(Scanner sc) {
		Pessoa pessoa = new Pessoa(null, null);
		
		System.out.print("Nome da pessoa: ");
		pessoa.setNome(sc.nextLine());
		
		System.out.print("Email da pessoa: ");
		pessoa.setEmail(sc.nextLine());
		
		return pessoa;
	}
	
	public Funcionario cadastrarFuncionario(Scanner sc) {
		Funcionario funcionario = new Funcionario(null, null, null);
		
		System.out.print("Nome do funcionario: ");
		funcionario.setNome(sc.nextLine());
		
		System.out.print("Email do funcionario: ");
		funcionario.setEmail(sc.nextLine());
		
		System.out.print("Cargo do funcionario: ");
		funcionario.setCargo(sc.nextLine());
		
		return funcionario;
	}
	
	public Cliente cadastrarCliente(Scanner sc) {
		Cliente cliente = new Cliente(null, null, null);
		
		System.out.print("Nome do cliente: ");
		cliente.setNome(sc.nextLine());
		
		System.out.print("Email do cliente: ");
		cliente.setEmail(sc.nextLine());
		
		System.out.print("Tipo ingresso: ");
		cliente.setTipoIngresso(sc.nextLine());
		
		return cliente;
	}
}
