package ExerciciosLista2;

//CARDAPIO LANCHONETE 

import java.util.Scanner;

public class List2Exerc9 {
	public static void main(String args[]) {
		System.out.print("Diga o código do lanche pedido: ");
		Scanner leitor = new Scanner(System.in);
		int lanche = leitor.nextInt();
		
		System.out.print("Digite a quantidade de lanches?");
		int qntLanches = leitor.nextInt();
		
		System.out.print("Diga o código da bebida a ser pedida?");
		int CodRefri = leitor.nextInt();
		
		
		System.out.print("Digite a quantidade de bebidas?");
		int qntrefri = leitor.nextInt();
		
		
		int Codcachorro = 100;
		int Codbaurus =101;
		int Codbauovo= 102;
		int Codhamb = 103;
		int Codchees = 104;
		CodRefri= 105;
		
		double valCachorro= (1.20);
		double valbauS = (1.30);
		double valBauOvo= (1.50);
		double valHamb= (1.20);
		double valchees=(1.30);
		double valRefri= (1.00);
		
		switch (lanche) {
		
		case 100:
			System.out.println("Cód:  "  + Codcachorro +  "Cachorro-quente; quantidade: " + qntLanches +   " e valor: "+ (qntLanches*valCachorro));
			System.out.println("Cód: "  +  CodRefri + "Refrigerante; quantidade:" + qntrefri +   " e valor: "+ (qntrefri*valRefri));
			System.out.println ("Valor total pedido: " + (qntLanches*valCachorro+qntrefri*valRefri));
			break;
			
		case 101:
			System.out.println("Cód: "  +  Codbaurus +"Bauru simples; quantidade: " + qntLanches +  " e valor: "+ (qntLanches*valbauS));
			System.out.println("Cód: "  +  CodRefri + "Refrigerante; quantidade:" + qntrefri +   " e valor: "+ (qntrefri*valRefri));
			System.out.println ("Valor total pedido: " + (qntLanches*valbauS + qntrefri*valRefri));
			break;
			
		case 102:
			System.out.println("Cód: "  +  Codbauovo +"Bauru com ovo; quantidade: " + qntLanches+   " e valor: "+ (qntLanches*valBauOvo));
			System.out.println("Cód: "  +  CodRefri + "Refrigerante; quantidade:" + qntrefri +   " e valor: "+ (qntrefri*valRefri));
			System.out.println ("Valor total pedido: " + (qntLanches*valBauOvo+qntrefri*valRefri));
			break;
		case 103:
			System.out.println("Cód: "  +  Codhamb + "Hambúrger; quantidade: " + qntLanches+   " e valor: "+(qntLanches*valHamb));
			System.out.println("Cód: "  +  CodRefri + "Refrigerante; quantidade:" + qntrefri +   " e valor: "+ (qntrefri*valRefri));
			System.out.println ("Valor total pedido: " + (qntLanches*valHamb+qntrefri*valRefri));
			break;
		case 104: 
			System.out.println("Cód: "  +  Codchees + "Cheesburger, quantidade: " + qntLanches+   " e valor: "+(qntLanches*valchees));
			System.out.println("Cód: "  +  CodRefri + "Refrigerante; quantidade:" + qntrefri +   " e valor: "+ (qntrefri*valRefri));
			System.out.println ("Valor total pedido: " + (qntLanches*valchees+qntrefri*valRefri));
			break;
					
		default:
			System.out.println("Pedido inválido");	
					}
		
		
		leitor.close();
	
		
		}
			
		
		}
		
		
			
		
		
		
		
	


