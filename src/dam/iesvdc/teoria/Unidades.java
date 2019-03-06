package dam.iesvdc.teoria;

public class Unidades {
	public static void main (String [] args) {
		convertirLibrasAKilogramos(223.3);
		convertirPiesAMetros(100);
		//caminata de la semana
		double lunes= convertirMillasAMetros(10);
		double martes= convertirMillasAMetros(8.3);
		double miercoles= convertirMillasAMetros(5.3);
		double jueves= convertirMillasAMetros(13);
		double viernes= convertirMillasAMetros(3);
		double kilometros= (lunes + martes + miercoles + jueves + viernes)/1_000;
		System.out.println("Kilómetros recorridos durante la semana: " + kilometros);
	
		//rectangulo medido en yardas calcula area en metros
		double ladoA=  convertirYardasAMetros (10);
		double ladoB= convertirYardasAMetros (15);
		double area= ladoA*ladoB;
		System.out.println("El area del rectangulo es: " + area + " m\u00B2");
	}
	public static void convertirLibrasAKilogramos (double libras) {
		double kilogramos= libras * 0.453592;	
		System.out.println(libras + " libras son " + (kilogramos) + " kg ");	
	}
	public static void convertirPiesAMetros (double pies) {
		double metros= pies * 0.3048;	
		System.out.println(pies + " pies son " + (metros) + " metros ");
	}
	public static double convertirYardasAMetros (double yardasLado) {
		double metrosLado= yardasLado * 0.9144;	
		return metrosLado;
	}
	public static double convertirMillasAMetros (double millas) {
		double metros= millas * 1609.34;	
		return metros;
		
	}

	
}
