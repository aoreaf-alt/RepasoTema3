import java.util.Arrays;

import static lib.in.leerDouble;

/***
 * Introdúzcase, una a una, 10 temperaturas entre los valores de -10.0 y 50.0. A medida
 * que se introducen se mostrarán todas, se obtendrán la menor y la mayor temperatura,
 * la media de las temperaturas con dos decimales, y la media con dos decimales sin
 * tener en cuenta las temperaturas máximas ni mínimas (puede ser que no se pueda
 * obtener dicha media). Se tendrán los siguientes métodos:
 * • leer (temperatura validándola)
 * • rellenar (temperaturas)
 * • mostrar (todas las temperaturas)
 * • mayor (temperatura)
 * • menor (temperatura)
 * • media (de todas las temperaturas)
 * • mediaSin (de todas las temperaturas quitando los extremos)
 * • mostrar media de las temperaturas
 * • mostrar la media de las temperaturas sin la menor y mayor.
 * (TemperaturasArray)
 */

public class metodos_Ej5 {
    public static void main(String[] args) {
        double[] temperaturas = new double[10];
        rellenar(temperaturas);
        mostrar(temperaturas);
    }

    private static void mostrar(double[] temperaturas) {
        System.out.println(Arrays.toString(temperaturas));
    }

    public static double leerTemperaturaValidacion() {
        return leerDouble("Introduce la Temperatura: ", v -> v > -10 && v <= 50);
    }

    public static void rellenar(double[] datos) {
        for (int i = 0; i < datos.length; i++) {
            datos[i] = leerTemperaturaValidacion();

        }

    }

    public static double temperaturaMayor(double[] datos) {
        double temperaturaAlta = datos[0];
        for (int i = 0; i < datos.length; i++) {
            if(datos[i]>temperaturaAlta) temperaturaAlta = datos[i];
        }
        return temperaturaAlta;
    }

}








