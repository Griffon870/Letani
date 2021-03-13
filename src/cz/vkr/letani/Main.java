package cz.vkr.letani;

import cz.vkr.dto.Draha;
import cz.vkr.dto.Letiste;
import cz.vkr.enums.Okruh;
import cz.vkr.enums.Povrch;
import cz.vkr.enums.Sluzba;

public class Main {

	public static void main(String[] args) {

		
		Letiste lkmb = new Letiste("LKMB",Sluzba.RADIO.toString(),"123,610");
		
		lkmb.addDraha("23", 775, 100, Povrch.TRAVA.toString(), Okruh.PRAVY.toString(), 225);
		lkmb.addDraha("05", 775, 100, Povrch.TRAVA.toString(), Okruh.LEVY.toString(), 45);
		lkmb.addDraha("16", 900, 100, Povrch.TRAVA.toString(), Okruh.PRAVY.toString(), 155);
		lkmb.addDraha("34", 900, 100, Povrch.TRAVA.toString(), Okruh.LEVY.toString(), 335);

				
		System.out.println(lkmb.toString()); // vypise vsechny informace, ktere ma
		
		
	
		//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
		// tady se dá ruzne blbnout :-) 
		
		Draha draha23 = lkmb.getDrahaPodleNazvu("23");
		
		// ted drahu 23 polejeme asfaltem:
		draha23.setPovrch(Povrch.ASFALT.toString());
		
		// vypisu si info o nove upravene draze: 
		System.out.println(draha23.toString());
		
		// POZOR! upravuju odkaz na tu dráhu ze systemu letiste, takze, když si vypisu informace o vsech drahach na letisti, tak tam bude 23, ze je asfaltova ;-) :
		System.out.println(lkmb.toString());
		
		
	
	}

}
