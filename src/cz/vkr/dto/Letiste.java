package cz.vkr.dto;

import java.util.ArrayList;

import cz.vkr.enums.Okruh;
import cz.vkr.enums.Povrch;

public class Letiste {

	private String nazev;
	private String sluzba;
	private String frekvence;
	private ArrayList<Draha> drahy;
	private ArrayList<Letoun> letadla;

	/**
	 * konstruktor, ktery nema list drah a list letadel - ty se pak pridavaji pomoci setteru
	 * @param nazev
	 * @param sluzba
	 * @param frekvence
	 */
	public Letiste(String nazev, String sluzba, String frekvence) {
		super();
		this.nazev = nazev;
		this.sluzba = sluzba;
		this.frekvence = frekvence;
		letadla = new ArrayList<Letoun>();
		drahy = new ArrayList<Draha>();
	}

	/**
	 * Prida novou drahu do systemu drah
	 * @param nazev
	 * @param delka
	 * @param sirka
	 * @param povrch
	 * @param okruh
	 * @param magnetickySmer
	 */
	public void addDraha(String nazev, int delka, int sirka, String povrch, String okruh, int magnetickySmer) {
		drahy.add(new Draha(nazev, delka, sirka, povrch, okruh, magnetickySmer));
	}	
	
	/**
	 * metoda pro pridani motorovyho letadla 
	 * @param registrace
	 * @param nazev
	 * @param rozpeti
	 * @param cenaLetoveHodiny
	 * @param vne
	 * @param palivo
	 */
	public void addLetadlo(String registrace, String nazev, int rozpeti, int cenaLetoveHodiny, int vne,int cena,  String palivo) {
		letadla.add(new Motorak(registrace, nazev, rozpeti, cenaLetoveHodiny, vne,cena, palivo));
	}
	
	/**
	 * Pretizena! metoda pro pridani vetrone
	 * @param registrace
	 * @param nazev
	 * @param rozpeti
	 * @param cenaLetoveHodiny
	 * @param vne
	 * @param klouzak
	 * @param vodnik
	 * @param samostart
	 * @param klapka
	 */
	public void addLetadlo (String registrace, String nazev, int rozpeti, int cenaLetoveHodiny, int vne,int cena, int klouzak, boolean vodnik, boolean samostart, boolean klapka) {
		letadla.add(new Vetron(registrace, nazev, rozpeti, cenaLetoveHodiny, vne,cena, klouzak, vodnik, samostart, klapka));
	}
	
	
	
	/**
	 * Vyhleda a vrati drahu podle nazvu
	 * @param nazev
	 * @return
	 */
	public Draha getDrahaPodleNazvu(String nazev) {
	
		for (Draha draha : drahy) {
			if(draha.getNazev().equals(nazev)) {
				return draha;
			}
		}		
		return null;		
	}
	
	
	/**
	 * Zajimava metoda.....  v listu letadel mam instance i motoraku i vetronu! je to jeden pytel.
	 * @return
	 */
	public ArrayList<Vetron> getVetrone() {
		ArrayList<Vetron> vetrone = new ArrayList<Vetron>();
		
		for (Letoun letoun : letadla) {
			if (letoun instanceof Vetron) vetrone.add((Vetron)letoun);
		}
		return vetrone;
	}
	
	public ArrayList<Motorak> getMotoraky() {
		ArrayList<Motorak> motoraky = new ArrayList<Motorak>();
		
		for (Letoun letoun : letadla) {
			if (letoun instanceof Motorak) motoraky.add((Motorak)letoun);
		}
		return motoraky;
	}
	
	/**
	 * neni hezky napsany 
	 * @param registrace
	 */
	public void odeberLetadloPodleRegistrace(String registrace) {
		int poziceProSmazani = -1;
		for (int i = 0; i < letadla.size(); i++) {
			if(letadla.get(i).getRegistrace().equals(registrace)) {
				poziceProSmazani = i;
			}			
		}
		if(poziceProSmazani != -1) {
		letadla.remove(poziceProSmazani);
		}
		
	}
	

	public String getNazev() {
		return nazev;
	}

	public void setNazev(String nazev) {
		this.nazev = nazev;
	}

	public String getSluzba() {
		return sluzba;
	}

	public void setSluzba(String sluzba) {
		this.sluzba = sluzba;
	}

	public String getFrekvence() {
		return frekvence;
	}

	public void setFrekvence(String frekvence) {
		this.frekvence = frekvence;
	}

	public ArrayList<Draha> getDrahy() {
		return drahy;
	}

	public void setDrahy(ArrayList<Draha> drahy) {
		this.drahy = drahy;
	}

	public ArrayList<Letoun> getLetadla() {
		return letadla;
	}

	public void setLetadla(ArrayList<Letoun> letadla) {
		this.letadla = letadla;
	}

	@Override
	public String toString() {

		int pocetDrah = getDrahy().size();
		int pocetLetadel = getLetadla().size();

		String ret = "Informace o letisti: " + getNazev() + ":\n";
		ret+="Sluzba: "+getSluzba()+"\n";
		ret+="Frekvence: "+getFrekvence()+"\n";
		ret += "Pocet drah na letisti: " + pocetDrah + "\n";
		ret += "Pocet letadel na letisti: " + pocetLetadel + "\n";
		
		ret+="\n------------------------------------------ DRAHY -------------------------------------------------\n";
		if (pocetDrah > 0) {
			for (Draha draha : drahy) {
				ret += draha.toString() + "\n";
			}
		}
		ret+="\n------------------------------------------LETADLA-------------------------------------------------\n";
		if (pocetLetadel > 0) {
			for (Letoun ero : letadla) {
				ret += ero.toString() + "\n";
			}
		}						
		return ret;
	}
}
