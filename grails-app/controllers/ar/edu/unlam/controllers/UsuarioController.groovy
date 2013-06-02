package ar.edu.unlam.controllers

import ar.edu.unlam.domains.Oferta
import ar.edu.unlam.domains.Usuario

class UsuarioController {

    def index() { 
		//render(view:"/usuario/ofertar")
	}
	
	def ofertarProducto(String mensaje){
		//mensaje = params.CampoOferta;
		//def usuario = new Usuario(nombre:'pepe',rol:'UsuarioLogueado')
		//def mioferta = new Oferta(texto: '${mensaje}')
		//usuario.ofertar(mioferta)
		
		//def miOferta = new Oferta(texto:${mensaje}); 
	}
	
	def mostrarOferta(){
		def mensaje = params.CampoOferta;
		def usuario = new Usuario(nombre:'pepe',rol:'UsuarioLogueado')
		def mioferta = new Oferta(texto: '${mensaje}')
		usuario.ofertar(mioferta)
		flash.message = "${mensaje}"
		
	}
}
