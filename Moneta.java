package com.casa.esercitazione27.it;

import java.util.Random;

public class Moneta extends OggettoLanciato {
	

	private TestaCroce faccia;
	
	public void lancio() {
		
		Random rand  = new Random();
		
		int max = 2, min = 1;
		int valoreRandom = rand.nextInt(max - min + 1) + min;
		
		if(valoreRandom == 1) {
			faccia = TestaCroce.TESTA;
		}else{
			faccia = TestaCroce.CROCE;
		}
			
	}
	

	public void print(){
		
		System.out.println("il risultato random dopo il lancio della moneta è: " + faccia);
		
	}
	
	
	
}
	


