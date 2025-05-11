import java.util.Scanner;

public class arreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];
        
        for (int i = 0; i < numeros.length; i++) {
            boolean numeroValido = false;
            
            while (!numeroValido) {
                System.out.printf("Ingrese el número %d (entre 10 y 100): ", (i + 1));
                int numero = scanner.nextInt();
                
                if (numero >= 10 && numero <= 100) {
                    numeros[i] = numero;
                    numeroValido = true;
                } else {
                    System.out.println("Error: El número está fuera del rango (10-100)");
                }
            }
        }
        
        System.out.println("\nLos números que ingresaste son:");

        for (int i = 0; i < numeros.length; i++) {

            System.out.printf("El número %d es: %d\n", i+1, numeros[i]);
        }

        System.out.print("\nIngresa el número que deseas buscar: ");
        int numeroBuscado = scanner.nextInt();
        
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                System.out.printf("El número %d se encuentra en la posición %d\n", numeroBuscado, i+1);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.printf("El número %d no se encuentra en el arreglo\n", numeroBuscado);
        }

        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            if(numeros[i] > numeroMayor){
                numeroMayor = numeros[i];
            }
            if(numeros[i] < numeroMenor){
                numeroMenor = numeros[i];
            }
        }
        
        System.out.printf("El número mayor es: %d\n", numeroMayor);
        System.out.printf("El número menor es: %d\n", numeroMenor);

        System.out.print("\nIngresa un número para revisar si tiene múltiplos en el arreglo: ");
        int multiplo = scanner.nextInt();

        if(multiplo <= 0){
            System.out.println("Error: El número debe ser mayor a 0");
        } else {
            boolean tieneMultiplo = false;
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % multiplo == 0) {
                    System.out.printf("El número %d es múltiplo de %d\n", numeros[i], multiplo);
                    tieneMultiplo = true;
                }
            }
            if (!tieneMultiplo) {
                System.out.printf("No hay múltiplos de %d en el arreglo.\n", multiplo);
            }
        }

        int sumaNumeros = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumaNumeros += numeros[i];
        }
        System.out.printf("La suma de todos los números del arreglo es: %d\n", sumaNumeros);

        double promedio = (double) sumaNumeros / numeros.length;
        System.out.printf("El promedio de los números del arreglo es: %.2f\n", promedio);

        int mayoresPromedioCantidad = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > promedio){
                mayoresPromedioCantidad++;
            }
        }
        if (mayoresPromedioCantidad == 0) {
            System.out.println("No hay números mayores al promedio.");
        }

        int [] mayoresPromedio = new int[mayoresPromedioCantidad];

        int indice = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > promedio) {
                mayoresPromedio[indice] = numeros[i];
                indice++;
            }
        }

        System.out.println("\nNúmeros mayores al promedio:");
        for (int i = 0; i < mayoresPromedio.length; i++) {
            System.out.println(mayoresPromedio[i]);
        }

        scanner.close();
    }
    
}
