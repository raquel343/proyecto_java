package Ejemplos_guia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraWhile {

    public static void main(String[] args) {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el número limite de repetición");
            String limite = leer.readLine();
            if (limite == null) {//Evalua si el valor string no esta vacio
                System.out.println("Dato invalido");
            } else {
                //Envio de parametro al metodo correspondiente y realizando csting
                instruccionWhileSencillo(Integer.parseInt(limite));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void instruccionWhileSencillo(int valorLimite) {
        int i = 1; //Valor inicial del contador
        while (i <= valorLimite) { //repetir mientras la condicion no se cumpla
            System.out.println("El valor de la repetición es: " + i);
            i++; //incrementando la iteracion en 1
        }
    }
}
