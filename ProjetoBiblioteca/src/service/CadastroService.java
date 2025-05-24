package service;
import java.util.Scanner;
import model.Bibliotecario;
import model.Leitor;
import model.Pessoa;

public class CadastroService {
	
	public Pessoa cadastroPessoa(Scanner sc) {
		Pessoa pessoa = new Pessoa(null, null);
		
		System.out.println("Digite nome da pessoa: ");
		pessoa.setNome(sc.nextLine());
		
		System.out.println("Digite o cpf da pessoa: ");
		pessoa.setCpf(sc.nextLine());
		
		return pessoa; 
	}
	
	public Leitor cadastroLeitor(Scanner sc) {
		Leitor leitor = new Leitor(null, null, null);
		
		System.out.println("Digite o nome do leitor: ");
		leitor.setNome(sc.nextLine());
		
		System.out.println("Digite o cpf do leitor: ");
		leitor.setCpf(sc.nextLine());
		
		System.out.println("Digite a matricula do leitor: ");
		leitor.setMatricula(sc.nextLine());
		
		return leitor;
	}
	
	public Bibliotecario cadastrarBibliotecario(Scanner sc) {
		Bibliotecario bibliotecario = new Bibliotecario(null, null, null);
		
		System.out.println("Digite o nome do bibliotecario: ");
		bibliotecario.setNome(sc.nextLine());
		
		System.out.println("Digite o cpf do bibliotecario: ");
		bibliotecario.setCpf(sc.nextLine());
		
		System.out.println("Digite o turno do bibliotecario: ");
		bibliotecario.setTurno(sc.nextLine());
		
		return bibliotecario;
	}
}
