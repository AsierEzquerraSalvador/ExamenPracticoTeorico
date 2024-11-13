import java.util.Random;

public class Main {



    private static final int row = 3;
    private static final int col = 9;
    private static int[][] matriz = new int [row][col];

    private static Random random = new Random();



    private static void OrdenarMatriz(){
        int cont=0;
        do {
            for (int row = 0; row < matriz.length-1 ; row++) {
                for (int col = 0; col < matriz[0].length-1 ; col++) {
                    if (matriz[row][col] > matriz [row + 1][col]){
                        int aux;
                        aux = matriz[row][col];
                        matriz[row][col] = matriz[row + 1][col];
                        matriz[row + 1][col] = aux;

                    }
                }
            }
            cont++;
        }while (cont < col);
    }

    private static void ImprimirMatriz(){
        for (int row = 0; row < matriz.length; row++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print(matriz[row][col] + "\t");
            }
            System.out.println();
        }
    }

    private static void RellenarTablero(){
        for (int col = 0; col < matriz[0].length; col++) {
            int min = 10 + (col * 10); // valor mínimo para la columna actual
            int max = min + 9;     	// valor máximo para la columna actual

            for (int row = 0; row < matriz.length; row++) {
                matriz[row][col] = random.nextInt(max - min + 1) + min;
            }
        }
    }
    public static void main(String[] args) {


        // Llenar la matriz de acuerdo al rango en cada columna


        // Imprimir la matriz

        RellenarTablero();
        OrdenarMatriz();
        ImprimirMatriz();

    }
}
