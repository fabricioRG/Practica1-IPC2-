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
    final private String potencia = "\\^";
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

    public int residuo(String operacion) {
        String numero[] = operacion.split(residuo);
        return operacionEnteros(numero, 5);
    }

    public int potencia(String operacion) {
        String numero[] = operacion.split(potencia);
        return operacionEnteros(numero, 6);
    }

    private int operacionEnteros(String numero[], int tipoOperacion) {
        for (int i = 0; i < numero.length; i++) {
            numeroParcialEntero = Integer.parseInt(numero[i]);
            if (i == 0) {
                resultadoEntero = numeroParcialEntero;
            } else if (i >= 1) {
                if (tipoOperacion == 1) {
                        resultadoEntero += numeroParcialEntero;
                } else if (tipoOperacion == 2) {
                    resultadoEntero -= numeroParcialEntero;
                } else if (tipoOperacion == 3) {
                        resultadoEntero *= numeroParcialEntero;
                } else if (tipoOperacion == 4) {
                        resultadoEntero /= numeroParcialEntero;
                } else if (tipoOperacion == 5) {
                        resultadoEntero %= numeroParcialEntero;
                } else if (tipoOperacion == 6) {
                    resultadoEntero = (int) Math.pow(resultadoEntero, numeroParcialEntero);
                }
            }
        }
        return resultadoEntero;
    }
}
