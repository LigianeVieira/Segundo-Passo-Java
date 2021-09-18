package ExerciciosLista2;

//CALCULAR A MEDIA DE APROVEITAMENTO DE ALUNOS

import java.util.Scanner;
public class List2Exerc14 {
	public static void main(String args[]) {

		System.out.print("Digite seu código de identificação: ");
		Scanner leitor = new Scanner(System.in);
		int codId = leitor.nextInt();

		System.out.print("Digite sua primeira nota: ");
		int nota1 = leitor.nextInt();

		System.out.print("Digite sua segunda nota: ");
		float nota2 = leitor.nextFloat();

		System.out.print("Digite sua terceira nota: ");
		float nota3 = leitor.nextFloat();

		System.out.print("Digite sua média de exercícios: ");
		float MedExerc = leitor.nextFloat();

		float mediaAprov = (nota1 + nota2 * 2 + nota3 * 3 + MedExerc) / 7;
		float valorMediaAp = mediaAprov;

		System.out.println(valorMediaAp);
		if (valorMediaAp >=9) {

			System.out.println("Número Aluno:  " + codId);
			System.out.println("Notas: " + nota1 + ", " + nota2 + " e  " + nota3);
			System.out.println("Média de Exercícios: " + MedExerc);
			System.out.println("Conceito: A, está Aprovado!");
		}

		else {
			if (valorMediaAp>=7.5 && valorMediaAp<9) {
				System.out.println("Número Aluno:  " + codId);
				System.out.println("Notas: " + nota1 + ", " + nota2 + " e  " + nota3);
				System.out.println("Média de Exercícios: " + MedExerc);
				System.out.println("Conceito: B, está Aprovado!");}
			

			if (valorMediaAp >= 6 && valorMediaAp < 7.5) {
				System.out.println("Número Aluno:  " + codId);
				System.out.println("Notas: " + nota1 + ", " + nota2 + " e  " + nota3);
				System.out.println("Média de Exercícios: " + MedExerc);
				System.out.println("Conceito: C, está Aprovado!");}
			

			if (valorMediaAp >=4  && valorMediaAp < 6) {
				System.out.println("Número Aluno:  " + codId);
				System.out.println("Notas: " + nota1 + ", " + nota2 + " e  " + nota3);
				System.out.println("Média de Exercícios: " + MedExerc);
				System.out.println("Conceito: D, está Reprovado!");}
			  if(valorMediaAp<4){
				System.out.println("Número Aluno:  " + codId);
				System.out.println("Notas: " + nota1 + ", " + nota2 + " e  " + nota3);
				System.out.println("Média de Exercícios: " + MedExerc);
				System.out.println("Conceito: E, está Reprovado!");
			}
		
	}
		leitor.close();
}
}


