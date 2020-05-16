package Ejemplos_guia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraFor {

    public static void main(String[] args) {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el número limite de repetición");
            String limite = leer.readLine();
            if (limite == null) {//Evalua si el valor string no esta vacio
                System.out.println("Dato invalido");
            }
            //Envio de parametro al metodo correspondiente y realizando casting
            instruccionFor(Integer.parseInt(limite));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void instruccionFor(int valorLimite) {
        //for(Valor inicial del contador; valor final; incremento)
        for (int i = 1; i <= valorLimite; i++) {
            System.out.println("El valor de la repetición es: " + i);
        }
    }
}
