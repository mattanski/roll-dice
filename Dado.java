package com.casa.esercitazione27.it;

import java.util.Random;

public class Dado extends OggettoLanciato {
	
	private int lato;
	
	public void lancio() {
	
		Random rand  = new Random();
		int max = 6, min = 1;
		lato = rand.nextInt(max - min + 1) + min;
		
		
	}
	

	public void print(){
		
		System.out.println("il risultato random dopo il lancio del dado è: "  + lato);
		
	}
	
}
