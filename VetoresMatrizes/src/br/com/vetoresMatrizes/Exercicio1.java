package br.com.vetoresMatrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n, maior = 0;
		
		System.out.print("Entre com a quantidade de pontuações que você quer contabilizar: ");
		
		n = sc.nextInt();
		
		System.out.println("");
		
		int [] p = new int [n];
		
		for(int i = 0 ; i < n ; i++)
		{
			
			System.out.print("Entre com a pontuação da posição número " + (i + 1) + ": ");
			
			p[i] = sc.nextInt();
			
			if ( p[i] > maior )
			{					
				maior = p[i];
			}				
		}
		
		System.out.println("\nAs pontuações são: \n");
		
		for(int j = 0 ; j < n ; j++)
		{
			System.out.print(( j + 1 ) + "º pontuação: " + p[j] + "\n");			
		}
		
		System.out.print("\nE a maior pontuação é: " + maior);
		
		sc.close();
	}
	
}