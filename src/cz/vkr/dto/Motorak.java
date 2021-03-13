package cz.vkr.dto;

public class Motorak extends Letoun {

	private String palivo;

		
	
	

	public Motorak(String registrace, String nazev, int rozpeti, int cenaLetoveHodiny, int vne, String palivo) {
		super(registrace, nazev, rozpeti, cenaLetoveHodiny, vne);
		this.palivo = palivo;
	}
	
	

	public String getPalivo() {
		return palivo;
	}

	public void setPalivo(String palivo) {
		this.palivo = palivo;
	}
}
