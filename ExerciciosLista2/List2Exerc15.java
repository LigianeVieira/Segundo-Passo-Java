package ExerciciosLista2;
import java.util.Scanner;

public class List2Exerc15 {
	public static void main(String args[]) {

		System.out.print(" Qual o índice da poluição: ");
		Scanner leitor = new Scanner(System.in);
		double indice= leitor.nextDouble();
		
		if (indice > 0.40 && indice >= 0.5) {
			System.out.println("O indice de poluição é :  " + indice);
			System.out.println("Intimação para as industrias do 1°, 2º e 3º  grupo para suspenderem suas atividades ");
				} 
		else {
			if (indice > 0.30 && indice <= 0.40) {
				System.out.println("O indice de poluição é :  " + indice);
				System.out.println("Intimação para as industrias do 1º e 2º grupo para suspenderem suas atividades ");}
					}

		if (indice > 0.25 && indice <= 0.30) {
						System.out.println("O indice de poluição é :  " + indice);
						System.out.println("Intimação para as industrias do 1º grupo para suspenderem suas atividades ");
					} 
		else {
						if (indice >= 0.05 && indice <= 0.25) {
							System.out.println("O indice de poluição é aceitavel:  " + indice);
						}
					}
		leitor.close();
	}}
			
		


