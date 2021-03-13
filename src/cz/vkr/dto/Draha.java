package cz.vkr.dto;

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
		info+="-Nazev: "+getNazev()+"\n";
		info+="-Delka: "+getDelka()+"\n";
		info+="-Sirka: "+getSirka()+"\n";
		info+="-Povrch: "+getPovrch()+"\n";
		info+="-Okruh: "+getOkruh()+"\n";
		info+="-Magneticky smer: "+getMagnetickySmer()+"\n";
		return info;
	}
	
	
	
	
	
}
