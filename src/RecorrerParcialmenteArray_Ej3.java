import lib.in;

public class RecorrerParcialmenteArray_Ej3 {
    public static void main(String[] args) {
        int[] array = new int[introducirArray()];
        generarArray(array);
        mostrarArray(array);
        System.out.println();
        mostrarArray(moverHaciaDerecha(array));
        System.out.println();
        mostrarArray(invertirArray(array));
        System.out.println();
       mostrarPosicionPrimerParUltimoPar(array);
    }

    private static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
    }

    public static int introducirArray() {

        return in.leerInt("Introduce el tamaño del array: ");
    }

    public static void generarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }


    }

    public static int[] moverHaciaDerecha(int[] a) {

        int aux = a[a.length - 1];


        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }


        a[0] = aux;

        return a;
    }

    public static int[] invertirArray(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int aux = a[i]; // Guardamos el de la izquierda
            a[i] = a[a.length - 1 - i]; // Ponemos el de la derecha en la izquierda
            a[a.length - 1 - i] = aux; // Ponemos el aux en la derecha
        }
        return a;
    }

    public static void mostrarPosicionPrimerParUltimoPar(int[] arr) {
        int primero = -1;
        int ultimo = -1;

        // BUSCAMOS EL PRIMERO (De izquierda a derecha)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                primero = arr[i];
                break; // Salimos en cuanto encontramos el 1º
            }
        }

        // BUSCAMOS EL ÚLTIMO (De derecha a izquierda)
        for (int i = arr.length - 1; i >= 0; i--) { // ¡Empezamos al revés!
            if (arr[i] % 2 == 0) {
                ultimo = arr[i];
                break; // Salimos en cuanto encontramos el 1º por la derecha
            }
        }

        System.out.println("\nPrimer par: " + primero + " | Último par: " + ultimo);
    }
}
