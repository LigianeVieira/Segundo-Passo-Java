package ExerciciosLista2;

///LER IDADE NADADOR E CLASSIFICA-LO EM CATEGORIA

import java.util.Scanner;

public class List2Exerc7 {
	public static void main(String args[]) {
		System.out.print("Digite sua idade: ");
		Scanner leitor = new Scanner(System.in);
		int idade = leitor.nextInt();
		
		
		switch (idade) {
		case 5,6,7: 
			System.out.print("Infantil A");
			break;
		case 8,9,10:
			System.out.print("Infantil B");
			break;
		case 11,12,13:
			System.out.print("Juvenil A");
			break;
		case 14,15,16,17:
			System.out.print("Juvenil B");
			break;
		case 1,2,3,4: 
			System.out.print("idade invalida");
			break;
			
			default:
				System.out.print("Adulto");	

		}
		leitor.close();
	}
}