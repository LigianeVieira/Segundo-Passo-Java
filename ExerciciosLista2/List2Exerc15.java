package ExerciciosLista2;
import java.util.Scanner;

public class List2Exerc15 {
	public static void main(String args[]) {

		System.out.print(" Qual o �ndice da polui��o: ");
		Scanner leitor = new Scanner(System.in);
		double indice= leitor.nextDouble();
		
		if (indice > 0.40 && indice >= 0.5) {
			System.out.println("O indice de polui��o � :  " + indice);
			System.out.println("Intima��o para as industrias do 1�, 2� e 3�  grupo para suspenderem suas atividades ");
				} 
		else {
			if (indice > 0.30 && indice <= 0.40) {
				System.out.println("O indice de polui��o � :  " + indice);
				System.out.println("Intima��o para as industrias do 1� e 2� grupo para suspenderem suas atividades ");}
					}

		if (indice > 0.25 && indice <= 0.30) {
						System.out.println("O indice de polui��o � :  " + indice);
						System.out.println("Intima��o para as industrias do 1� grupo para suspenderem suas atividades ");
					} 
		else {
						if (indice >= 0.05 && indice <= 0.25) {
							System.out.println("O indice de polui��o � aceitavel:  " + indice);
						}
					}
		leitor.close();
	}}
			
		


