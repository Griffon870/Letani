package cz.vkr.dto;

public class Pocasi {
	
	
	private int teplota;
	private int tlak;
	private int rosnyBod;
	private int dohlednost;
	
	private Vitr vitr;

	public int getTeplota() {
		return teplota;
	}

	public void setTeplota(int teplota) {
		this.teplota = teplota;
	}

	public int getTlak() {
		return tlak;
	}

	public void setTlak(int tlak) {
		this.tlak = tlak;
	}

	public int getRosnyBod() {
		return rosnyBod;
	}

	public void setRosnyBod(int rosnyBod) {
		this.rosnyBod = rosnyBod;
	}

	public int getDohlednost() {
		return dohlednost;
	}

	public void setDohlednost(int dohlednost) {
		this.dohlednost = dohlednost;
	}

	public Vitr getVitr() {
		return vitr;
	}

	public void setVitr(Vitr vitr) {
		this.vitr = vitr;
	}
	
	

}
