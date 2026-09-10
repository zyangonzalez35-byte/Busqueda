import java.util.Scanner;

public class Busqueda {

    public static int busqueda(int[] lista, int limInf, int limSup, int buscado) {

        if (limSup >= limInf) {

            int medio = limInf + (limSup - limInf) / 2;

            if (lista[medio] == buscado) {
                return medio;
            }

            else if (lista[medio] > buscado) {
                return busqueda(lista, limInf, medio - 1, buscado);
            }

            else {
                return busqueda(lista, medio + 1, limSup, buscado);
            }

        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos: ");
        int cantidad = entrada.nextInt();

        int[] lista = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            lista[i] = (i + 1) * 2;
        }

        System.out.print("Ingrese el elemento para buscar: ");
        int buscado = entrada.nextInt();

        int resultado = busqueda(lista, 0, lista.length - 1, buscado);

        if (resultado != -1) {
            System.out.println("El elemento " + lista[resultado] + " esta en la posición " + resultado);
        } else {
            System.out.println("Este elemento no esta en la lista");
        }

        entrada.close();
    }
}