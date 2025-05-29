package service;
import model.Voluntario;
import model.Coordenador;
import model.Pessoa;
import java.util.Scanner;

public class CadastroService {
	
	public Pessoa cadastrarPessoa(Scanner sc) {
		Pessoa pessoa = new Pessoa(null, null);
		
		System.out.print("Nome da pessoa: ");
		pessoa.setNome(sc.nextLine());
		
		System.out.print("Cidade da pessoa: ");
		pessoa.setCidade(sc.nextLine());
		
		return pessoa;
	}
	
	public Voluntario cadastrarVoluntario(Scanner sc) {
		Voluntario voluntario = new Voluntario(null, null, null);
		
		System.out.print("Nome do voluntario: ");
		voluntario.setNome(sc.nextLine());
		
		System.out.print("Cidade do voluntario: ");
		voluntario.setCidade(sc.nextLine());
		
		System.out.print("Area de atuação do voluntario: ");
		voluntario.setAreaAtuacao(sc.nextLine());
		
		return voluntario;
	}
	
	public Coordenador cadastrarCoordenador(Scanner sc) {
		Coordenador coord = new Coordenador(null, null, null);
		
		System.out.print("Nome do coordenador: ");
		coord.setNome(sc.nextLine());
		
		System.out.print("Cidade do coordenador: ");
		coord.setCidade(sc.nextLine());
		
		System.out.print("Responsabilidade do coordenador: ");
		coord.setResponsabilidade(sc.nextLine());
		
		return coord;
	}
}
