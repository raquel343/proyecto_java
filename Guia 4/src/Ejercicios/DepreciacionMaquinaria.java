package Ejercicios;

import java.util.Scanner;

public class DepreciacionMaquinaria {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cúal es el nombre de la máquina?");
        String nombre = leer.nextLine();
        System.out.println("¿Cúal es el costo de la máquina?");
        double costo = Double.valueOf(leer.nextLine());
        System.out.println("¿Cúal es el Periodo de depreciación?");
        int periodo = Integer.parseInt(leer.nextLine());

        double sumaDigitos = (periodo * (periodo + 1)) / 2;
        int años = 1;
        for (int i = periodo; i >= 1; i--) {
            double valor = costo * (i / sumaDigitos);
            System.out.println(" Año " + años+" "+valor);
            años++;
        }
    }

}
