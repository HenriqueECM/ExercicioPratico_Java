package service;
import model.Funcionario;
import model.Pessoa;
import model.Hospede;
import java.util.Scanner;

public class CadastroService {
	
	public Pessoa cadastrarPessoa(Scanner sc) {
		Pessoa pessoa = new Pessoa(null, null);
		
		System.out.println("Digite nome da pessoa: ");
		pessoa.setNome(sc.nextLine());
		
		System.out.println("Digite o documento: ");
		pessoa.setDocumento(sc.nextLine());
		
		return pessoa;
	}
	
	public Hospede cadastrarHospede(Scanner sc) {
		Hospede hospede = new Hospede(null, null, 0);
		
		System.out.println("Digite nome do hospede: ");
		hospede.setNome(sc.nextLine());
		
		System.out.println("Digite o documento do hospede: ");
		hospede.setDocumento(sc.nextLine());
		
		System.out.println("Digite o numero do quarto: ");
		hospede.setNumeroQuarto(sc.nextInt());
		
		return hospede;
	}
	
	public Funcionario cadastrarFuncionario(Scanner sc) {
		Funcionario funcionario = new Funcionario(null, null, null);
		
		System.out.println("Digite nome do funcionario: ");
		funcionario.setNome(sc.nextLine());
		
		System.out.println("Digite o documento do funcionario: ");
		funcionario.setDocumento(sc.nextLine());
		
		System.out.println("Digite a função do funcionario: ");
		funcionario.setFuncao(sc.nextLine());
		
		return funcionario;
	}
}
