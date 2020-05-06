package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {

	Persona p = new Persona("1807508D", "Alvaro", "Martinez");
	 Curso c = new Curso();
	
	@Test
	void testEliminarAlumno() {
		try {
            p.setDni("1807508D");
            assertEquals("1807508D",p.getDni());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

	@Test
	void testAniadirAlumno() {
		 int i = c.numeroAlumnos();
	        c.aniadirAlumno(p);
	        int j = c.numeroAlumnos();

	        assertEquals(i,j+1);
	}

	@Test
	void testEstaRegistrado() {
		 Boolean registrado = c.estaRegistrado("1807508D");
	        assertFalse(registrado);
	        assertEquals(false,c.estaRegistrado("1807508D"));
	}

	@Test
	void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

}
