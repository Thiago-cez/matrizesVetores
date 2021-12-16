package br.com.vetoresMatrizes;

import java.util.Random;

public class Exercicio3{
	
	public static void main(String[] args) {
		
		Random random= new Random();
		
		int n1[][]=new int[4][6], n2[][]=new int[4][6], m1[][]= new int[4][6],m2[][]=new int[4][6];

			for(int l=0; l<n1.length; l++){
				for(int c=0; c<n1.length; c++){
					n1[l][c]=random.nextInt(100);
				}
			}
			
			for(int i=0; i<n2.length; i++){
				for(int j=0; j<n2.length; j++){
					n2[i][j]=random.nextInt(100);
					
				}
				
			}
			System.out.println("A matriz soma será:");
			for(int a = 0; a <m1.length; a++) { 
				
	            for(int b = 0; b<m1.length; b++) {
	            	
	                m1[a][b] = n1[a][b] + n2[a][b];
	                
	                System.out.print(m1[a][b]+" | ");
	                
	        		}
	            System.out.println("");
			}
			System.out.println();
			System.out.println("A matriz diferença será: ");
			
			for(int a2 = 0; a2 <m2.length; a2++) { 
				
	            for(int b2 = 0; b2 < m2.length; b2++) {
	            	
	                m2[a2][b2] = n1[a2][b2] - n2[a2][b2];
	                
	                System.out.print(m2[a2][b2]+"| ");
	                
	        		}
	            System.out.println("");
			}

	}

}