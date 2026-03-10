import java.util.Arrays;

import static lib.in.leerInt;

/**
 * Se considera un array de cadenas cuyo tamaño se introduce por consola. Se controla
 * que el número de elementos del array sea par. Se leen por consola cada uno de los
 * valores del array. En el programa se intercambiarán las cadenas de la primera celda y
 * la segunda; la tercera y la cuarta; y así sucesivamente hasta intercambiar las cadenas
 * de la penúltima celda y la última celda. Por último, se mostrarán las cadenas de cada
 * celda en líneas distintas y enumeradas.
 */

public class RecorrerUnArrayConSaltos_Ej4 {
    public static void main(String[] args) {
        int[] array = new int[introducirTamañoArray()];
        introducirElValorCeldas(array);
        mostrarArrays(array);
        System.out.println();
        arrayConSaltos(array);
        mostrarArrays(array);
    }

    private static void arrayConSaltos(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int[] aux=array.clone();
            





        }


    }


    private static void mostrarArrays(int[] array) {

        System.out.println(Arrays.toString(array));
    }


    private static void introducirElValorCeldas(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = leerInt("Introduce valor de la posicion: ");
        }
    }

    private static int introducirTamañoArray() {


        return leerInt("Introduce el tamaño del array: ", v->v%2!=0);

    }


}
