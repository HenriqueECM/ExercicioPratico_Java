package main;
import java.util.Scanner;
import model.Paciente;
import model.Medico;
import model.Pessoa;
import service.CadastroService;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		CadastroService cadastro = new CadastroService();
		
		System.out.println("==== SISTEMA CADASTRO DA CLINICA ====");
		
		System.out.println("\n--- CADASTRO DA PESSOA ---");
		Pessoa pessoa = cadastro.cadastrarPessoa(sc);
		
		System.out.println("\n--- CADASTRO DO MÉDICO ---");
		Medico medico = cadastro.cadastrarMedico(sc);
		
		System.out.println("\n--- CADASTRO DO PACIENTE ---");
		Paciente paciente = cadastro.cadastrarPaciente(sc);
		
		System.out.println("\n====================================");
		
		System.out.println("\n==== DADOS CADASTRADOS ====");
		pessoa.dados();
		System.out.println();
		medico.mostrarDados();
		System.out.println();
		paciente.mostrarDados();
		
	}
}
