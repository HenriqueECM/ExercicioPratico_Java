package main;
import java.util.Scanner;
import model.Instrutor;
import model.Aluno;
import model.Pessoa;
import service.CadastroService;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		CadastroService cadastro = new CadastroService();
		
		System.out.println("---- CADASTRO PESSOA ----");
		Pessoa pessoa = cadastro.cadastrarPessoa(sc);
		
		System.out.println("\n---- CADASTRO ALUNO ----");
		Aluno aluno = cadastro.cadastrarAluno(sc);
		
		System.out.println("\n---- CADASTRO INSTRUTOR ----");
		Instrutor instrutor = cadastro.cadastrarInstrutor(sc);
		
		System.out.println("\n---- DADOS CADASTRADOS ----\n");
		
		pessoa.dados();
		System.out.println();
		aluno.mostrarDados();
		System.out.println();
		instrutor.mostrarDados();
	}
}
