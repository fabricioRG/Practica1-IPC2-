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
public class calculosDiscretos {
    int resultadoFactorial;
    

    public int getResultadoFactorial() {
        return resultadoFactorial;
    }

    
    public double generarFactorial(int numero) {
		resultadoFactorial = 1;
		//se tiene un contador i que se incrementa en uno hasta ser igual al numero ingresado,
		//por cada ciclo se multiplica el contador por el resultado de la multiplicacion anterior.
		//ejemplo: si numero = 5 entonces el factorial se forma: 1 * 2 * 3 * 4 * 5
		for (int i = 1; i <= numero; i++) {
			resultadoFactorial *= i;
		}
		return resultadoFactorial;
	}
    
    
    public  double calcularPermutacion(int numeroN, int numeroR) {
		//se reutiliza la funcion factorial
		return generarFactorial(numeroN) / generarFactorial(numeroN - numeroR);
	}
    
    public  double calcularCombinacion(int numeroN, int numeroR) {
		//se reutiliza la funcion factorial
		return generarFactorial(numeroN) / (generarFactorial(numeroN - numeroR) * generarFactorial(numeroR));
	}
    
    
}
