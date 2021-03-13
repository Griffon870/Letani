package cz.vkr.letani;

/**
 * Main trida programu. po spusteni progrmu se s pusti main metoda v teto tride
 * @author vkral
 *
 */
public class Main {

	public static void main(String[] args) {		
		HlavniProgram program = new HlavniProgram(args); // vytvarim objekt program, je to jedna instance tridy HlavniProgram
		program.spustit();	
	}
}
