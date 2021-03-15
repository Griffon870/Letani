package cz.vkr.dto;

public class Vitr {

	
	private int smer;
	private double rychlost;
	private double narazy;
	
	
	
	public Vitr(int smer, double rychlost, double narazy) {
		super();
		this.smer = smer;
		this.rychlost = rychlost;
		this.narazy = narazy;
	}
	public int getSmer() {
		return smer;
	}
	public void setSmer(int smer) {
		this.smer = smer;
	}
	public double getRychlost() {
		return rychlost;
	}
	public void setRychlost(double rychlost) {
		this.rychlost = rychlost;
	}
	public double getNarazy() {
		return narazy;
	}
	public void setNarazy(double narazy) {
		this.narazy = narazy;
	}
	
	@Override
	public String toString() {
		return "Vitr: "+"smer:"+getSmer()+", rychlost:"+getRychlost()+", narazy:"+getNarazy();
	}
	
	
	
	
}
