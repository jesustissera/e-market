package ar.edu.unlam.controllers

import ar.edu.unlam.domains.Oferta
import ar.edu.unlam.domains.Usuario

class UsuarioController {

    def index() { 
		//render(view:"/usuario/ofertar")
		redirect(action:'ofertarProducto')
	}
	
	def ofertarProducto(String mensaje){
		//mensaje = params.CampoOferta;
		//def usuario = new Usuario(nombre:'pepe',rol:'UsuarioLogueado')
		//def mioferta = new Oferta(texto: '${mensaje}')
		//usuario.ofertar(mioferta)
		
		//def miOferta = new Oferta(texto:${mensaje}); 
		
	}
	
	def mostrarOferta(){
		//def mensaje = params.CampoOferta;
		def usuario  = new Usuario(id:1,nombre:'pepe',rol:'UsuarioLogueado')
		def mioferta = new Oferta(texto: params.CampoOferta,miusuario:usuario,fecha:new Date())
	
		//usuario.ofertar(mioferta)
		usuario.save()
		mioferta.save()
		
		def misOfertas = Oferta.withCriteria {
			miusuario
			{
				eq "nombre",usuario.nombre
			}
		};		//def u = usuario.save()
		

		//flash.message = "${usuario.listaofertas.texto}"
		//def staticoferta=[ofertas : u]

		render(template:'mostrarOfertaTemplate',collection:misOfertas,var:'CampoOferta')	
	    
		}	
	

}
