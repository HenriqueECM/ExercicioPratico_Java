package service;
import java.util.Scanner;
import model.Pessoa;
import model.Medico;
import model.Paciente;

public class CadastroService {
	
	public Pessoa cadastrarPessoa(Scanner sc) {
		Pessoa pessoa = new Pessoa(null, null);
		
		System.out.println("Nome da Pessoa? ");
		pessoa.setNome(sc.nextLine());
		
		System.out.println("Número de telefone da Pessoa? ");
		pessoa.setTelefone(sc.nextLine());
		
		return pessoa;
	}
	
	public Medico cadastrarMedico(Scanner sc) {
		Medico medico = new Medico(null, null, null);
		
		System.out.println("Nome do Médico? ");
		medico.setNome(sc.nextLine());
		
		System.out.println("Número de telefone do Médico? ");
		medico.setTelefone(sc.nextLine());
		
		System.out.println("Qual é especialidade do Médico? ");
		medico.setEspecialidade(sc.nextLine());
		
		return medico;
	}
	
	public Paciente cadastrarPaciente(Scanner sc) {
		Paciente paciente = new Paciente(null, null, null);
		
		System.out.println("Nome do Paciente? ");
		paciente.setNome(sc.nextLine());
		
		System.out.println("Número de telefone do Paciente? ");
		paciente.setTelefone(sc.nextLine());
		
		System.out.println("Qual é plano de saúde do Paciente? ");
		paciente.setPlanoSaude(sc.nextLine());
		
		return paciente;
	}
}
