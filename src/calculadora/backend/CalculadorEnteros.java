package calculadora.backend;

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
    final private String raiz = "\\^";
    int numeroParcialEntero = 0;
    int resultadoEntero = 0;

    public CalculadorEnteros() {
    }

    //Metodo encargada de retornar un entero colocando en un arreglo de tipo String para sumar la n cantidad de numeros
    public int suma(String operacion) {
        String numero[] = operacion.split(suma);
        return operacionEnteros(numero, 1);
    }

    //Metodo encargada de retornar un entero colocando en un arreglo de tipo String para restar la n cantidad de numeros
    public int resta(String operacion) {
        String numero[] = operacion.split(resta);
        return operacionEnteros(numero, 2);
    }

    //Metodo encargada de retornar un entero colocando en un arreglo de tipo String para multiplicar la n cantidad de numeros
    public int multiplicacion(String operacion) {
        String numero[] = operacion.split(multiplicacion);
        return operacionEnteros(numero, 3);
    }

    //Metodo encargada de retornar un entero colocando en un arreglo de tipo String para dividir la n cantidad de numeros
    public int division(String operacion) {
        String numero[] = operacion.split(division);
        return operacionEnteros(numero, 4);
    }

    //Metodo encargada de retornar un entero recibiendo como parametro los numeros para encontrar su residuo
    public int residuo(String operacion) {
        String numero[] = operacion.split(residuo);
        return operacionEnteros(numero, 5);
    }

    //Metodo encargada de retornar un entero recibiendo como parametro un indice y su radicando para su posterior calculo
    public int raiz(String operacion){
        String operacionFinal = operacion.replaceAll("\\(1/", "");
        String numero[] = operacionFinal.split(raiz);
        return operacionEnteros(numero, 7);
    }
    
    //Metodo encargada de retornar un entero recibiendo como parametro la operacion que contiene un numero y su potencia
    public int potencia(String operacion) {
        String numero[] = operacion.split(potencia);
        return operacionEnteros(numero, 6);
    }

    /**
     * Metodo que recibe como parametro un arreglo de tipo String, la cual contiene numeros enteros para su posterior calculo,
     * los cuales pueden ser suma, resta, multiplicacion, division, raiz y potencia, todos los calculos anteriores retornan un
     * numero entero, asi tambien recibe como parametro un entero, el cual indica la tipo de operacion a realizar
     * @param numero
     * @param tipoOperacion
     * @return 
     */
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
                } else if (tipoOperacion == 7){
                    double uno = 1;
                    resultadoEntero = (int) Math.pow(resultadoEntero, uno / numeroParcialEntero);
                }
            }
        }
        return resultadoEntero;
    }
}
