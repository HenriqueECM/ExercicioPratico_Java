package service;
import java.util.Scanner;
// estou importando as classes do pacote "model"
import model.Carro;
import model.Moto;
import model.Veiculo;

// Aqui seria a logica de entrada de dados, ou seja fazendo mini sistemas logicos
// para usuario cadastrar as informações
public class CadastroService {
	
	// aqui estou fazendo sistema de cadastro da classe veiculo
	public Veiculo cadastrarVeiculo(Scanner sc) {
		
		Veiculo veiculo = new Veiculo(null, null);
		
		System.out.println("Digite a marca do Veiculo: ");
		veiculo.setMarca(sc.nextLine());
		
		System.out.println("Digite a placa do Veículo: ");
		veiculo.setPlaca(sc.nextLine());
		
		return veiculo;
	}
	
	// aqui estou fazendo sistema de cadastro da classe do carro	
	public Carro cadastrarCarro(Scanner sc) {
		
		Carro carro = new Carro(null, null, 0);
		
		System.out.println("Digite a marca do Carro: ");
		carro.setMarca(sc.nextLine());
		
		System.out.println("Digite a placa do Carro: ");
		carro.setPlaca(sc.nextLine());
		
		System.out.println("Digite número de portas do Carro: ");
		carro.setNumeroPortas(sc.nextInt());
		
		return carro;
	}
	
	public Moto cadastrarMoto(Scanner sc) {
		
		Moto moto = new Moto(null, null, null);
		
		System.out.println("Digite a marca da Moto: ");
		sc.nextLine(); // coloquei mais um scanner para não bugar entre int e string
		moto.setMarca(sc.nextLine());
		
		System.out.println("Digite a placa da Moto: ");
		moto.setPlaca(sc.nextLine());
		
		System.out.println("Digite a cilindrada da Moto: ");
		moto.setCilindrada(sc.nextLine());
		
		return moto;
	}
}
