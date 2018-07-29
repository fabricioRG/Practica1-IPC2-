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
    final private String potencia = "\\^";
    final private String raiz = "\\^";
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

    public double multiplicacion(String operacion) {
        String numero[] = operacion.split(multiplicacion);
        return operacionDecimales(numero, 3);
    }

    public double division(String operacion) {
        String numero[] = operacion.split(division);
        return operacionDecimales(numero, 4);
    }

    public double raiz(String operacion){
        String operacionFinal = operacion.replaceAll("\\(1/", "");
        String numero[] = operacionFinal.split(raiz);
        return operacionDecimales(numero, 6);
    }
    
    public double potencia(String operacion) {
        String numero[] = operacion.split(potencia);
        return operacionDecimales(numero, 5);
    }

    private double operacionDecimales(String numero[], int tipoOperacion) {
        for (int i = 0; i < numero.length; i++) {
            numeroParcialDecimal = Double.parseDouble(numero[i]);
            if (i == 0) {
                resultadoDecimal = numeroParcialDecimal;
            } else if (i >= 1) {
                if (tipoOperacion == 1) {
                    resultadoDecimal += numeroParcialDecimal;
                } else if (tipoOperacion == 2) {
                    resultadoDecimal -= numeroParcialDecimal;
                } else if (tipoOperacion == 3) {
                    resultadoDecimal *= numeroParcialDecimal;
                } else if (tipoOperacion == 4) {
                    resultadoDecimal /= numeroParcialDecimal;
                } else if (tipoOperacion == 5) {
                    resultadoDecimal = Math.pow(resultadoDecimal, numeroParcialDecimal);
                } else if (tipoOperacion == 6){
                    double uno = 1;
                    resultadoDecimal = Math.pow(resultadoDecimal, uno / numeroParcialDecimal);
                }
            }
        }
        return resultadoDecimal;
    }
}
