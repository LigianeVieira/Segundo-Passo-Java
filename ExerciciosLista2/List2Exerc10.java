package ExerciciosLista2;

//BANCO CONCEDERÁ UM CREDITO ESPECIAL

import java.util.Scanner;

public class List2Exerc10 {
	public static void main(String args[]) {

		System.out.print("Digite o seu saldo médio:");
		Scanner leitor = new Scanner(System.in);
		float saldo = leitor.nextInt();

		if (saldo >= 0 && saldo <= 200) {
			System.out.println("Seu saldo médio é: " + saldo);
			System.out.println("O valor do seu crédito é: 0");
		}

		else {
			if (saldo >= 201 && saldo <= 400) {
				System.out.println("Seu saldo médio é: " + (saldo * 0.02 + saldo));
				System.out.println("O valor do seu crédito é: " + (saldo * 0.02));}
			
			else {
			if (saldo >= 401 && saldo <= 600) {
				System.out.println("Seu saldo médio é: " + (saldo * 0.03 + saldo));
				System.out.println("O valor do seu crédito é: " + (saldo * 0.03));}
						
			else {
				System.out.println("Seu saldo médio é: " + (saldo * 0.04 + saldo));
				System.out.println("O valor do seu crédito é: " + (saldo * 0.04));}
			leitor.close();
		}
		}
	}
}
	