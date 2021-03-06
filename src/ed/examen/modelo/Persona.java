package ed.examen.modelo;

public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	/**
	 * Documentar y crear test unitario
	 * @author Alvaro Martinez lahera
	 * @version 1.0 03/05/2020
	 * @param dni
	 * @param nombre
	 * @param apellido
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/**
	 * Documentar y crear test unitario
	 * @param dni
	 * @return dni devuelve el String del dni introducido en el contructor.
	 */
	public String getDni() {
		return dni;
	}
	
	
	/**
	* Documentar y crear test unitario
	 * @param dni 
	 * @return dni devuelve el String metido 
	 * @exception caundo el ultimo caracter del String no es una letra, lanza la exception
	  */
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	/**
	* Documentar y crear test unitario
	 * @param nombre
	 * @return nombre devuelve el String introducido en el contructor
	  */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Documentar y crear test unitario
	 * @param nombre
	 * @return nombre devuelve el parametro metido 
	  */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	* Documentar y crear test unitario
	 * @param  apellido1
	 * @return apellido1 devuelve el String introducido en el contructor
	  */
	public String getApellido1() {
		return apellido1;
	}
	
	/**
	* Documentar y crear test unitario
	 * @param apellido1
	 * @return apellido1 devuelve el parametro metido
	  */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
