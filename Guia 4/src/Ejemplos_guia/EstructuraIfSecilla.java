package Ejemplos_guia;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraIfSecilla {

    public static void main(String[] args) {
        try {
            //Objeto leer de la clane BurferedReader
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingresar la cantidad de au salarios");
            double salario = Double.parseDouble(leer.readLine());
            ifSencillo(salario);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void ifSencillo(double salario) {

        if (salario > 235) { //La condición que se evalua y en caso de ser verdadera
            System.out.println("Usted gana mas del salario minino");
        }
    }
}
