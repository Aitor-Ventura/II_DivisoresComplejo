import java.util.Scanner;
/**
 * Ejercicio de Introducción a la Informática
 */
public class Excercise {

    public static void main(String[] args) {
        divisores2();
    }
    
    /**
     * Método divisores2 a modificar. Debe leer un número entero y
     * mostrar en pantalla los divisores de  cada número comprendido 
     * entre 1 y el valor leído, ambos incluidos
     */
     public static void divisores2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un valor entero: ");
        int n = input.nextInt();

        // Para cada valor, i, comprendido entre 1 y n...

        for (int i = 1; i <= n; i++) {
            // ...se comprueban todos los posibles divisores, j
		
            for (int j = 1; j < i; j++) {
            // Si i es divisible por j, se debe escribir j
            // seguida de una coma, y sin cambiar de línea

                if (i % j == 0) System.out.print(j + ", ");
            }

            // i siempre es divisor de si mismo, se escribe
            // y se cambia de línea

            System.out.println(i);
        }
    }
}