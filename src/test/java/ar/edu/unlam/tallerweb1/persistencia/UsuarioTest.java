package ar.edu.unlam.tallerweb1.persistencia;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

// Clase que prueba la conexion a la base de datos. Hereda de SpringTest por lo que corre dentro del contexto
// de spring
public class UsuarioTest extends SpringTest{

    @Test
    @Transactional
    @Rollback(true)
    public void UsuarioTest(){
    	Usuario facu = new Usuario();
    	facu.setSurname("Migliorini");
    	facu.setName("Facundo");
    	facu.setEmail("facu@test.com");
    	// Obtengo la fucking sesion para interactuar con la fucking DB
    	getSession().save(facu);
    	// assertThat -> hacer esto
    	assertThat(getSession().get(Usuario.class, facu.getId())).isNotNull();
    }
}


// LA CLASE QUE VIENE VAMOS A VER CRITERIA ( criterios para obtener registros de la base de datos )