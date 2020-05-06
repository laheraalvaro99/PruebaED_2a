package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private List<Persona> listaAlumnos;

	/**
	 * Documentar y crear test unitario
	 * @author Alvaro Martinez Lahera
	 * @version 1.0 03/05/2020
	 * @param dni
	 *  @return dni
	 *  @exception caundo el String metido es de una longitud diferente a 9, salta la exceptino
	  */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/**
	 * Documentar y crear test unitario
	 *@param persona 
	 * @return añade personas a la lista de alumno
	  */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	/**
	 * Documentar y crear test unitario
	 * @param dni
	 * @return dni caundo el dni puesto es el mismo que hay en la array retorna true, si no, retorna false
	  */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	/**
	 * Documentar y crear test unitario
	 * @param arraylist
	 * @return creas una array de persona llamada listaAlumnos
	  */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
