import lib.in;

/**
 * Simúlese el juego de la carrera de caballos introduciendo el número de caballos que
 * van a participar (como mínimo 2). Se tendrá un array que almacena el avance de cada
 * uno de los caballos. Se definirán los siguientes métodos:
 * • Leer el número de caballosPRÁCTICAS Tema 3 Arrays y colecciones
 * 3
 * • Generar el caballo que avanza.
 * • Avanzar caballo
 * • Mostrar todos los caballos (limpiando previamente la pantalla)
 * • Detener el juego durante 1 segundo.
 * • Finalización del juego
 * • Mostrar el caballo ganador.
 * (CarreraCaballosArray)
 */
public class metodos_ForEach_Ej6 {
    public static void main(String[] args) {


    }

    public static int leerNumeroCaballos() {
        return in.leerInt("Leer Numero de caballos: ", v -> v >= 2);
    }
}
