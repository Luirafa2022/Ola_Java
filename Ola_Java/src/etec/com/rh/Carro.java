package etec.com.rh;

public class Carro extends Auto {
	
	public String Compra() {
		
		this.setNomecarro("Porche");
		this.setAno(1999);
		this.setMarca("Porche");
		this.setValor(22000.50);
	
		
		return this.getNomecarro();
	}

}
