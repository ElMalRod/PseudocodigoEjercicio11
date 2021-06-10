import java.util.Scanner;

public class Ejercicio11J2 {

    public static void main(String[] args) {
        // variables a utilizar
        Scanner sc = new Scanner(System.in);

        int impares = 0;
        int sumatoriaPares = 0;
        int pares = 0;
        int promedioPares;
        int docena = 0;
        int numeroMayor = 0;
        int contador = 0;

        do {

            int numeroGenerado;
            int comprobacionNumero;
            numeroGenerado = (int) (Math.random() * 36 + 1);
            comprobacionNumero = numeroGenerado % 2;

            if (comprobacionNumero == 0) {

                sumatoriaPares += numeroGenerado;
                pares++;

            }

            if (comprobacionNumero != 0) {

                impares++;

            }

            if ((numeroGenerado >= 13) && (numeroGenerado <= 24)) {

                docena++;

            }

            if (numeroGenerado > numeroMayor) {

                numeroMayor = numeroGenerado;

            }

            contador++;

        } while (contador < 10);

        promedioPares = sumatoriaPares / pares;

        System.out.println("Cantidad de numeros impares: " + impares);
        System.out.println("El promedio de numeros pares: " + promedioPares);
        System.out.println("Cantidad de numeros que se encuntra en la docena (13 al 24) " + docena);
        System.out.println("El numero mas grande es: " + numeroMayor);

    }
}