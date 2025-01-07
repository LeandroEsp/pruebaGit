import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Una compañia de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diariamente, uno por la mañana, otro al mediodia, y otro a la noche. Para
        //administrar los datos, utiliza una matriz, donde cada fila es un destino y en cada columna se guarda la cantidad de asientos disponibles. Ejemplo:
        /*
                            0       1       2
                           Mañana   Tarde   Noche
        0 Rio de janeiro    120     15      30
        1 Cancun            65      1       2
        2 Madrid            4       52      7
        3 Roma              46      32      16
        4 Milan             64      23      11
        5 Iguazu            61      12      91
         */

        /*
        i. Se necesita un programa que permita la carga de la matriz, con la cantidad de asientos disponibles para cada vuelo.
        ii. Al mismo tiempo, el programa debe permitir al usuario ingresar el numero de destino al que quiere dirigirse, el numero de vuelo
        dependiendo si va a viajar a la mañana, tarde o noche y la cantidad de pasajes que necesita.
        iii. A partir de la solicitud del usuario, el programa debe controlar si hay la cantidad suficientes de asientos para la cantidad de pasajes que se requiere
        En caso que asi sea, se debe mostrar por pantalla un cartel que diga "su reserva fue realiza con exito" y se debe descontar del total de asientos los solicitados
        por el usuario. En caso de no haber mas asientos disponibles, se debe informar con otro cartel que diga "disculpe, no se pudo completar su operacion dado que no
        hay asientos disponibles"

        Desde la compañia de vuelos manifiestan que no conocen cuantas ventas/reservas se hacen por dia. Por lo cual, para finalizar las ventas se ingresa la palabra
        "finish"
         */

        Scanner teclado = new Scanner(System.in);
        Scanner salir = new Scanner(System.in);
        String eleccion = "";
        int fila, columna, asientos;
        int matriz[][] = new int[6][3];


        //Carga de la matriz
        for (int f = 0; f < 6; f++) {
            if (f == 0) {
                System.out.println("--- Usted esta cargando los datos del vuelo de Rio de Janeiro ---");
            } else if (f == 1) {
                System.out.println("--- Usted esta cargando los datos del vuelo de Cancún ---");
            } else if (f == 2) {
                System.out.println("--- Usted esta cargando los datos del vuelo de Madrid ---");
            } else if (f == 3) {
                System.out.println("--- Usted esta cargando los datos del vuelo de Roma ---");
            } else if (f == 4) {
                System.out.println("--- Usted esta cargando los datos del vuelo de Milán ---");
            } else {
                System.out.println("--- Usted esta cargando los datos del vuelo de Iguazu ---");
            }
            for (int c = 0; c < 3; c++) {
                    if (c==0) {
                        System.out.print("Asientos disponibles en la mañana: ");
                        matriz[f][c] = teclado.nextInt();
                    } else if (c==1) {
                        System.out.print("Asientos disponibles en la tarde: ");
                        matriz[f][c] = teclado.nextInt();
                    } else {
                        System.out.print("Asientos disponibles en la noche: ");
                        matriz[f][c] = teclado.nextInt();
                    }
            }
            System.out.println("---------------------------------------------------------------------------");
        }

        //Muetra de la matriz
        for (int f = 0; f < 6; f++) {
            System.out.println("");
            for (int c = 0; c < 3; c++) {
                System.out.print(matriz[f][c] +"||");
            }
        }
        System.out.println("");
        //Elección pasaje y numero de asientos.
        while (!eleccion.equalsIgnoreCase("finish")){
            System.out.println("Ingrese el destino al que quiere ir: ");
            System.out.println("0- Rio de janeiro");
            System.out.println("1- Cancun");
            System.out.println("2- Madrid");
            System.out.println("3- Roma");
            System.out.println("4- Milan");
            System.out.println("5- Iguazu");
            fila = teclado.nextInt();
            System.out.println("¿En que horario quiere viajar?");
            System.out.println("0- Mañana");
            System.out.println("1- Tarde");
            System.out.println("2- Noche");
            columna = teclado.nextInt();
            System.out.println("¿Cuantas personas van a viajar?");
            asientos = teclado.nextInt();
            if (matriz[fila][columna] >= asientos) {
                System.out.println("Su reserva se realizo con exito");
                matriz[fila][columna] = matriz[fila][columna] - asientos;
                System.out.println("Para terminar escriba finish, sino, presione cualquier tecla");
                eleccion = salir.next();
            } else {
                System.out.println("Su reserva no se pudo realizar");
                System.out.println("Para terminar escriba finish, sino, presione cualquier tecla");
                eleccion = salir.next();
            }
        }

        //Muetra de la matriz actualizada
        System.out.println("---- Así quedo la matriz -----");
        for (int f = 0; f < 6; f++) {
            System.out.println("");
            for (int c = 0; c < 3; c++) {
                System.out.print(matriz[f][c] +"||");
            }
        }


    }
}
