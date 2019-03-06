package dam.iesvdc.teoria;

public class Moneda1 {
	static final double EUROS_A_DOLARES= 1.18115;
	static final double DOLARES_A_EUROS= 0.846632519;
	public static void main (String [] args) {
	
	convertirEurosADolares(15);
	convertirDolaresAEuros(15);
	}
	public static void convertirEurosADolares (double euros) {
		System.out.println(euros + " € son " + (euros*EUROS_A_DOLARES) + " $ ");
	}	
	public static void convertirDolaresAEuros (double dolares){
		System.out.println(dolares + " $ son " + (DOLARES_A_EUROS*dolares) + " € ");	
	}
	
}
