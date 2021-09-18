package ExerciciosLista2;

//LER NOTAS E CALCULAR A QNTIDADE DE NOTAS POSSIVEIS

import java.util.Scanner;

public class List2Exerc13 {
	public static void main(String args[]) {
		System.out.print("Digite um valor:  ");
		Scanner leitor = new Scanner(System.in);
		int valor = leitor.nextInt();

		int qntNota100 = (valor / 100);
		int qntNota50 = (valor % 100) / 50;
		int qntNota10 = (valor % 50) / 10;
		int qntNota5 = (valor % 10) / 5;
		int qntNota1 = (valor % 5) / 1;

		if (valor >= 1 && valor <= 5) {
			System.out.println("Notas de 1: " + qntNota1);
			System.out.println("Notas de 5: " + qntNota5);
		}

		else {
			if (valor > 5 && valor <= 50) {
				System.out.println("Notas de 1: " + qntNota1);
				System.out.println("Notas de 5: " + qntNota5);
				System.out.println("Notas de 10: " + qntNota10);
				System.out.println("Notas de 50: " + qntNota50);
			}

			else {
				System.out.println("Notas de 1: " + qntNota1);
				System.out.println("Notas de 5: " + qntNota5);
				System.out.println("Notas de 10: " + qntNota10);
				System.out.println("Notas de 50: " + qntNota50);
				System.out.println("Notas de 100: " + qntNota100);
			}
		}
		leitor.close();
	}
}
