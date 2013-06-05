package ar.edu.unlam.domains

class Usuario {
	String nombre;
	String rol;
	int id;
	
	static hasMany = [listaofertas:Oferta];
	
	public Usuario(int id,String nombre,String rol){
		this.id = id;
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
		nuevaoferta.save()
	}
}
