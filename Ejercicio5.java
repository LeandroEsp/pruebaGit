public class Ejercicio5 {
    public static void main (String[] args) {
        //Rellenar una matriz de 4x5 con numeros 5
        int matriz[][] = new int [4][5];
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 5; c++) {
                matriz[f][c] = 5;
            }
        }
        for (int f = 0; f < 4; f++) {
            System.out.println("");
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c]+"||");
            }
        }
    }
}
