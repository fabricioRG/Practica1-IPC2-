package Calculos;

/**
 *
 * @author fabricio
 */
public class CalculadorEnteros {

    final private String suma = "\\+";
    final private String resta = "\\-";
    final private String multiplicacion = "\\*";
    final private String division = "\\÷";
    final private String residuo = "\\%";
    int numeroParcialEntero = 0;
    int resultadoEntero = 0;

    public CalculadorEnteros() {
    }

    public int suma(String operacion) {
        String numero[] = operacion.split(suma);
        return operacionEnteros(numero, 1);
    }

    public int resta(String operacion) {
        String numero[] = operacion.split(resta);
        return operacionEnteros(numero, 2);
    }

    public int multiplicacion(String operacion) {
        String numero[] = operacion.split(multiplicacion);
        return operacionEnteros(numero, 3);
    }

    public int division(String operacion) {
        String numero[] = operacion.split(division);
        return operacionEnteros(numero, 4);
    }
    
    public int residuo(String operacion){
        String numero[] = operacion.split(residuo);
        return operacionEnteros(numero, 5);
    }
    private int operacionEnteros(String numero[], int tipoOperacion) {
        resultadoEntero = 1;
        for (int i = 0; i < numero.length; i++) {
            numeroParcialEntero = Integer.parseInt(numero[i]);
            if (tipoOperacion == 1) {
                if (i == 0) {
                    resultadoEntero = 0;
                }
                resultadoEntero += numeroParcialEntero;
            } else if (tipoOperacion == 2) {
                if (i == 0) {
                    resultadoEntero = numeroParcialEntero;
                } else {
                    resultadoEntero -= numeroParcialEntero;
                }
            } else if (tipoOperacion == 3) {
                resultadoEntero *= numeroParcialEntero;
            } else if (tipoOperacion == 4) {
                if (i == 0) {
                    resultadoEntero = numeroParcialEntero;
                } else {
                    resultadoEntero /= numeroParcialEntero;
                }
            } else if (tipoOperacion == 5){
                if(i == 0){
                    resultadoEntero = numeroParcialEntero;
                } else {
                    resultadoEntero %= numeroParcialEntero;
                }
            }
        }
        return resultadoEntero;
    }

}
