package cz.vkr.letani;

import java.util.ArrayList;

import cz.vkr.databaze.SimulaceDatabaze;
import cz.vkr.dto.Letiste;
import cz.vkr.dto.Vetron;
import cz.vkr.enums.Povrch;


/**
 * trida, ktera zastresuje beh celeho programu. V realu by napriklad vytvorila
 * GUI, napojila se na Databazi, nacetla data, vyresila opravneni uzivatele
 * atp...
 * 
 * @author vkral
 *
 */
public class HlavniProgram {

	private String[] argumenty;

	private Letiste mojeLetiste;

	/**
	 * hlavni metoda programu
	 */
	public void spustit() {

		mojeLetiste = SimulaceDatabaze.nactiDataOLetisti();
		System.out.println("********************  Vypis informaci po spusteni programu  *******************");
		System.out.println(mojeLetiste.toString());	 

		
		
		// Tady se dá blbnout.....
		// zjistime pocet vetronu na letisti: 
		System.out.println("Pocet vetronu: "+mojeLetiste.getVetrone().size());
		
		
		// dáme asfalt na dráhu 23 ;-) 
		
		mojeLetiste.getDrahaPodleNazvu("23").setPovrch(Povrch.ASFALT.toString());
		
		//drahu 05 udelame uzsi
		mojeLetiste.getDrahaPodleNazvu("05").setSirka(50);
		
		//Prodame PW:
		mojeLetiste.odeberLetadloPodleRegistrace("OK-3751");
		
		
		
		// pak si uz fakt muzes vymyslet jakoukoliv kravinu...  
		
		ArrayList<Vetron> vsechnyVetrone = mojeLetiste.getVetrone();
		
		
		
		
		
		
		System.out.println("\n\n\n********************  Vypis informaci po blbnuti s datama  *******************");
		System.out.println(mojeLetiste.toString());	 
		
	}



	public HlavniProgram(String[] argumenty) {
		this.argumenty = argumenty;
	}
}
