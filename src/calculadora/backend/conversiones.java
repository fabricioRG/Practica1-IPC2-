package calculadora.backend;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricardo
 */
public class conversiones {
    String cadenaResultado;

    public String getResultado() {
        return cadenaResultado;
    }
   
    
    public String convertirABinario(int numero) {
		
		int cociente;
		int residuo;
                 cadenaResultado = "";
		
		cociente = numero;
		while(cociente != 0) {//terminamos cuando ya no se pueda dividir el numero por el valor de la base (2)
			residuo = cociente % 2;
			cociente = cociente / 2;//obtenemos el cociente sobre el cual operaremos en el siguiente ciclo
			//el residuo es parte de la cadena de resultado binario
			//agregamos el residuo altual al inicio de la cadena para mantener el correcto orden
			cadenaResultado = residuo + cadenaResultado;
		}
		return cadenaResultado;
	}
    
    public String convertirAHexadecimal( int numero) {
		
		int cociente;
		int residuo;
		String residuoString;
	 cadenaResultado = "";
		
		cociente = numero;
		while(cociente != 0) {//terminamos cuando ya no se pueda dividir el numero por el valor de la base (16)
			residuo = cociente % 16;
			cociente = cociente / 16;//obtenemos el cociente sobre el cual operaremos en el siguiente ciclo
			switch (residuo) {//en hexadecimal, los digitos mas allá del decimo hasta el quinceavo se representan con letras
				case 10:
					residuoString = "A";
					break;
				case 11:
					residuoString = "B";
					break;
				case 12:
					residuoString = "C";
					break;
				case 13:
					residuoString = "D";
					break;
				case 14:
					residuoString = "E";
					break;
				case 15:
					residuoString = "F";
					break;
				default:
					residuoString = String.valueOf(residuo);//convertimos a cadena el residuo y lo asignamos
			}
			//el residuo es parte de la cadena de resultado binario
			//agregamos el residuo altual al inicio de la cadena para mantener el correcto orden
			cadenaResultado = residuoString + cadenaResultado;
		}
		return cadenaResultado;
	}
    
    public String convertirAOctal(int numero ) {
		int cociente;
		int residuo;
		 cadenaResultado = "";
		
		cociente = numero;
		while(cociente != 0) {//terminamos cuando ya no se pueda dividir el numero por el valor de la base (8)
			residuo = cociente % 8;
			cociente = cociente / 8;//obtenemos el cociente sobre el cual operaremos en el siguiente ciclo
			//el residuo es parte de la cadena de resultado binario
			//agregamos el residuo altual al inicio de la cadena para mantener el correcto orden
			cadenaResultado = residuo + cadenaResultado;
		}
		return cadenaResultado;
	}
}
