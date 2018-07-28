package Calculos;

/**
 *
 * @author fabricio
 */
public class CalculadorDecimales {

    final private String suma = "\\+";
    final private String resta = "\\-";
    final private String multiplicacion = "*";
    final private String division = "÷";
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

    private double operacionDecimales(String numero[], int tipoOperacion) {
        for (int i = 0; i < numero.length; i++) {
            numeroParcialDecimal = Double.parseDouble(numero[i]);
            if (tipoOperacion == 1) {
                resultadoDecimal += numeroParcialDecimal;
            } else if (tipoOperacion == 2) {
                if (i == 0) {
                    resultadoDecimal = numeroParcialDecimal;
                } else {
                    resultadoDecimal -= numeroParcialDecimal;
                }
            }
        }
        return resultadoDecimal;
    }

}
