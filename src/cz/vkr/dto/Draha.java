package cz.vkr.dto;

import java.util.Comparator;

public class Draha {

	private String nazev; // neni to int, muze byt napriklad 23L
	private int delka;
	private int sirka;
	private String povrch;
	private String okruh;
	private int magnetickySmer;
	
	
	public Draha(String nazev, int delka, int sirka, String povrch, String okruh, int magnetickySmer) {
		super();
		this.nazev = nazev;
		this.delka = delka;
		this.sirka = sirka;
		this.povrch = povrch;
		this.okruh = okruh;
		this.magnetickySmer = magnetickySmer;
	}
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	public int getDelka() {
		return delka;
	}
	public void setDelka(int delka) {
		this.delka = delka;
	}
	public int getSirka() {
		return sirka;
	}
	public void setSirka(int sirka) {
		this.sirka = sirka;
	}
	public String getPovrch() {
		return povrch;
	}
	public void setPovrch(String povrch) {
		this.povrch = povrch;
	}
	public String getOkruh() {
		return okruh;
	}
	public void setOkruh(String okruh) {
		this.okruh = okruh;
	}
	public int getMagnetickySmer() {
		return magnetickySmer;
	}
	public void setMagnetickySmer(int magnetickySmer) {
		this.magnetickySmer = magnetickySmer;
	}
	
	
	
	
		
	@Override
	public String toString() {
		String info = "Informace o dráze: "+getNazev()+"\n";
		info+="Nazev: "+getNazev();
		info+=", Delka: "+getDelka();
		info+=", Sirka: "+getSirka();
		info+=", Povrch: "+getPovrch();
		info+=", Okruh: "+getOkruh();
		info+=", Magneticky smer: "+getMagnetickySmer();
		return info;
	}	
	
	
	
	public static Comparator<Draha> DrahaSmerComparator = new Comparator<Draha>() {

		public int compare(Draha d1, Draha d2) {

			int smer1 = d1.getMagnetickySmer();
			int smer2 = d2.getMagnetickySmer();

			return smer1 - smer2;
		}
	};
	
	
}
