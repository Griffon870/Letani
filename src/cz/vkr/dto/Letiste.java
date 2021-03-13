package cz.vkr.dto;

import java.util.ArrayList;

import cz.vkr.enums.Okruh;
import cz.vkr.enums.Povrch;

public class Letiste {

	private String nazev;
	private String sluzba;
	private String frekvence;
	private ArrayList<Draha> drahy;
	private ArrayList<Object> letadla;

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
		letadla = new ArrayList<Object>();
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
		this.drahy.add(new Draha(nazev, delka, sirka, povrch, okruh, magnetickySmer));
	}
	
	
	/**
	 * Vyhleda drahu podle nazvu
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

	public ArrayList<Object> getLetadla() {
		return letadla;
	}

	public void setLetadla(ArrayList<Object> letadla) {
		this.letadla = letadla;
	}

	@Override
	public String toString() {

		int pocetDrah = getDrahy().size();

		String ret = "Informace o letisti: " + getNazev() + ":\n";
		ret+="Sluzba: "+getSluzba()+"\n";
		ret+="Frekvence: "+getFrekvence()+"\n";
		ret += "Pocet drah na letisti: " + pocetDrah + "\n";
		if (pocetDrah > 0) {
			for (Draha draha : drahy) {
				ret += draha.toString() + "\n";
			}
		}
		return ret;
	}
}
