package builder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("** Construir una Casa **");
        boolean s = true;
        Scanner in = new Scanner(System.in);
        int op;
        while (s) {
            System.out.println("1.- Casa Económica");
            System.out.println("2.- Casa Media");
            System.out.println("3.- Casa Lujo");
            System.out.println("4.- Salir");
            System.out.println("Por favor seleccione una opcion: ");
            op = in.nextInt();
            switch (op) {
                case 1:
                    CasaMaker construirCasaE = new CasaMaker(new CasaEconomica());
                    construirCasaE.construirCasa();
                    Casa casaE = construirCasaE.getCasa();
                    casaE.mostrar();
                    break;
                case 2:
                    CasaMaker construirCasaM = new CasaMaker(new CasaMedia());
                    construirCasaM.construirCasa();
                    Casa casaM = construirCasaM.getCasa();
                    casaM.mostrar();
                    break;
                case 3:
                    CasaMaker construirCasaL = new CasaMaker(new CasaLujo());
                    construirCasaL.construirCasa();
                    Casa casaL = construirCasaL.getCasa();
                    casaL.mostrar();
                    break;
                case 4: 
                    s = false;
                    break;
                default: 
                    System.out.println("Option incorrecta...");

            }
        }

    }
}
