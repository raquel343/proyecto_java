//Saira Raquel Mejia Barahona SIS22B 
package Ejemplos_guia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalcularIntresSimple {

    public static void main(String[] args) {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("INGRESE LA SIGUIENTE INFORMACION");
            System.out.println("Cantidad de dinero depositada");
            double cantidad = Double.valueOf(leer.readLine());
            System.out.println("Cantidad de años del deposito ");
            int años = Integer.parseInt(leer.readLine());
            System.out.println("Interes anual por el deposito");
            double interes = Double.valueOf(leer.readLine());
            System.out.println("-------------------------");
            interesSimple(cantidad, años, interes);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void interesSimple(double cantidad, int años, double interes) {
        for (int i = 1; i <= años; i++) {
            double interesPorAño = cantidad * (interes / 100);//calculo del interes anual
            cantidad += cantidad * (interes / 100); //suma a la cantidad actual + el interes de esa cantidad
            System.out.println("Cantidad interes en el año: " + i + " : " + interesPorAño);
            System.out.println("Monto por interes mas dinero " + cantidad);
            System.out.println("-------------------------------");
        }
    }
}
