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
	   def mioferta = new Oferta(texto:'Esta es mi oferta')
	   miusuario.ofertar(mioferta)
	   assert miusuario.Listaofertas.size() == 1
    }
}
