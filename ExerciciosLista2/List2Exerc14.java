package ExerciciosLista2;

//CALCULAR A MEDIA DE APROVEITAMENTO DE ALUNOS

import java.util.Scanner;
public class List2Exerc14 {
	public static void main(String args[]) {

		System.out.print("Digite seu c�digo de identifica��o: ");
		Scanner leitor = new Scanner(System.in);
		int codId = leitor.nextInt();

		System.out.print("Digite sua primeira nota: ");
		int nota1 = leitor.nextInt();

		System.out.print("Digite sua segunda nota: ");
		float nota2 = leitor.nextFloat();

		System.out.print("Digite sua terceira nota: ");
		float nota3 = leitor.nextFloat();

		System.out.print("Digite sua m�dia de exerc�cios: ");
		float MedExerc = leitor.nextFloat();

		float mediaAprov = (nota1 + nota2 * 2 + nota3 * 3 + MedExerc) / 7;
		float valorMediaAp = mediaAprov;

		System.out.println(valorMediaAp);
		if (valorMediaAp >=9) {

			System.out.println("N�mero Aluno:  " + codId);
			System.out.println("Notas: " + nota1 + ", " + nota2 + " e  " + nota3);
			System.out.println("M�dia de Exerc�cios: " + MedExerc);
			System.out.println("Conceito: A, est� Aprovado!");
		}

		else {
			if (valorMediaAp>=7.5 && valorMediaAp<9) {
				System.out.println("N�mero Aluno:  " + codId);
				System.out.println("Notas: " + nota1 + ", " + nota2 + " e  " + nota3);
				System.out.println("M�dia de Exerc�cios: " + MedExerc);
				System.out.println("Conceito: B, est� Aprovado!");}
			

			if (valorMediaAp >= 6 && valorMediaAp < 7.5) {
				System.out.println("N�mero Aluno:  " + codId);
				System.out.println("Notas: " + nota1 + ", " + nota2 + " e  " + nota3);
				System.out.println("M�dia de Exerc�cios: " + MedExerc);
				System.out.println("Conceito: C, est� Aprovado!");}
			

			if (valorMediaAp >=4  && valorMediaAp < 6) {
				System.out.println("N�mero Aluno:  " + codId);
				System.out.println("Notas: " + nota1 + ", " + nota2 + " e  " + nota3);
				System.out.println("M�dia de Exerc�cios: " + MedExerc);
				System.out.println("Conceito: D, est� Reprovado!");}
			  if(valorMediaAp<4){
				System.out.println("N�mero Aluno:  " + codId);
				System.out.println("Notas: " + nota1 + ", " + nota2 + " e  " + nota3);
				System.out.println("M�dia de Exerc�cios: " + MedExerc);
				System.out.println("Conceito: E, est� Reprovado!");
			}
		
	}
		leitor.close();
}
}


