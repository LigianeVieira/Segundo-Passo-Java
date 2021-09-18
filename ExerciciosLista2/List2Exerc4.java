package ExerciciosLista2;

//DURACAO DE JOGO

import java.util.Scanner;

public class List2Exerc4 {

	public static void main(String args[]) {
		System.out.print("Digite a hora inicial do jogo ");
		Scanner leitor = new Scanner(System.in);
		int Hinicial = leitor.nextInt();
		
		System.out.print("Digite a hora final do jogo ");
		int Hfinal = leitor.nextInt();
		
		int duracao = Hfinal-Hinicial+24;
		int duracao1 = Hfinal-Hinicial;
						 
		if(Hinicial>Hfinal) {
			System.out.println("Duração do jogo: "+ duracao);}
		else {
					System.out.println("Duração do jogo: "+ duracao1);}
		leitor.close();
		}
		}
			
		

 