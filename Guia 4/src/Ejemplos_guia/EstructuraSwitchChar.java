package Ejemplos_guia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraSwitchChar {

    public static void main(String[] args) {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese su estado civil");
        try {
            String estadoCivil = leer.readLine();
            SwitchChar(estadoCivil.toUpperCase().charAt(0));
        } catch (Exception e) {
            e.getMessage();
        }
    }
    public static void SwitchChar(char estadoCivil){
        String mensajeEstadoCivil;
        switch(estadoCivil){
            case 'S':
                mensajeEstadoCivil="Soltero/a";
                break;
            case 'C':
                mensajeEstadoCivil="Casado/a";
                break;
            case 'A':
                mensajeEstadoCivil="Acompañado/a";
                break;
            case 'D':
                mensajeEstadoCivil="Divorciado/a";
                break;
            case 'F':
                mensajeEstadoCivil="Forever Alone";
                break;
            default:
                mensajeEstadoCivil="Estado civi erroneo";
                break;
        }
        System.out.println("Su estado civil es: "+mensajeEstadoCivil);
    }
}
