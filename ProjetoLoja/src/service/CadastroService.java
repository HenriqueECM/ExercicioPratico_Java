package service;
import java.util.Scanner;
import model.Pessoa;
import model.Cliente;
import model.Vendedor;

public class CadastroService {
	public Pessoa cadastrarPessoa(Scanner sc) {
		Pessoa pessoa = new Pessoa(null, null);
		
		System.out.println("Nome da pessoa: ");
		pessoa.setNome(sc.nextLine());
		
		System.out.println("Telefone da pessoa: ");
		pessoa.setTelefone(sc.nextLine());
		
		return pessoa;
	}
	
	public Cliente cadastrarCliente(Scanner sc) {
		Cliente cliente = new Cliente(null, null, null);
		
		System.out.println("Nome do cliente: ");
		cliente.setNome(sc.nextLine());
		
		System.out.println("Telefone do cliente: ");
		cliente.setTelefone(sc.nextLine());
		
		System.out.println("Preferencia de pagamento: ");
		cliente.setPreferenciaPagamento(sc.nextLine());
		
		return cliente;
	}
	
	public Vendedor cadastrarVendedor(Scanner sc) {
		Vendedor vendedor = new Vendedor(null, null, null);
		
		System.out.println("Nome do vendedor: ");
		vendedor.setNome(sc.nextLine());
		
		System.out.println("Telefone do vendedor: ");
		vendedor.setTelefone(sc.nextLine());
		
		System.out.println("Meta mensal: ");
		vendedor.setMetaMensal(sc.nextLine());
		
		return vendedor;
	}
}
