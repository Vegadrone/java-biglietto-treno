package org.generation.italy;

import java.util.Scanner;

public class CalcoloBiglietto {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			System.out.print("Inserisci la tua età:");
			int userAge = sc.nextInt();
			
			System.out.print("Inserisci i chilometri da percorrere:");
			int userKm = sc.nextInt();
			
		sc.close();	
			
			float kmPrice = .21f;
			double basePrice = userKm * kmPrice;

			if(userAge >= 65) {
				System.out.println("Il prezzo del biglietto è:" + (basePrice -= basePrice) /100 * 40);
				
			} else if (userAge <= 12) {
				System.out.println("Viaggio Gratis!");

			} else if (userAge < 18) {
				System.out.println("Il prezzo del biglietto è:" + (basePrice * 20) / 100 );
				
			} else {
				System.out.println("Il prezzo del biglietto è:" + basePrice);
			}
			
	}
}
