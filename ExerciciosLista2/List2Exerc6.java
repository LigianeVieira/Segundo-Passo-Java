package ExerciciosLista2;

//DIZER SE É UM TRIANGULO EQUILATERO,ESCALENO OU ISOCELES

import java.util.Scanner;

public class List2Exerc6 {
	public static void main(String args[])
    { 
    System.out.print("Digite o valor do lado A do triângulo: ");
        Scanner leitor = new Scanner (System.in);
    int ladoA = leitor.nextInt();
    
    System.out.print("Digite o valor do lado B do triângulo: ");
    int ladoB = leitor.nextInt();

    System.out.print("Digite o valor do lado A do triângulo: ");
    int ladoC = leitor.nextInt();
    if (ladoA == ladoB && ladoB ==ladoC)
    	{System.out.println("Triângulo equilatero");}
    	
	else 
	{ 
	    if(ladoA!=ladoB && ladoB!=ladoC){
    	 System.out.println("Triângulo escaleno");}

	    else{
        System.out.print("Triangulo isóceles");}
	 
 }
    leitor.close();
    }
}
    
