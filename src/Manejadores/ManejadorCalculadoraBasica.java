package Manejadores;

import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author fabricio
 */
public class ManejadorCalculadoraBasica {

    final private String suma = "\\+";
    final private String resta = "-";
    final private String multiplicacion = "*";
    final private String division = "÷";
    
    public ManejadorCalculadoraBasica() {
    }

    public int resultado(String operacion){
        String operacionFinal = operacion.replaceAll(" ", "");
        if(operacionFinal.contains("+")){
            return suma(operacionFinal);
        } else {
            return 0; 
        }
    }
    
    public String borrar(String texto) {
        if (texto.length() > 1) {
            String nuevoTexto = texto.substring(0, texto.length() - 1);
            return nuevoTexto;
        } else if (texto.length() == 1){
            return " ";
        } else {
            return "";
        }
    }

    public int suma(String operacion){
        String numero[] = operacion.split(suma);
        int numeroParcial = 0;
        int resultado = 0;
        for (int i = 0; i < numero.length; i++) {
            numeroParcial = Integer.parseInt(numero[i]);
            resultado += numeroParcial;
        }
        return resultado;
    }
    
}
