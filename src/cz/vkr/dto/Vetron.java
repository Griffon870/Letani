package cz.vkr.dto;

import cz.vkr.nastroje.Nastroje;

public class Vetron extends Letoun{

	private int klouzak;
	private boolean vodnik;
	private boolean samostart;
	private boolean klapka;
	
	
	public Vetron(String registrace, String nazev, int rozpeti, int cenaLetoveHodiny, int vne,int cenaLetadla, int klouzak,
			boolean vodnik, boolean samostart, boolean klapka) {
		super(registrace, nazev, rozpeti, cenaLetoveHodiny, vne, cenaLetadla);
		this.klouzak = klouzak;
		this.vodnik = vodnik;
		this.samostart = samostart;
		this.klapka = klapka;
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


	public boolean isSamostart() {
		return samostart;
	}


	public void setSamostart(boolean samostart) {
		this.samostart = samostart;
	}


	public boolean isKlapka() {
		return klapka;
	}


	public void setKlapka(boolean klapka) {
		this.klapka = klapka;
	}
	
	
	
	
	@Override
	public String toString() {
		String info = "Informace o Vetroni: "+getRegistrace()+"\n";
		info+="Nazev: "+getNazev()+", Rozpeti: "+getRozpeti()
		+", Cena letove hodiny: "+getCenaLetoveHodiny()+", VNE: "+getVne()+", Klouzak: "+getKlouzak()
		+", Vodnik: "+Nastroje.prelozBoolean(vodnik)+", Samostart: "+Nastroje.prelozBoolean(samostart)
		+", Klapka: "+Nastroje.prelozBoolean(klapka)+", Cena letadla: "+getFormatovanaCenaLetadla();		
		return info;
	}


	
	
}
