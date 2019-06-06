package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import dominio.Alumno;
import dominio.AnioAcademico;
import dominio.Carrera;
import dominio.ImplementacionCarrera;
import dominio.Materia;
import jdk.nashorn.internal.runtime.ListAdapter;

class Test {

	private static final ArrayList<ImplementacionCarrera> ListadoAlumno = null;

	@org.junit.jupiter.api.Test
	void test01() {
		//arrange
		//preparar todo
		String expectedNombre = "Licenciatura en Enologia";
		String expectedAbreviatura = "Lic. Enolog";
		String expectedPlan = "128/12";
		//act
		//donde se hace todo
		Carrera c01 = new Carrera(expectedNombre, expectedAbreviatura, expectedPlan);
		String actualNombre = c01.getNombre();
		String actualAbreviatura = c01.getAbreviatura();
		String actualPlan = c01.getPlan();
		
		//asser
		//donde se controla
		assertEquals(expectedNombre, actualNombre);
		assertEquals(expectedAbreviatura, actualAbreviatura);
		assertEquals(expectedPlan, actualPlan);
	}
	
	@org.junit.jupiter.api.Test
	void test02() {//equals de la carreara con el plan
		//arrange
		//preparar todo
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist", "071/08");
		Carrera c02 = new Carrera("Licenciatura en Sistemas", "Lic. Sist", "070/08");
		Carrera c03 = new Carrera("Ingenieria en Sistemas", "Lic. Sist", "071/08");
		//act
		//donde se hace todo
		boolean actual01 = c01.equals(c02);
		boolean actual02 = c01.equals(c02);
		
		//asser
		//donde se controla
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		
	}
	
	@org.junit.jupiter.api.Test
	void test03() {//validar la construccion de una materia 
		//arrange
		//preparar todo
		String expectedNombre = "Programacion 2";
		String expectedAbreviatura  = "Lic Sistemas";
		AnioAcademico esperandoAnio = AnioAcademico.TERCERO;
		
		//act
		//donde se hace todo
		Materia m01 = new Materia(expectedNombre, expectedAbreviatura, esperandoAnio);
		String actualNombre = m01.getNombre();
		String actualAbreviatura = m01.getAbreviatura();
		AnioAcademico actualAnio = m01.getAnio();
		//asser
		//donde se controla
		
		assertEquals(expectedNombre, actualNombre);
		assertEquals(expectedAbreviatura, actualAbreviatura);
		assertEquals(esperandoAnio, actualAnio);
	}
	
	@org.junit.jupiter.api.Test
	void test04() {//validar equals de materia solamente con  el nombre
		//arrange
		//preparar todo
		Materia m01 = new Materia("Programacion II", "Prog II", AnioAcademico.TERCERO);
		Materia m02 = new Materia("Programacion II", "Prog II", AnioAcademico.TERCERO);
		Materia m03 = new Materia("Programacion I", "Prog I", AnioAcademico.SEGUNDO);
		//act
		//donde se hace todo
		boolean actual01 = m01.equals(m02);
		boolean actual02 = m01.equals(m03);
		
		//asser
		//donde se controla
		assertEquals(true, actual01);
		assertEquals(false,actual02);
		
	}
	
	@org.junit.jupiter.api.Test
	void test05_a() {//agregar materias
		//arrange
		//preparar todo
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. en Sist", "071/08");
		Materia m01 = new Materia("Programacion II", "Prog II", AnioAcademico.TERCERO);
		Materia m02 = new Materia("Programacion II", "Prog II", AnioAcademico.TERCERO);
		String listadoMaterias [] = {"ProgramacionII", "Programacion I"};
		//act
		//donde se hace todo
		boolean actual01 = c01.addMateria(m01);
		boolean actual02 = c01.addMateria(m01);
		String nombreActual01 = m01.getNombre();
		String abreviaturaActual = m01.getAbreviatura();
		AnioAcademico anio = m01.getAnio();
		
		//asser
		//donde se controla
		assertEquals(true, actual01);
		assertEquals(false, actual02);
		String nombreActual1 = m01.getNombre();
		String abreviaturaActual1 = m01.getAbreviatura();
		AnioAcademico anioactual = m01.getAnio();

		
		assertEquals(listadoMaterias,actual02);
		
	}
	
