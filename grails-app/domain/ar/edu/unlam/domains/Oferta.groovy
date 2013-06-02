package ar.edu.unlam.domains

class Oferta {
	String texto;
	
	public Oferta (String texto){
		this.texto = texto;
	}

    static constraints = {
		//texto(blank:false);
    }
}
