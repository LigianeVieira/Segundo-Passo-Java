package ExerciciosLista2;

//LER 3 NUMEROS E DIZER O MAIOR DELES

import java.util.Scanner;

public class List2Exerc2 {
	public static void main(String args[]) {
		System.out.print("Digite um n�mero inteiro ");
		Scanner leitor = new Scanner(System.in);
		int n1 = leitor.nextInt();

		System.out.print("Digite outro n�mero inteiro ");
		int n2 = leitor.nextInt();

		System.out.print("Digite o pr�ximo n�mero inteiro ");
		int n3 = leitor.nextInt();

		if (n1 > n2 && n1 > n3) {

			System.out.print("O maior n�mero �: " + n1);
		}

		else {
			if (n2 > n3 && n2 > n1) {
				System.out.print("O maior n�mero �: " + n2);
			} else

			{
				System.out.print("O maior n�mero �: " + n3);

			}

		}
		leitor.close();
	}
}