	@org.junit.jupiter.api.Test
	void test05_b() {//validar un metodo de la carrera que:
		//permita agregar materias, valide no se permita de materias duplicadas, valide carga maxima de 10 materias
		//arrange
		//preparar todo
		Materia m01 = new Materia("Programacion II", "Prog II", AnioAcademico.TERCERO);
		//String esperado01 = ("Programacion II", "Prog II", AnioAcademico.TERCERO);
		Materia m02 = new Materia("Programacion II", "Prog II", AnioAcademico.TERCERO);
		//String esperado02 = ("Programacion II", "Prog II", AnioAcademico.SEGUNDO);
		Materia m03 = new Materia("Programacion I", "Prog I", AnioAcademico.SEGUNDO);
		//String esperado03 = ("Programacion I", "Prog I", AnioAcademico.SEGUNDO);
		//act
		//donde se hace todo
		boolean actual01 = m01.equals(m02);
		boolean actual02 = m01.equals(m03);
		
		//asser
		//donde se controla
		assertEquals(true, actual01);
		assertEquals(false,actual02);
		
	}
	
	@org.junit.jupiter.api.Test
	void test06() {//mostrar materias de un año
		//arrange
		//preparar todo
		Materia m01 = new Materia("Programacion II", "Prog II", AnioAcademico.TERCERO); 
		Materia m02 = new Materia("Sistemas II", "Sis II", AnioAcademico.TERCERO);
		Materia m03 = new Materia("Seminario I", "Sem I", AnioAcademico.TERCERO);
		ArrayList listado = new ArrayList();
		listado= ("Programacion II" + "Sistemas II" + "Semenario I");
		//act
		//donde se hace todo
		Materia actual01 = getMateria();
		Materia actual02 = getMateria();
		Materia actual03 = getMateria();
		String anio = getListadoMaterias();
		
		
		//asser
		//donde se controla
		assertEquals(anio, listado);
	}

	@org.junit.jupiter.api.Test
	void test07() {//
		//arrange
		//preparar todo
		Carrera c01 = new Carrera("Licenciatura en Sistemas ", "Lic. Sist", "071/02");
		Materia m02 = new Materia("Programacion II", "Prog II", AnioAcademico.TERCERO);
		String listadoMaterias [] = {"ProgramacionII", "Programacion I"};
		//act
		//donde se hace todo
		boolean actual01 = c01.addMateria(m02);
		boolean actual02 = c01.addMateria(m02);

		String [] actual03 = c01.getMateria(AnioAcademico.TERCERO);
		
		//asser
		//donde se controla
		assertEquals(true, actual01);
		assertEquals(false, actual01);//se valida que no se cargue 2 materias con el mismo nombre
		

		
		assertEquals(listadoMaterias,actual02);
		
	}
	
	@org.junit.jupiter.api.Test
	void test08() {//VALIDAR MATERIA
		//arrange
		//preparar todo
		Materia m01 = new Materia("Programacion II", "Prog II", AnioAcademico.III); 
		String anioCalendario = "2019";
		String fechaInicio = "01/01";
		String fechaFin = "12/12";
		Alumno listadoAlumnos[] = null;
		Implementacion imp01 = new Implementacion(m01, anioCalendario, fechaInicio, fechaFin);
		
		//act
		//donde se hace todo
		Materia actual01 = imp01.getMateria();
		String actual02 = imp01.getMateria();
		String actual03 = imp01.getMateria();
		String actual04 = imp01.getMateria();
		
		
		//asser
		//donde se controla
		assertEquals(actual01, true);
		assertEquals(actual02, false);
		assertEquals(actual03, false);
		assertEquals(actual04, false);
	}
	
	@org.junit.jupiter.api.Test
	void test09() {//agregar alumnos
		//arrange
		//preparar todo
		Materia m01 = new Materia("Algoritmo y Estructura de Datos", "Algorit y Estruc de Datos", AnioAcademico.PRIMERO);
		Alumno al01 = new Alumno("Juan", "Perez", "132654", "789456", "Licenciatura en Sistemas");
		Alumno al02 = new Alumno("Augusto", "Lopez", "6548792", "98745321", "Licenciatura en Sistemas");
		ImplementacionCarrera imp01 = new ImplementacionCarrera(m01, "2019", "12/07", "12/12", ListadoAlumno);
		String carreraEsperada = "Licenciatura en Sistemas";
		
		//act
		//donde se hace todo
		boolean actual01 = imp01.addAlumno(al01);
		boolean actual02 = imp01.addAlumno(al01);
		
		String actual03 = al01.getCarreraInscripta();
		String actual04 = al02.getCarreraInscripta();
		
		//asser
		//donde se controla
		assertEquals(true, actual01);
		assertEquals(false, actual01);//se valida que no se cargue 2 alumnos con el mismo nombre y carrera
		
		assertArrayEquals(carreraEsperada, actual03);
		assertArrayEquals(carreraEsperada, actual04);
	}

}
