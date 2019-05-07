package aplica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class AtualizaSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int id, qtdFunc;
		String nome;
		double sal;

		Funcionario Func;

		List<Funcionario> lista = new ArrayList<>();

		System.out.println("Digite a quantidade de Funcionario a cadastrar");
		qtdFunc = sc.nextInt();

		for (int x = 1; x <= qtdFunc; x++) {

			System.out.println();

			System.out.println("Funcionario #" + x + ":");

			System.out.print("Id: ");
			id = sc.nextInt();

			System.out.print("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();

			System.out.print("Salario: ");
			sal = sc.nextDouble();

			lista.add(new Funcionario(id, nome, sal));

		}

		System.out.println("--------------------------");
		for (Funcionario f : lista) {

			System.out.println(f);

		}

		System.out.println("--------------------------");

		System.out.println("Digite o id do funcionario a aumentar");
		int procuraID = sc.nextInt();

	// Localisa o ID do usuário na lista
		
		Funcionario emp = lista.stream().filter(x -> x.getIdFunc()==procuraID).findFirst().orElse(null);
		if (emp ==null) {
			
			System.out.println("Empregado não existe");
		}
		
		System.out.println("Digite o percentual a ajustar: ");
		double percent = sc.nextDouble();
		
		// Atualiaza o salario conforme ID localizado

		emp.AtualizaSalario(percent);

	

	// Lista os funcionarios
	
	for (Funcionario obj: lista) {
		
		System.out.println(obj);
		
	}
}
}
