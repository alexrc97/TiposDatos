package dam.iesvdc.teoria;

public class TiposInicial {
	public static void main (String[] args) {
	boolean booleano= true;
	char caracter      = 'C';
	byte numeroByte    = 120;
	short numeroShort  =12000;
	int numeroInt      =122222;
	long numeroLong    =123;
	float numeroFloat  =123;
	double numeroDouble=12.3F ;
	System.out.println( " El numero mas alto es " + numeroInt);
	//representamos en octal y hexadecimal
	int octal =034;
	int hexa  =0x1C;
	System.out.println( " EL valor numerico en decimal de 34 en octal es " + octal);
		System.out.println( " EL valor numerico en decimal de 1C en hexadecimal es " + hexa);
	}
}	
//una cadena se define, por ejemplo:
//String cadena = "hello world";
