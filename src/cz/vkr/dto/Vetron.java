package cz.vkr.dto;

public class Vetron extends Letoun {

	private int klouzak;
	private boolean vodnik;
	
	
	public Vetron(String registrace, String nazev, int rozpeti, int cenaLetoveHodiny, int vne, int klouzak,
			boolean vodnik) {
		super(registrace, nazev, rozpeti, cenaLetoveHodiny, vne);
		this.klouzak = klouzak;
		this.vodnik = vodnik;
	}


	public int getKlouzak() {
		return klouzak;
	}


	public void setKlouzak(int klouzak) {
		this.klouzak = klouzak;
	}


	public boolean isVodnik() {
		return vodnik;
	}


	public void setVodnik(boolean vodnik) {
		this.vodnik = vodnik;
	}
	
	
	
	
	
	
	
	
	
	
	
}
