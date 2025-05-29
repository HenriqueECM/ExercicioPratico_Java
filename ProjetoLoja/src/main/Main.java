package main;
import java.util.Scanner;
import model.Vendedor;
import model.Pessoa;
import model.Cliente;
import service.CadastroService;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		CadastroService cadast = new CadastroService();
		
		System.out.println("CADASTRO PESSOA");
		Pessoa pessoa = cadast.cadastrarPessoa(sc);
		
		System.out.println("\nCADASTRO VENDEDOR");
		Vendedor vendedor = cadast.cadastrarVendedor(sc);
		
		System.out.println("\nCADASTRO CLIENTE");
		Cliente cliente = cadast.cadastrarCliente(sc);
		
		System.out.println("\nDADOS CADASTRADOS\n");
		
		pessoa.dados();
		System.out.println();
		vendedor.mostrarDados();
		System.out.println();
		cliente.mostrarDados();
	}
}
