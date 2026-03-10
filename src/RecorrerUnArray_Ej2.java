import static java.lang.System.out;

public class RecorrerUnArray_Ej2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        generarUnArray(array);
        mostrarArray(array);
        out.println();
        array = incrementarEnUno(array);
        mostrarArray(array);
        out.println();
        array = duplicarValores(array);
        mostrarArray(array);
    }

    public static void generarUnArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 9);
        }
    }

    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i]);
            if (i < arr.length - 1) out.print(", ");
        }
    }

    public static int[] incrementarEnUno(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) arr[i]++;
            else arr[i]--;
        }
        return arr;
    }

    public static int[] duplicarValores(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < 5) arr[i] = arr[i] * 2;

        }


        return arr;
    }

    public static int[] sumarValor(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int valorAleatorio = (int) (Math.random() * 11) - 5;
            arr[i] += valorAleatorio;

        }
        return arr;
    }
}
