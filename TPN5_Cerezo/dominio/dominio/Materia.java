package dominio;

import java.util.ArrayList;

public class Materia {
	
	private String nombre;
	private String Abreviatura;
	private AnioAcademico anio;
	
	
	
	public Materia() {
		this.nombre = "";
		this.Abreviatura = "";
		this.anio = null;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getAbreviatura() {
		return Abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		Abreviatura = abreviatura;
	}

	public AnioAcademico getAnio() {
		return anio;
	}

	public void setAnio(AnioAcademico anio) {
		this.anio = anio;
	}

	public Materia(String nombre, String Abreviatura, AnioAcademico anio) {
		this.nombre = nombre;
		this.Abreviatura = Abreviatura;
		this.anio = anio;
		
	}
	
	public String getNombreFormatoUno() {
		
		return null;
	}

	public String getNombreFormatoDos() {
		String [] nombreMateria = nombre.split(" ");
		
		for(int i = 0; i<nombreMateria.length; i++) {
			if(nombreMateria[i].length() > 3)
				nombre += nombreMateria[i].substring(0, 4);
		}
		return nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Materia other = (Materia) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
	
	
}
