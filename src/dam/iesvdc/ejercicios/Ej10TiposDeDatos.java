package dam.iesvdc.ejercicios;

/**
* Esta clase define objetos que contienen
* un atributo denominado n ́umero
* y posee un m ́etodo para devolver
* el valor doble
* @author: Manuel Molino
* @version: 1.0
*/
public class Ej10TiposDeDatos{
private int numero; //propiedad de los objetos.
/**
* Constructor: es un m ́etodo que tiene
* el mismo nombre que la clase y se
* usa para crear objetos
* @param n par ́ametro para inicializar el objeto
* se usa para inicializar los objetos
* de tipo n ́umero
*/
public Ej10TiposDeDatos(int n){
this.numero=n;
}
/**
* m ́etodo que devuelve el valor doble
* @return el valor doble del atributo
* numero de dicho objeto.
*/
public int doble(){
return this.numero*2;
}
}
//clase para comprobar el funcionamiento de la
//clase anterior
class TestNumeros {
public static void main(String[] arg){
//Creo uno objeto de tipo N ́umero
Ej10TiposDeDatos n1 = new Ej10TiposDeDatos(4);
//Imprimo su valor doble
System.out.println("Valor doble: "+n1.doble());
}
}
/**RESPUESTAS
 * Numeros.java
*con el compilador javac en el terminal, y se obtendran dos ficheros .class porque hay dos clases.
* dos, uno por cada clase
* con el comando java en la clase que tenga main
* javadoc Numeros.java -d doc -auhor -version -charset utf8*/
