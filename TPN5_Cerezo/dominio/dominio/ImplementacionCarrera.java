package dominio;

import java.util.ArrayList;

public class ImplementacionCarrera {
	private Materia materias;
	private String anioCalendario;
	private String fechaInicio;
	private String fechaFin;
	private ArrayList<ImplementacionCarrera> ListadoAlumno;
	
	public ImplementacionCarrera(Materia materias, String anioCalendario, String fechaInicio, String fechaFin,
			ArrayList<ImplementacionCarrera> listadoAlumno) {
		this.materias = materias;
		this.anioCalendario = anioCalendario;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		ListadoAlumno = listadoAlumno;
	}

	public boolean addAlumno(Alumno al01) {
		// TODO Auto-generated method stub
		return false;
	}

	public Materia getMaterias() {
		return materias;
	}

	public void setMaterias(Materia materias) {
		this.materias = materias;
	}

	public String getAnioCalendario() {
		return anioCalendario;
	}

	public void setAnioCalendario(String anioCalendario) {
		this.anioCalendario = anioCalendario;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public ArrayList<ImplementacionCarrera> getListadoAlumno() {
		return ListadoAlumno;
	}

	public void setListadoAlumno(ArrayList<ImplementacionCarrera> listadoAlumno) {
		ListadoAlumno = listadoAlumno;
	}
	
	
}
