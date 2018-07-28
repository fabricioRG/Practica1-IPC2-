package Manejadores;

import Calculos.CalculadorEnteros;
import Calculos.CalculadorDecimales;
import java.util.List;
import java.util.LinkedList;
import Interfaz.CalcuBasicaInterfaz;

/**
 *
 * @author fabricio
 */
public class ManejadorCalcuBasica {

    final private String suma = "\\+";
    final private String resta = "\\-";
    final private String multiplicacion = "*";
    final private String division = "÷";

    public ManejadorCalcuBasica() {
    }

    public int resultadoEntero(String operacion) {
        CalculadorEnteros ce = new CalculadorEnteros();
        String operacionFinal = operacion.replaceAll(" ", "");
        if (operacionFinal.contains("+")) {
            return ce.suma(operacionFinal);
        } else if (operacionFinal.contains("-")) {
            return ce.resta(operacionFinal);
        } else {
            return 0;
        }
    }

    public double resultadoDecimal(String operacion) {
        CalculadorDecimales cd = new CalculadorDecimales();
        String operacionFinal = operacion.replaceAll(" ", "");
        if (operacionFinal.contains("+")) {
            return cd.suma(operacionFinal);
        } else if (operacionFinal.contains("-")){
            return cd.resta(operacionFinal);
        } else {
            return 0;
        }
    }

    public String borrar(String texto, CalcuBasicaInterfaz cb) {
        CalcuBasicaInterfaz cbi = cb;
        if (texto.length() > 1) {
            String nuevoTexto = texto.substring(0, texto.length() - 1);
            return nuevoTexto;
        } else if (texto.length() == 1) {
            cb.estadoBotones(false);
            return "";
        } else {
            cb.estadoBotones(false);
            return "";
        }
    }
}
