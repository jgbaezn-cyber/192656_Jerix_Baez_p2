Nombre: Jerix Geovanna Baez Niño
Codigo: 192656



# Analizador de Secuencias

**Segundo Parcial — Programación I (Java)**  
**Tema:** Arreglos + funciones dentro de una sola clase  
**Duración:** 90 minutos · **Lenguaje:** Java (JDK 17+) · **Modalidad:** Individual  

---

## Objetivo

Dado un arreglo de enteros, implementar funciones de análisis y transformación:

- Conteo de números primos.
- Cálculo del máximo.
- Obtención de los índices donde aparece el máximo.
- Verificación de si el arreglo es capicúa.

---

## Reglas

- Crea **una sola clase** (por ejemplo, `Parcial2Ej1`).
- Todas las funciones deben estar en esa misma clase (pueden ser `static`).
- Usa `Scanner` para leer por teclado.
- No utilices:
  - `List`
  - `Set`
  - `Map`
  - `Streams`
  - `Arrays.sort`
- Se permite usar `Arrays.toString` **solo para imprimir**.
- Valida tamaños y evita desbordes (no acceder fuera de los límites del arreglo).

---

## Entradas

1. Un entero `N` tal que: `5 ≤ N ≤ 50`.
2. `N` enteros (pueden ser negativos o repetidos).

---

## Métodos requeridos (en la misma clase)

```java
int[] leerArreglo(int n)
// Lee y retorna un arreglo de tamaño n.

boolean esPrimo(int x)
// Retorna true si x es primo (> 1).

int contarPrimos(int[] a)
// Devuelve cuántos primos hay en a.

int maximo(int[] a)
// Devuelve el valor máximo del arreglo.

int[] indicesDeMaximo(int[] a)
// Devuelve todas las posiciones donde aparece el máximo.

boolean esCapicua(int[] a)
// Retorna true si el arreglo es igual al leerlo al derecho y al revés.
