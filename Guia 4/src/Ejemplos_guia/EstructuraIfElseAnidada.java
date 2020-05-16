package Ejemplos_guia;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class EstructuraIfElseAnidada {

    public static void main(String[] args) {

        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese la cantidad de salario");
            double salario = Double.valueOf(leer.readLine());
            IfElseAnidado(salario);
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public static void IfElseAnidado(double salario) {
        if (salario > 235) {
            System.out.println("Usted gana mas del salario minino");
        } else if (salario > 0) {
            System.out.println("Usted gana menos del salario minino");
        } else {
            System.out.println("Ingreso dato erroneo");
        }
    }
}
