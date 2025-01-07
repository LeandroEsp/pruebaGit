import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args) {
        Scanner ciudades = new Scanner(System.in);
        Scanner temperaturas = new Scanner(System.in);
        int minima = 0;
        int minimaTemp = 0;
        int maximaTemp = 0;
        int maxima = 0, contMax = 0, contMin = 0;
        String ciudad[] = new String[5];
        int gradosMin[] = new int[5];
        int gradosMax[] = new int[5];
        //For para cargar el vector
        for (int i = 0; i < ciudad.length; i++) {
            System.out.print("Ingrese el nombre de la ciudad: ");
            ciudad[i] = ciudades.next();
            System.out.println("Ingrese su temperatura minima");
            gradosMin[i] = temperaturas.nextInt();
            minimaTemp = gradosMin[i];
            System.out.println("Ingrese su temperatura máxima");
            gradosMax[i] = temperaturas.nextInt();
            maximaTemp = gradosMax[i];
            if (i==0) {
                minima = minimaTemp;
            } else if (minimaTemp < minima) {
                minima = minimaTemp;
                contMin = i;
            }
            if (i==0) {
                maxima = maximaTemp;
            } else if (maximaTemp > maxima) {
                maxima = maximaTemp;
                contMax = i;
            }
        }
        System.out.println("La ciudad con la temperatura mas alta fue " +ciudad[contMax]+" con una temperatura de " +maxima);
        System.out.println("La ciudad con la temperatura mas baja fue " +ciudad[contMin]+" con una temperatura de " +minima);
    }
}

