/* 
        - Si i es un multiplo de 3 y 5, imprima "Fizzbuzz".
	- Si i es un multiplo de 3 (pero no de 5), imprima fizz
	- Si i no es un multiplo de 5 (pero no de 3), imprima Buzz
	- Si i no es un multiplo de 3 o 5, imprima el valor de i 
 */

 /*

EXPLICACION:

	- Los numeros 3, 6, 9 y 12 son multiplos de 3 (per no de 5)
	 , asi que imprime Fizz en esas lineas.
	 
	- Los numeros de 5 y 10 son multiplos de 5 (pero no de 3),
	  asi que escribe Buzz en esas lineas.
	 
	- El numero 15 es un multiplo de 3 y 5, asi que imprime Fizzbuzz en esa linea.
	 
	- Ninguno de los otros valores es un multiplo de 3 o 5, asi que imprima el valor de i en esas lineas.

 */


package pruebafizzbuzz;

import java.util.ArrayList;

public class Fizzbuzz {

    public static void main(String[] args) {
        int n = 15;
        imprimirFizzBuzz(n);
    }

    public static void imprimirFizzBuzz(int n) {
        ArrayList<Integer> numeros = new ArrayList<>();

        //
        for (int i = 1; i <= n; i++) {
            numeros.add(i);
        }

        for (int numero : numeros) {
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (numero % 3 == 0) {
                System.out.println("Fizz");
            } else if (numero % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(numero);
            }

        }
    }

}
