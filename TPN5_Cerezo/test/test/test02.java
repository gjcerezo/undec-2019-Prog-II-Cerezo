package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.AnioAcademico;
import dominio.Carrera;
import dominio.Materia;

class test02 {

	@Test
	/*
	 * 1.1 del test
	 */
	void test01() {
		//arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. en Sistemas", "071/08");
		String nombreEsperado = "LICENCIATURA EN SISTEMAS";
		
		//act
		String actual = c01.getNombreEnMayusculas();
		
		//assert
		assertEquals(nombreEsperado, actual);
		
	}
	/*
	 * la primera letra con mayusculas y las demas con minusculas
	 */
	void test02() {
		//arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. en Sistemas", "071/08");
		String nombreEsperado01 = "Licenciatura en sistemas";
		
		Carrera c02 = new Carrera("Abogacia", "Abog", "071/08");
		String nombreEsperado02 = "Abogacia";
		
		Carrera c03 = new Carrera("abogacia", "Abog", "071/08");
		String nombreEsperado03 = "Abogacia";
		
		Carrera c04 = new Carrera("aBOGACIA", "Abog", "071/08");
		String nombreEsperado04 = "Abogacia";
		
		//act
		String actual01 = c01.getTipoOracion();
		String actual02 = c02.getTipoOracion();
		String actual03 = c03.getTipoOracion();
		String actual04 = c04.getTipoOracion();
		
		//assert
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
		assertEquals(nombreEsperado03, actual03);
		assertEquals(nombreEsperado04, actual04);
		
	}
	@Test
	void test03() {//formato 5 test 1.5
		//arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. en Sistemas", "071/08");
		String nombreEsperado01 = "LS";
		
		Carrera c02 = new Carrera("Abogacia", "Abog", "071/08");
		String nombreEsperado02 = "A";
		
		Carrera c03 = new Carrera("Licenciatura en Biologia", "Lic Bio", "071/08");
		String nombreEsperado03 = "LB";
		
		
		//act
		String actual01 = c01.getNombreAUno();
		String actual02 = c02.getNombreAUno();
		String actual03 = c03.getNombreAUno();
		
		//assert
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
		assertEquals(nombreEsperado03, actual03);
		
	}
	
	void test04() {//formato 5 test 2.1
		//arrange
		Materia m01 = new Materia("Programacion II", "Prog II", AnioAcademico.TERCERO);
		String nombreEsperado01 = "LS - Pro";
		
		Materia m02 = new Materia("Arquitectura", "Arqt", AnioAcademico.SEGUNDO);
		String nombreEsperado02 = "LS - Arq";
		
		Materia m03 = new Materia("Sistemas Operativos", "Sist Opt", AnioAcademico.SEGUNDO);
		String nombreEsperado03 = "LS - Sis Ope";
		
		Materia m04 = new Materia("Administracion de Empresas", "admin emp", AnioAcademico.PRIMERO);
		String nombreEsperado04 = "LS - Adm de Emp";
		
		//act
		String actual01 = m01.getNombreFormatoUno();
		String actual02 = m02.getNombreFormatoUno();
		String actual03 = m03.getNombreFormatoUno();
		String actual04 = m04.getNombreFormatoUno();
		
		//assert
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
		assertEquals(nombreEsperado03, actual03);
		assertEquals(nombreEsperado04, actual04);
		
	}
	
	void test05() { //test 3.2
		//arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. en Sistemas", "071/08");
		Carrera c02 = new Carrera("Abogacia", "Abog", "070/00");
		Carrera c03 = new Carrera("Licenciatura en Biologia", "Lic. Bio", "080/55");
		
		//act
		
		
		//assert
		
	}
	
	void test08() {//test 4.1
		
		//arrange
		Materia m01 = new Materia("Analisis Matematico I", "Anal Mat I", AnioAcademico.PRIMERO);
		Materia m02 = new Materia("Analisis Matematico II", "Ana Mat II", AnioAcademico.SEGUNDO);
		Materia m03 = new Materia("Arquitectura de Computadoras I", "Arq Comp I", AnioAcademico.SEGUNDO);
		Materia m04 = new Materia("Arquitectura de Computadoras II", "Arq Comp II", AnioAcademico.SEGUNDO);
		Materia m05 = new Materia("Etica Profesional", "Etic Prof", AnioAcademico.TERCERO);
		
		//act
		
		//asserts
		
	}

}
