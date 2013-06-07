package ar.edu.unlam.domains

class Oferta {
	String texto;
	Usuario miusuario;
	Date	fecha;

			
		public Oferta (String texto,Usuario miusuario,Date fecha){
		this.texto = texto;
		this.miusuario = miusuario;
		this.fecha = fecha;
		
		}

    static constraints = {
		//texto(blank:false);
    }
}
