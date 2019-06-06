package dominio;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
	private String nombre;
	private String abreviatura;
	private String plan;
	private ArrayList<Materia> listadoMaterias;
	
	public Carrera() {
		this.nombre ="";
		this.abreviatura = "";
		this.plan = "";
	}

	public Carrera(String nombre, String abreviatura, String plan) {
		super();
		this.nombre = nombre;
		this.abreviatura = abreviatura;
		this.plan = plan;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre = nombre;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getNombreEnMayusculas() {
		return nombre.toUpperCase();
	}

	public String getTipoOracion() {
		//nombre.substring(0,1).toUpperCase(); sirve para devolver la 1era letra en mayuscuala
		return nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toUpperCase();
	}

	public String getNombreAUno() {
		String [] nombreDividido = nombre.split(" ");
		String nombre = "";
		for (int i = 0; i<nombreDividido.length; i++)
			if (nombreDividido[i].length() > 3 )
				nombre += nombreDividido[i].substring(0,1);
			
		return nombre;
	}

	public String getBuscarNobreCarrera() {
		//String nombreCarrera [] = abreviatura.eq;
		return null;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((plan == null) ? 0 : plan.hashCode());
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
		Carrera other = (Carrera) obj;
		if (plan == null) {
			if (other.plan != null)
				return false;
		} else if (!plan.equals(other.plan))
			return false;
		return true;
	}

	public boolean addMateria(Materia m01) {
		int tamanio = listadoMaterias.size();
		if(tamanio<=3 && recorrido(listadoMaterias, m01) == true)
			return true;
		return false;
	}
	
	public boolean recorrido(ArrayList<Materia> listadoMaterias2, Materia m01) {
		for(int i = 0; i<= listadoMaterias2.size() ;i++)
			if(m01 == listadoMaterias2.get(i))
				return false;
		return true;
	}
	
	public ArrayList<Materia> mostrarMateria(ArrayList<Materia> Listado) {
		int tamanio = listadoMaterias.size();
		for(int i = 0; i<tamanio; i++);
			return Listado;
	}
}
