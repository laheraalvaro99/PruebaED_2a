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
		try {
            p.setDni("1807508D");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            assertEquals("1807508A",p.getDni());
        }
	}

	@Test
	void testGetNombre() {
		assertEquals("Alvaro",p.getNombre());
	}

	@Test
	void testSetNombre() {
		 p.setNombre("victor");;
	        assertEquals("victor",p.getNombre());
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
