package main;
import java.util.Scanner;
import service.CadastroService;
import model.Professor;
import model.Pessoa;
import model.Aluno;

public class Main {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		CadastroService cadastro = new CadastroService();
		
		System.out.println("--- Cadastro da Pessoa ---");
		Pessoa pessoa = cadastro.cadastrarPessoa(sc);
		
		System.out.println("\n--- Cadastro do Aluno ---");
		Aluno aluno = cadastro.cadastrarAluno(sc);
		
		System.out.println("\n--- Cadastro do Professor ---");
		Professor professor = cadastro.cadastrarProfessor(sc);
		
		System.out.println("\n======================================");
		
		System.out.println("\n--- DADOS CADASTRADOS ---");
		
		pessoa.dados();
		System.out.println();
		aluno.mostrarDados();
		System.out.println();
		professor.mostrarDados();
	}
}
