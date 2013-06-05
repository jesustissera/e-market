package ar.edu.unlam.domains



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Usuario)
class UsuarioTests {

    void testOfertar() {
       def miusuario = new Usuario(nombre:'pepe',rol:'Usuario');
	   def mioferta = new Oferta(texto:'Esta es mi primera oferta')
	   miusuario.ofertar(mioferta)
	   def mioferta2 = new Oferta(texto:'Esta es mi segunda oferta')
	   miusuario.ofertar(mioferta2)
	   assert miusuario.listaofertas.size() == 2
	   println miusuario.listaofertas.texto
    }
	
	void testGuardarEnDB() {
		def miusuario = new Usuario(nombre:'pepe',rol:'Usuario');
		
		def mioferta = new Oferta(texto:'Esta es mi primera oferta')
		def mioferta2 = new Oferta(texto:'Esta es mi segunda oferta')
		
		miusuario.ofertar(mioferta)
		miusuario.ofertar(mioferta2)
		
		miusuario.save();
		println Usuario.get(1).nombre
		println Usuario.get(1).listaofertas.texto
		
		//assert miusuario.listaofertas.size() == 2
	 }
}
