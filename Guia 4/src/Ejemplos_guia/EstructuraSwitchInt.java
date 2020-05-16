package Ejemplos_guia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraSwitchInt {

    public static void main(String[] args) {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese número entre 1 y 5");
            int numero=Integer.parseInt(leer.readLine());
            SwitchChar(numero);
      }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void SwitchChar(int estadoCivil){
        String nombreDelNumero;
        switch(estadoCivil){
            case 1:
                nombreDelNumero="UNO";
                break;
            case 2:
                nombreDelNumero="DOS";
                break;
            case 3:
                nombreDelNumero="TRES";
                break;
            case 4:
                nombreDelNumero="CUATRO";
                break;
            case 5:
                nombreDelNumero="CINCO";
                break;
            default:
                nombreDelNumero="Número no válido";
             
        }
        System.out.println("Su estado civil es: "+nombreDelNumero);
    }
}
