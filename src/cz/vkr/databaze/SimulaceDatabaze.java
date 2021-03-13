package cz.vkr.databaze;

import cz.vkr.dto.Letiste;
import cz.vkr.enums.Okruh;
import cz.vkr.enums.Povrch;
import cz.vkr.enums.Sluzba;

public class SimulaceDatabaze {

	
	/**
	 * Tady by se nacetla data z databaze
	 * @return
	 */
	public static Letiste nactiDataOLetisti() {
		// vytvori nove letiste
		Letiste mojeLetiste = new Letiste("LKMB", Sluzba.RADIO.toString(), "123,610");
		
		// do letiste prida drahovy system
		mojeLetiste.addDraha("23", 775, 100, Povrch.TRAVA.toString(), Okruh.PRAVY.toString(), 225);
		mojeLetiste.addDraha("05", 775, 100, Povrch.TRAVA.toString(), Okruh.LEVY.toString(), 45);
		mojeLetiste.addDraha("16", 900, 100, Povrch.TRAVA.toString(), Okruh.PRAVY.toString(), 155);
		mojeLetiste.addDraha("34", 900, 100, Povrch.TRAVA.toString(), Okruh.LEVY.toString(), 335);
		
		// letetiste prida letadla
		mojeLetiste.addLetadlo("OK-4716", "L13 Blanik", 16, 350, 250,450000, 28, false, false, true);
		mojeLetiste.addLetadlo("OK-3751", "PW-6", 15, 350, 260,500000, 34, false, false, false);
		mojeLetiste.addLetadlo("OK-0514", "VSO-10 Vosa", 15, 350, 260,150000, 34, false, false, false);
		mojeLetiste.addLetadlo("OK-HMB", "Husky", 7, 3200, 250,2000000, "Natural");
		mojeLetiste.addLetadlo("OK-MMC", "Cessna", 7, 4000, 250,3500000, "Natural");
		
		return mojeLetiste;
	}
	
	
	
}
