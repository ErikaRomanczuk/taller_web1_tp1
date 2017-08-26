package ar.edu.unlam.tallerweb1.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDepto {

	@Test
	public void test() {
		// fail("Not yet implemented");
		Departamento depto = new Departamento();
		depto.setNombre("TEST");
		Gerente ger = new Gerente();
		ger.setNombre("gato");
		ger.setDepartamento(depto);
		System.out.println(ger.getDepartamento().getNombre());
	}

}
