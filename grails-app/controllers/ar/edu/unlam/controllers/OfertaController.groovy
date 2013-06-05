package ar.edu.unlam.controllers

import ar.edu.unlam.domains.Oferta;

class OfertaController {

    def index() {render "HOLA" }
	def scaffold= Oferta
	
	def pasar(){
		def ofertas = Oferta.findAll()
		render ([of:ofertas])
		
	}
	
}


