package utils;

import java.util.Scanner;

public class utilities {

    //L'altribut scanner no ha de poder ser accedit des de fora
    Scanner llegir = new Scanner(System.in);


    /**
     * El constructor privat no permet crear metodes de la clase, tots els seus metodes haurán de ser de la clase static
     */
    private utilities() {};

    /**
     * Metode per llegir un enter
     * @param menuPrincipal
     * @return
     */
    public static int leerInt(String menuPrincipal) {
        Scanner llegir = new Scanner(System.in);
        int opcio = 0;
        boolean valorCorrecte = false;

        do {
            System.out.println(menuPrincipal);

            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte){
                System.out.println("ERROR: No has introduït un enter");
                llegir.nextLine();
            }else{
                opcio = llegir.nextInt();
                llegir.nextLine();
            }

        }while(!valorCorrecte);

        return opcio;
    }

    /**
     * Metode per llegir un enter amb un rang de valors
     * @param menuPrincipal
     * @param min
     * @param max
     * @return
     */
    public static int leerInt(String menuPrincipal, int min, int max) {
        Scanner llegir = new Scanner(System.in);
        int opcio = 0;
        boolean valorCorrecte = false;

        do {
            System.out.println(menuPrincipal);

            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte){
                System.out.println("ERROR: No has introduït un enter");
                llegir.nextLine();
            }else{
                opcio = llegir.nextInt();
                llegir.nextLine();

                if (opcio < min || opcio > max){
                    System.out.println("ERROR: Opció no correcte");
                    valorCorrecte = false;
                }
            }

        }while(!valorCorrecte);

        return opcio;
    }

    /**
     * Metode per llegir un enter sin msg, solo preguntando rango de valores
     * @param min
     * @param max
     * @return
     */
    public static int leerInt(int min, int max) {
        Scanner llegir = new Scanner(System.in);
        int opcio = 0;
        boolean valorCorrecte = false;

        do {

            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte){
                System.out.println("ERROR: No has introduït un enter");
                llegir.nextLine();
            }else{
                opcio = llegir.nextInt();
                llegir.nextLine();

                if (opcio < min || opcio > max){
                    System.out.println("ERROR: Opció no correcte");
                    valorCorrecte = false;
                }
            }

        }while(!valorCorrecte);

        return opcio;
    }

    /**
     * Metodo para leer un String con msg
     * @param msg
     * @return
     */
    public static String leerString(String msg) {
        Scanner leer = new Scanner(System.in);
        System.out.println(msg);
        String devoler = leer.nextLine();
        return devoler;
    }
}