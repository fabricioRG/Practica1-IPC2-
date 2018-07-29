package Calculos;

/**
 *
 * @author fabricio
 */
public class CalculadorDecimales {

    final private String suma = "\\+";
    final private String resta = "\\-";
    final private String multiplicacion = "\\*";
    final private String division = "\\÷";
    double numeroParcialDecimal = 0;
    double resultadoDecimal = 0;

    public CalculadorDecimales() {
    }
    
    public double suma(String operacion) {
        String numero[] = operacion.split(suma);
        return operacionDecimales(numero, 1);
    }
    
    public double resta(String operacion) {
        String numero[] = operacion.split(resta);
        return operacionDecimales(numero, 2);
    }
    
    public double multiplicacion(String operacion){
        String numero[] = operacion.split(multiplicacion);
        return operacionDecimales(numero, 3);
    }

    public double division(String operacion){
        String numero[] = operacion.split(division);
        return operacionDecimales(numero, 4);
    }
    
    private double operacionDecimales(String numero[], int tipoOperacion) {
        resultadoDecimal = 1;
        for (int i = 0; i < numero.length; i++) {
            numeroParcialDecimal = Double.parseDouble(numero[i]);
            if (tipoOperacion == 1) {
                if(i == 0){
                    resultadoDecimal = 0; 
                }
                resultadoDecimal += numeroParcialDecimal;
            } else if (tipoOperacion == 2) {
                if (i == 0) {
                    resultadoDecimal = numeroParcialDecimal;
                } else {
                    resultadoDecimal -= numeroParcialDecimal;
                }
            } else if(tipoOperacion == 3){
                resultadoDecimal *= numeroParcialDecimal;
            } else if (tipoOperacion == 4){
                if (i == 0) {
                    resultadoDecimal = numeroParcialDecimal;
                } else {
                    resultadoDecimal /= numeroParcialDecimal;
                }
            }
        }
        return resultadoDecimal;
    }

}
