package Ejemplos_guia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraDoWhile {

    public static void main(String[] args) {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el número limite de repetición");
            String limite = leer.readLine();
            if (limite == null) {//Evalua si el valor string no esta vacio
                System.out.println("Dato invalido");
            } else {
                //Envio de parametro al metodo correspondiente y realizando casting
                instruccionDoWhile(Integer.parseInt(limite));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void instruccionDoWhile(int valorLimite) {
        int i = 1; //Valor inicial del contador
        do {
            //realiza las acciones por lo menos una vez
            System.out.println("El valor de la repetición es: " + i);
            i++; //incrementando el contador
        } while (i <= valorLimite);  //Evalua la codicion antes de volver a repetir

    }
}
