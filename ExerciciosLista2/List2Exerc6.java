package ExerciciosLista2;

//DIZER SE � UM TRIANGULO EQUILATERO,ESCALENO OU ISOCELES

import java.util.Scanner;

public class List2Exerc6 {
	public static void main(String args[])
    { 
    System.out.print("Digite o valor do lado A do tri�ngulo: ");
        Scanner leitor = new Scanner (System.in);
    int ladoA = leitor.nextInt();
    
    System.out.print("Digite o valor do lado B do tri�ngulo: ");
    int ladoB = leitor.nextInt();

    System.out.print("Digite o valor do lado A do tri�ngulo: ");
    int ladoC = leitor.nextInt();
    if (ladoA == ladoB && ladoB ==ladoC)
    	{System.out.println("Tri�ngulo equilatero");}
    	
	else 
	{ 
	    if(ladoA!=ladoB && ladoB!=ladoC){
    	 System.out.println("Tri�ngulo escaleno");}

	    else{
        System.out.print("Triangulo is�celes");}
	 
 }
    leitor.close();
    }
}
    
