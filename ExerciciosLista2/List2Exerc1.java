package ExerciciosLista2;

//LER 2 VALORES E DIZER SE É MULTIPLO OU NÃO

import java.util.Scanner;
public class List2Exerc1 {

	public static void main(String args[]) {

		System.out.print("Digite um número inteiro ");
		Scanner leitor = new Scanner(System.in);
		int n1 = leitor.nextInt();

		System.out.print("Digite outro número inteiro ");
		int n2 = leitor.nextInt();

		int result = ((n1 / n2) * n2);

		if (n1 == result) {
			System.out.print("são multiplos");
		}

		else {
			System.out.print("não são multiplos");
		}
		leitor.close();
	}
}
