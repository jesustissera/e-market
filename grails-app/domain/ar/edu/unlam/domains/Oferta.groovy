package ar.edu.unlam.domains

class Oferta {
	String texto;
	Usuario miusuario;
	
	public Oferta (String texto,Usuario miusuario){
		this.texto = texto;
		this.miusuario = miusuario;
	}

    static constraints = {
		//texto(blank:false);
    }
}
