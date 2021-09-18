package ExerciciosLista2;

// MEDIA PONDERADA

import java.util.Scanner;

public class List2Exerc8 {
	
	public static void main(String args[]) {
		System.out.print("Digite seu código de aluno: ");
		Scanner leitor = new Scanner(System.in);
		float cod = leitor.nextFloat();
		
		System.out.print("Digite sua primeira nota: ");
		float nota1 = leitor.nextFloat();

		System.out.print("Digite sua segunda nota: ");
		float nota2 = leitor.nextFloat();

		System.out.print("Digite sua terceira nota: ");
		float nota3 = leitor.nextFloat();
		
		float media1 = (nota1 * 4 + nota2 * 3 + nota3 * 3) / 10;
		float media2 = (nota2 * 4 + nota1 * 3 + nota3 * 3) / 10;
		float media3 = (nota3 * 4 + nota1 * 3 + nota2 * 3) / 10;
		
		
	
			   
			 if (media1 >=7 || media2 >=7 || media3>7)
				{System.out.println ("Código aluno: " +cod);  
			    System.out.println("notas: " +nota1 +"," +nota2 + "e" +nota3);
			    System.out.println("Aprovado");}
				
				else {
				System.out.println ("Código aluno: " +cod);  
			    System.out.println("notas: " +nota1 +"," +nota2 + "e" +nota3);
			    System.out.println(("Reprovado"));}
			
			 leitor.close();
			}
			}
