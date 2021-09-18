package ExerciciosLista2;

//LER NUMERO E DIZER SE É PAR/IMPAR/POSITIVO/NEGATIVO
import java.util.Scanner;

public class List2Exerc3 {

	public static void main(String args[]) {

		System.out.print("Digite um número inteiro ");
		Scanner leitor = new Scanner(System.in);
		float n = leitor.nextFloat();
		
		if (n%2==0) {
			System.out.println("Par");}
		else {
				System.out.println("Ímpar");}
		
		if (n>0) {
		System.out.println("Positivo");
		}
		
		else
		{
		System.out.println("Negativo");
		}
		leitor.close();
	}
}
