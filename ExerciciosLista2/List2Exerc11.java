package ExerciciosLista2;

///CALCULO CARGO/NOVO SALARIO

import java.util.Scanner;

public class List2Exerc11 {

	public static void main(String args[]) {

		System.out.print("Digite o valor do seu salário:  ");
		Scanner leitor = new Scanner(System.in);
		int salario = leitor.nextInt();

		System.out.print("Digite o código da sua função: ");
		int cargo = leitor.nextInt();

	//	float Gerente = 101;
	//	float engenheiro = 102;
	//	float tecnico = 103;

		switch (cargo) {

		case 101:
			System.out.println("salario antigo: " + salario);
			System.out.println("salario novo:" + (salario * .10f + salario));
			System.out.println("diferença de salarios:" + ((salario * .10f + salario) - salario));
			break;

		case 102:
			System.out.println("salario antigo: " + salario);
			System.out.println("salario novo:" + (salario * .20f + salario));
			System.out.println("diferença de salarios:" + ((salario * .20f + salario) - salario));
			break;

		case 103:
			System.out.println("salario antigo: " + salario);
			System.out.println("salario novo:" + (salario * .30f + salario));
			System.out.println("diferença de salarios:" + ((salario * .30f + salario) - salario));
			break;

		default:
			System.out.println("salario antigo: " + salario);
			System.out.println("salario novo:" + (salario * .40f + salario));
			System.out.println("diferença de salarios:" + ((salario * .40f + salario) - salario));
		}
		leitor.close();
	}
}