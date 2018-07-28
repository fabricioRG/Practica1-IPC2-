package Calculos;

/**
 *
 * @author fabricio
 */
public class CalculadorEnteros {

    final private String suma = "\\+";
    final private String resta = "\\-";
    final private String multiplicacion = "*";
    final private String division = "÷";
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
    
    private int operacionEnteros(String numero[], int tipoOperacion){
        for (int i = 0; i < numero.length; i++) {
            numeroParcialEntero = Integer.parseInt(numero[i]);
            if(tipoOperacion == 1){
                resultadoEntero += numeroParcialEntero;
            } else if(tipoOperacion == 2){
                if(i == 0){
                    resultadoEntero = numeroParcialEntero;
                } else {
                    resultadoEntero -= numeroParcialEntero;
                }
            }
        }
        return resultadoEntero;
    }
    
}
