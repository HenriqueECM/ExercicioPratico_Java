package service;
import java.util.Scanner;
import model.Aluno;
import model.Pessoa;
import model.Professor;

public class CadastroService {
	
	public Pessoa cadastrarPessoa(Scanner sc) {
		
		Pessoa pessoa = new Pessoa(null, null);
		
		System.out.println("Nome  da pessoa: ");
		pessoa.setNome(sc.nextLine());
		
		System.out.println("Email da pessoa: ");
		pessoa.setEmail(sc.nextLine());
		
		return pessoa;
	}
	
	public Aluno cadastrarAluno(Scanner sc) {
		
		Aluno aluno = new Aluno(null, null, null);

        System.out.println("Nome do aluno: ");
        aluno.setNome(sc.nextLine());

        System.out.println("Email do aluno: " );
        aluno.setEmail(sc.nextLine());

        System.out.println("Série do aluno: ");
        aluno.setSerie(sc.nextLine());

        return aluno;
	}
	
	public Professor cadastrarProfessor(Scanner sc) {
		
		Professor professor = new Professor(null, null, null);
	
		System.out.println("Nome do professor: ");
		professor.setNome(sc.nextLine());
		
		System.out.println("Email do professor: ");
		professor.setEmail(sc.nextLine());
		
		System.out.println("Nome da disciplina: ");
		professor.setDisciplina(sc.nextLine());
		
		return professor;
	}
}
