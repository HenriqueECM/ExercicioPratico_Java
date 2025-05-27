package service;
import java.util.Scanner;
import model.Pessoa;
import model.Aluno;
import model.Instrutor;

public class CadastroService {

    public Pessoa cadastrarPessoa(Scanner sc) {
        Pessoa pessoa = new Pessoa(null, 0);

        System.out.print("Digite nome da pessoa: ");
        pessoa.setNome(sc.nextLine());

        System.out.print("Digite a idade da pessoa: ");
        pessoa.setIdade(sc.nextInt());
        
        sc.nextLine();

        return pessoa;
    }

    public Aluno cadastrarAluno(Scanner sc) {
        Aluno aluno = new Aluno(null, 0, null);

        System.out.print("Digite nome do aluno: ");
        aluno.setNome(sc.nextLine());

        System.out.print("Digite a idade do aluno: ");
        aluno.setIdade(sc.nextInt());
        
        sc.nextLine(); 
        
        System.out.print("Digite o objetivo do aluno: ");
        aluno.setObjetivo(sc.nextLine());

        return aluno;
    }

    public Instrutor cadastrarInstrutor(Scanner sc) {
        Instrutor inst = new Instrutor(null, null, 0);

        System.out.print("Digite nome do instrutor: ");
        inst.setNome(sc.nextLine());

        System.out.print("Digite a idade do instrutor: ");
        inst.setIdade(sc.nextInt());
        
        sc.nextLine(); 

        System.out.print("Digite a especialidade do instrutor: ");
        inst.setEspecialidade(sc.nextLine());

        return inst;
    }
}
