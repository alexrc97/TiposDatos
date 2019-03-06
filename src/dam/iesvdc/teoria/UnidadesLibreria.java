package dam.iesvdc.teoria;

public class UnidadesLibreria {
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
