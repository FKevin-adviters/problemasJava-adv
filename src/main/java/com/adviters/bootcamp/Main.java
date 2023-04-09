package com.adviters.bootcamp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //teoria

        //equalsExample();
        //booleanVerificacion();

        //actividades

        //actividadUno();
        //actividadDos();
        //actividadTres();
        //actividadCuatro();
        //actividadcinco();
        //actividadSeis();
        //actividadSiete();
        //actividadOcho();
        //actividadNueve();
    }
    //actividades
    public static void actividadUno() {
        System.out.println("EJERCICIO 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");

        int numero = scanner.nextInt();
        int[] array_numbers = new int[numero];

        for (int index = 0; index < numero; index++) {
            array_numbers[index] = index + 1;
        }
        System.out.println(Arrays.toString(array_numbers));
    }
    public static void actividadDos() {
        //Pedir ingresar una frase e imprimir sus caracteres.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");

        String frase = scanner.nextLine();
        for (char caracter: frase.toCharArray()) {
            System.out.print(caracter + " ");
        }
    }
    public static void actividadTres() {
        //Escribí un programa que, dado un número por el usuario, muestre
        // todos sus divisores positivos. Recordá que un divisor es aquel
        // que divide al número de forma exacta (con resto 0).
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero, por favor: ");
        int num = scanner.nextInt();
        if(num <= 0){
            System.out.println("Ingrese un numero positivo.");
            return;
        } else {
            System.out.print("Divisores positivos: ");
            for (int index = 1; index <= num; index++) {
                if (num % index == 0) {
                    System.out.print(index + " ");
                }
            }
        }

    }
    public static void actividadCuatro() {
        //Escribí un programa que, dada una frase por el usuario, la muestre invertida.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        int largoDeLaFrase = frase.length();
        System.out.println( "El largo es de: " + largoDeLaFrase + " caracteres");
        for (int indice = largoDeLaFrase; indice != 0;indice--) {
            System.out.println(frase.charAt(indice - 1));
        }
    }
    public static void actividadcinco() {
        //Leer números enteros de teclado, hasta que el usuario ingrese el 0. Finalmente,
        // mostrar la sumatoria de todos los números ingresados.
        Scanner scanner = new Scanner(System.in);
        List<Integer> numerosLista = new ArrayList<Integer>();
        int sum = 0;
        while (true) {
            System.out.print("Introduzca un número, si desea terminar la secuencia, ingrese 0: ");
            int num = scanner.nextInt();
            if(num == 0) {
                break;
            } else {
                System.out.println("Vamos a agregar este numero a la lista: " + num);
                numerosLista.add(num);
                System.out.println(numerosLista);
            }
        }
        System.out.println("Lista de los numeros agregados: " + numerosLista);
        for (Integer number : numerosLista) {
            sum += number;
        }
        System.out.println("Esta es tu suma: " + sum);
    }
    public static void actividadSeis() {
        //Leer un número entero positivo desde teclado e
        //imprimir la suma de los dígitos que lo componen.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        String numeroString = String.valueOf(numero);
        List<Integer> newList = new ArrayList<Integer>();
        int sum = 0;
        if(numero > 0) {
            for (int i = 0; i < numeroString.length(); i++) {
                int num = Integer.parseInt(String.valueOf(numeroString.charAt(i)));
                newList.add(num);
            }
            for (int number :
                    newList) {
                sum += number;
            }
            System.out.println("La suma de los dígitos es igual a: "+ sum);
        } else {
            System.out.println("Ingrese un numero entero positivo");
        }
    }
    public static void actividadSiete() {
        // Solicitar al usuario el ingreso de una frase y de una letra (que puede o no estar en la frase). Recorrer
        // la frase, carácter a carácter, comparando con la letra buscada. Si el carácter no coincide,
        // indicar que no hay coincidencia en esa posición (imprimiendo la posición) y continuar. Si se encuentra
        // una coincidencia, indicar en qué posición se encontró y finalizar la ejecución

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        String frase = scanner.nextLine();
        System.out.print("Introduzca una letra: ");
        String caracter = scanner.nextLine();
        if(caracter.length() > 1) {
            System.out.println("Por favor introduzca solo una letra");
        } else {
            for (int index = 0; index < frase.length(); index++) {

                System.out.print("Letra: " + frase.charAt(index) + "  ");
                if(caracter.charAt(0) == frase.charAt(index)) {
                    System.out.println("Hubo una coincidencia en la posición: " + index + " ####");
                    break;
                } else {
                    System.out.println("No hubo coincidencia en la posición: " + index);
                }
            }
        }


    }
    public static void actividadOcho() {
        // Crear un programa que solicite el ingreso de números enteros positivos,
        // hasta que el usuario ingrese el 0. Por cada número, informar cuántos dígitos pares y cuántos impares tiene.
        // Al finalizar, informar la cantidad de dígitos pares y de dígitos impares leídos en total.

        Scanner scanner = new Scanner(System.in);
        List<Integer> numerosLista = new ArrayList<Integer>();
        int sum = 0;
        while (true) {
            System.out.print("Introduzca un número, si desea terminar la secuencia, ingrese 0: ");
            int num = scanner.nextInt();
            if(num == 0) {
                break;
            } else {
                System.out.println("Vamos a agregar este numero a la lista: " + num);
                numerosLista.add(num);
                System.out.println(numerosLista);
            }
        }
        System.out.println("Lista de los numeros agregados: " + numerosLista);
        for (int number :
                numerosLista) {
            String digitos = String.valueOf(number);
            int impar = 0;
            int par = 0;
            for (int index = 0; index < digitos.length(); index++) {
                int num = Integer.parseInt(String.valueOf(digitos.charAt(index)));
                if(num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
            System.out.println("El número: " + digitos + " tiene " + par + " digitos pares y " + impar + " impares");
        }
    }
    public static void actividadNueve() {
        //Escribir un programa que solicite el ingreso de una cantidad indeterminada de números mayores que 1,
        // finalizando cuando se reciba un cero. Imprimir la cantidad de números primos ingresados.
        Scanner scanner = new Scanner(System.in);
        List<Integer> numerosLista = new ArrayList<Integer>();

        while (true) {
            System.out.println("Introduzca un número mayor a 1, si desea terminar la secuencia, ingrese 0: ");
            int num = scanner.nextInt();
            if(num == 0) {
                break;
            } else if(num > 1) {
                    System.out.println("Vamos a agregar este numero a la lista: " + num);
                    numerosLista.add(num);
                    System.out.println(numerosLista);
            } else {
                System.err.println("Por favor, introduzca un número mayor a 1");
            }
        }

        System.out.print("Estos son los números primos: ");
        for (int number :
                numerosLista) {
                if (esPrimo(number)) {
                    System.out.print(number + " ");
                }
        }
    }
    private static boolean esPrimo(int numero) {
        int cantidadDeDivisoresPositivos = 0;
        for (int divisor = 1; divisor <= numero && cantidadDeDivisoresPositivos < 3; divisor++) {
            if (numero % divisor == 0) {
                cantidadDeDivisoresPositivos++;
            }
        }
        return cantidadDeDivisoresPositivos == 2;
    }
    //teoría
    public static void equalsExample () {
        String text="Hello";
        String text_2="Hello";
        System.out.println("Con equals -->"+text.equals(text_2));
        System.out.println("Con == -->"+(text == text_2));
    }
    public static void booleanVerificacion() {
        Boolean bool=Boolean.TRUE;
        Boolean bool_2=Boolean.valueOf("true");
        Boolean bool_3=true;
        System.out.println("Boolean value-->"+bool);
        System.out.println("Boolean==-->"+(bool == bool_2));
        System.out.println("Boolean==-->"+(bool == bool_3));
        System.out.println("Boolean equals-->"+bool.equals(bool_2));
    }

}