package Manejadores;

import Calculos.Calculador;
import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author fabricio
 */
public class ManejadorCalcuBasica {

    final private String suma = "\\+";
    final private String resta = "\\-";
    final private String multiplicacion = "*";
    final private String division = "÷";
    Calculador c;

    
    public ManejadorCalcuBasica() {
        c = new Calculador();
    }

    public int resultado(String operacion){
        String operacionFinal = operacion.replaceAll(" ", "");
        if(operacionFinal.contains("+")){
            return suma(operacionFinal);
        } else if (operacionFinal.contains("-")){
            return resta(operacionFinal); 
        } else {
            return 0;
        }
    }
    
    public String borrar(String texto) {
        if (texto.length() > 1) {
            String nuevoTexto = texto.substring(0, texto.length() - 1);
            return nuevoTexto;
        } else if (texto.length() == 1){
            return "";
        } else {
            return "";
        }
    }

    public int suma(String operacion){
        String numero[] = operacion.split(suma);
        return c.operacion(numero, 1);
    }
    
    public int resta(String operacion){
        String numero[] = operacion.split(resta);
        return c.operacion(numero, 2);
    }
}
