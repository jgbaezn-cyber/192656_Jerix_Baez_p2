import java.util.Scanner;

public class Parcial2Ej1 {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        System.out.print("Ingrese el tamaño del arreglo (5-50): ");
        int n = scanner.nextInt();
        
        if (n < 5 || n > 50) {
            System.out.println("Error: El tamaño debe estar entre 5 y 50");
            return;
        }
        
        int[] arreglo = leerArreglo(n);
        
        System.out.println("--- RESULTADOS DEL ANÁLISIS ---");
        System.out.println("Arreglo: " + java.util.Arrays.toString(arreglo));
        System.out.println("Cantidad de números primos: " + contarPrimos(arreglo));
        System.out.println("Valor máximo: " + maximo(arreglo));
        System.out.println("Índices donde aparece el máximo: " + 
                          java.util.Arrays.toString(indicesDeMaximo(arreglo)));
        System.out.println("¿Es capicúa?: " + (esCapicua(arreglo) ? "Sí" : "No"));
    }
    
    public static int[] leerArreglo(int n) {
        int[] arreglo = new int[n];
        System.out.println("Ingrese " + n + " números enteros:");
        
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        
        return arreglo;
    }
    
    public static boolean esPrimo(int x) {
        if (x <= 1) {
            return false;
        }
        
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static int contarPrimos(int[] a) {
        int contador = 0;
        
        for (int numero : a) {
            if (esPrimo(numero)) {
                contador++;
            }
        }
        
        return contador;
    }
    
    public static int maximo(int[] a) {
        if (a.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío");
        }
        
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        return max;
    }
    
    public static int[] indicesDeMaximo(int[] a) {
        if (a.length == 0) {
            return new int[0];
        }
        
        int max = maximo(a);
        int contador = 0;
        
        for (int numero : a) {
            if (numero == max) {
                contador++;
            }
        }
        
        int[] indices = new int[contador];
        int pos = 0;
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                indices[pos] = i;
                pos++;
            }
        }
        
        return indices;
    }
    
    public static boolean esCapicua(int[] a) {
        int izquierda = 0;
        int derecha = a.length - 1;
        
        while (izquierda < derecha) {
            if (a[izquierda] != a[derecha]) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        
        return true;
    }
}