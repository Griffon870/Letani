package cz.vkr.dto;

public class Motorak extends Letoun {

	private String palivo;

		
	
	

	public Motorak(String registrace, String nazev, int rozpeti, int cenaLetoveHodiny, int vne,int cenaLetadla, String palivo) {
		super(registrace, nazev, rozpeti, cenaLetoveHodiny, vne, cenaLetadla);
		this.palivo = palivo;
	}
	
	

	public String getPalivo() {
		return palivo;
	}

	public void setPalivo(String palivo) {
		this.palivo = palivo;
	}
	
	@Override
	public String toString() {
		String info = "Informace o Motoraku: "+getRegistrace()+"\n";
		info+="Nazev: "+getNazev()+", Rozpeti: "+getRozpeti()+", Cena letove hodiny: "+getCenaLetoveHodiny()+", VNE: "+getVne()+", Palivo: "+getPalivo()+", Cena letadla: "+getFormatovanaCenaLetadla();
		
		
		
		return info;
	}






	
}
