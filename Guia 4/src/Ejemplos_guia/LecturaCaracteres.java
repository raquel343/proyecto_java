package Ejemplos_guia;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class LecturaCaracteres {
    public static void main(String[] args) {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un nombre");
            String nombre = leer.readLine();
            //pasar todo a mayuscula
            leerCaracteres(nombre.toUpperCase());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void leerCaracteres(String palabra){
        
    //for(Valor inicial del contador; valor final; incremento)
        for (int i = 0; i < palabra.length(); i++) {//parametro final de la cantidad de caracteres
            //palabra.charAt(0) imprime el caracter correspondiente a la posicion 1
            System.out.println("Caracter: " + i +" -> "+palabra.charAt(i));
            
        }
    }
}
