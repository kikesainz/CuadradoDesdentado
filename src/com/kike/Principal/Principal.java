package com.kike.Principal;

import java.util.Random;
import java.util.Scanner;

class Principal {
	
	public static void main(String args[]) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduzca un número entero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		String[][] matriz = new String[numero][numero];
		String[][] matriz2 = new String  [numero] [numero];
		
		Random r = new Random();
		
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j< numero; j++) {
				if (r.nextBoolean()) {
				matriz[i][j] = "| "+numero+" |";
				} else {
					matriz[i][j] = "|   |";
				}
					
			}
		}
		
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j< numero; j++) {
				if (r.nextBoolean()) {
				matriz2[i][j] = "| "+i+""+j+" |";
				} else {
					matriz2[i][j] = "|    |";
				}
					
			}
		}
	System.out.println("Matriz desdentada de números: ");
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j< numero; j++) {
				System.out.print( matriz[i][j]+ " ");
				
			}
			System.out.println();
		}
		System.out.println("Matriz desdentada de índices: ");
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j< numero; j++) {
				System.out.print( matriz2[i][j]+ " ");
				
			}
			System.out.println();
		}
	}

}
