package dam.iesvdc.teoria;

public class TestUnidades {
	public static void main (String [] args) {
		UnidadesLibreria.convertirLibrasAKilogramos(223.3);
		UnidadesLibreria.convertirPiesAMetros(100);
		//caminata de la semana
		double lunes= UnidadesLibreria.convertirMillasAMetros(10);
		double martes= UnidadesLibreria.convertirMillasAMetros(8.3);
		double miercoles= UnidadesLibreria.convertirMillasAMetros(5.3);
		double jueves= UnidadesLibreria.convertirMillasAMetros(13);
		double viernes= UnidadesLibreria.convertirMillasAMetros(3);
		double kilometros= (lunes + martes + miercoles + jueves + viernes)/1_000;
		System.out.println("Kilómetros recorridos durante la semana: " + kilometros);
	
		//rectangulo medido en yardas calcula area en metros
		double ladoA=  UnidadesLibreria.convertirYardasAMetros (10);
		double ladoB= UnidadesLibreria.convertirYardasAMetros (15);
		double area= ladoA*ladoB;
		System.out.println("El area del rectangulo es: " + area + " m\u00B2");
	}
}	
