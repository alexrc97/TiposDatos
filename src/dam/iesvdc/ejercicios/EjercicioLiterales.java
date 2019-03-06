package dam.iesvdc.ejercicios;

public class EjercicioLiterales {
	public static void main (String [] args) {
	boolean booleano= true;
	char tipoLetra      = 'c';//caracreteres internacionales, caracter unicode 16 bits, importante comillas simples
	byte numeroByte    = 1;//desde -128 hasta 127, entero de 8 bits con signo
	short numeroShort  =11;//desde -32768 hasta 32767, entero de 16 bits con signo
	int numeroInt      =135135;// desde -2147483648 hasta 2147483647, entero de 32 bits con signo
	long numeroLong    =8_000_000L;//aprox  9.0*10^18, entero de 64 bits con signo
	float numeroFloat  =456F;//unos 6 digitos, real de 32 bits
	double numeroDouble= 678D;//unos 15 digitos, real de 64 bits
	String tipoString  = "gatito";//importante las comillas
	System.out.println(" Mi tortuga se llama " + tipoLetra + " tiene "+ numeroByte + " año y " + numeroShort + " meses ");
	System.out.println(" come " + numeroInt + " veces al día y caga " + numeroLong + " me tiene harto... ");
	
	
	}
}	
