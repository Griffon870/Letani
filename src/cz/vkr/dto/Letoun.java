package cz.vkr.dto;

import cz.vkr.cons.Konstatnty;

public abstract class Letoun {

	private String registrace;
	private String nazev;
	private int rozpeti;
	private int cenaLetoveHodiny;
	private int vne;
	private int cenaLetadla;
	
		
	public Letoun(String registrace, String nazev, int rozpeti, int cenaLetoveHodiny, int vne, int cenaLetadla) {
		super();
		this.registrace = registrace;
		this.nazev = nazev;
		this.rozpeti = rozpeti;
		this.cenaLetoveHodiny = cenaLetoveHodiny;
		this.vne = vne;
		this.cenaLetadla = cenaLetadla;
	}
	public String getRegistrace() {
		return registrace;
	}
	public void setRegistrace(String registrace) {
		this.registrace = registrace;
	}
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	public int getRozpeti() {
		return rozpeti;
	}
	public void setRozpeti(int rozpeti) {
		this.rozpeti = rozpeti;
	}
	public int getCenaLetoveHodiny() {
		return cenaLetoveHodiny;
	}
	public void setCenaLetoveHodiny(int cenaLetoveHodiny) {
		this.cenaLetoveHodiny = cenaLetoveHodiny;
	}
	public int getVne() {
		return vne;
	}
	public void setVne(int vne) {
		this.vne = vne;
	}
	public int getCenaLetadla() {
		return cenaLetadla;
	}
	public void setCenaLetadla(int cenaLetadla) {
		this.cenaLetadla = cenaLetadla;
	}
	
	
	public String getFormatovanaCenaLetadla() {
		
		return getCenaLetadla()+Konstatnty.CESKA_KORUNA;
		
	}
	
	
	
	
	
	
	
	
}
