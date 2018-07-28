package Manejadores;

/**
 *
 * @author fabricio
 */
public class ManejadorCalculadoraBasica {

    public ManejadorCalculadoraBasica() {
    }

    public String borrar(String texto) {
        if (texto.length() > 1) {
            String nuevoTexto = texto.substring(0, texto.length() - 1);
            return nuevoTexto;
        } else if (texto.length() == 1){
            return " ";
        } else {
            return "";
        }
    }

}
