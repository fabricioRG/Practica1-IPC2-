package Calculos;

/**
 *
 * @author fabricio
 */
public class Calculador {

    int numeroParcial = 0;
    int resultado = 0;

    public int operacion(String numero[], int tipoOperacion){
        for (int i = 0; i < numero.length; i++) {
            numeroParcial = Integer.parseInt(numero[i]);
            if(tipoOperacion == 1){
                resultado += numeroParcial;
            } else if(tipoOperacion == 2){
                if(i == 0){
                    resultado = numeroParcial;
                } else {
                    resultado -= numeroParcial;
                }
            }
        }
        return resultado;
    }
}
