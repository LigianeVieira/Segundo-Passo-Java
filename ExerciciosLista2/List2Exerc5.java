package ExerciciosLista2;


//LER A,B,C E DIZER SE FORMAM TRIANGULO

import java.util.Scanner;
public class List2Exerc5 {
	public static void main(String args[]) {

		System.out.print("Digite um número inteiro ");
		Scanner leitor = new Scanner(System.in);
		int A = leitor.nextInt();
		
		System.out.print("Digite outro número inteiro ");
		int B = leitor.nextInt();
		
		System.out.print("Digite outro número inteiro ");
		int C = leitor.nextInt();
		
		if (A>(B+C)){
		System.out.println("Não formam triangulo");}
		
		else {
			System.out.println("Forma um triangulo");}
		leitor.close();
}
}