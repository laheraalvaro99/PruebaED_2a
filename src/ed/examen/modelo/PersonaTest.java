package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	Persona p = new Persona("1807508D", "Alvaro", "Martinez");

	
	@Test
	void testPersonaStringStringString() {
		 assertEquals("1807508D", p.getDni());
	}

	@Test
	void testGetDni() {
		assertEquals("1807508D",p.getDni());
	}

	@Test
	void testSetDni() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

}
