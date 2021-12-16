package br.com.vetoresMatrizes;

import java.util.Scanner;

public class Exercicio4 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int [][] m1 = new int [3][3];
			int somamatriz = 0, diagonal = 0;

			for(int l = 0; l < 3; l++) {
				for(int c = 0; c <3; c++)
				{
					
				System.out.print("Escreva o valor para atribuir na matriz M1 linha " + l
							+ " e na coluna " + c + " ou seja na posição " + l + "," + c + ": ");
					
				m1[l][c] = sc.nextInt();
				
				}}
			
			System.out.println("\nSua matriz resultante é: ");
			
			for(int l2 = 0; l2 < 3; l2++) {
				for(int c2 = 0; c2 <3; c2++) {
										
					somamatriz = somamatriz + m1[l2][c2];	
					
					System.out.print(m1[l2][c2] + " | ");
				}
				System.out.println("");
				}
			
			System.out.println("\nA Soma total da matriz é: " + somamatriz);
			
			diagonal = m1[0][0] + m1[1][1] + m1[2][2];
				
			System.out.println("A Soma da diagonal é: " + diagonal);
			
			sc.close();		}
}
