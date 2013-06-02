package ar.edu.unlam.domains

class Usuario {
	String nombre;
	String rol;
	
	static hasMany = [listaofertas:Oferta];
	
	public Usuario(String nombre,String rol){
		this.nombre = nombre;
		this.rol = rol;
	}
	
	//def conversacion = [oferta:ofertas];
	
    static constraints = {
		//nombre(blank:false)
		//rol(blank:false)
    }
	
	public void ofertar(Oferta nuevaoferta){
		//def miOferta = new Oferta(texto:mioferta.texto);
		addToListaofertas(nuevaoferta)
	}
}
