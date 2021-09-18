package ExerciciosLista2;

///3 VALORES E ESCREVER  1 EM ORDEM CRESCENTE  E 2 DECRESCENTE
import java.util.Scanner;

public class List2Exerc12 {

	public static void main(String args[]) {
		System.out.print("Escolha um valor: 1 ou 2: ");
		Scanner leitor = new Scanner(System.in);
		int i = leitor.nextInt();

		System.out.print("Digite um valor: ");
		int a = leitor.nextInt();

		System.out.print("Digite outro valor: ");
		int b = leitor.nextInt();

		System.out.print("Digite outro valor: ");
		int c = leitor.nextInt();

		if (i == 1)
			if (a < b && a < c && b < c) {
				System.out.println(a + b + c);
			} else {
				if (a < c && a < b && c < b) {
					System.out.println(a + c + b);
				}
			}
		else {
			if (b < a && b < c && a < c) {
				System.out.println(b + a + c);
			} else {
				if (b < c && b < a && c < a) {
					System.out.println(b + c + a);
				}
			}

			if (c < a && c < b && a < b) {
				System.out.println(c + a + b);
			} else {
				if (c < b && c < a && b < a) {
					System.out.println(c + b + a);
				}
			}
		}
		if (i == 2) {
			if (a > b && a > b && b > c) {
				System.out.println(a + b + c);
			} else {
				if (a > c && a > b && c > b) {
					System.out.println(a + c + b);
				}

				else {
					if (b > a && b > c && a > c) {
						System.out.println(b + a + c);
					} else {
						if (b > c && b > a && c > a) {
							System.out.println(b + c + a);
						} else {
							if (c > a && c > b && a > b) {
								System.out.println(c + a + b);
							} else {
								if (c > b && c > a && b > a) {
									System.out.println(c + b + a);
								}
							}
						}
					}
				}
			}
		}
		leitor.close();
	}
}
