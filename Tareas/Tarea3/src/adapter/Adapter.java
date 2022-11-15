package adapter;

import java.util.Scanner;

/**
 *
 * @author Esteban Daniel Cruz Yaibona
 */
public class Adapter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;
        do
        {
            System.out.print("MENU DE OPCIONES\n"
                    + "-----------------\n"
                    + "1. Sumar\n2. Sumatoria\n3. Salir\nSeleccione una opción: ");
            opcion = in.nextInt();
            switch (opcion)
            {
                case 1:
                    int a = 1;
                    break;
                    
                case 2:
                    
                    break;
                case 3: 
                    System.out.println("¡Cerrando Programa!");
                    break;
                default:
                    System.out.println("La opción ingresada NO es válida.");
            }
        } while (opcion != 3);
        
    }
}
