package ar.edu.unlam.domains

class Usuario {
	String nombre;
	String rol;

    static constraints = {
		nombre(blank:false)
		rol(blank:false)
    }
}
