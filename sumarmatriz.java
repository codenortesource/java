package codenorte;


public class java_sumamatriz {
    // crea e imprime arreglos bidimensionales

    public static void main(String args[]) {
        int matriz1[][] = {{1, 1,},{1, 1,}};
        int matriz2[][] = {{1, 1,},{1, 1,}};
        int matriz3[][] = {{0, 0,},{0, 0,}};

        //suma los dos primeros arreglo o matriz.
        for (int fila = 0; fila < matriz1.length; fila++) {
            // itera a traves de las columnas de la fila actual
            for (int columna = 0; columna < matriz1[fila].length; columna++) {
                 matriz3[fila][columna] = matriz1[fila][columna]+matriz2[fila][columna];
            }
        }
        //imprime matriz1
        for (int fila = 0; fila < matriz1.length; fila++) {
            System.out.println();
            for (int columna = 0; columna < matriz1[fila].length; columna++) {
                System.out.print(matriz1[fila][columna]+" ");
            }
        }
        System.out.println();
        //imprime matriz2
        for (int fila = 0; fila < matriz2.length; fila++) {
            System.out.println();
            for (int columna = 0; columna < matriz2[fila].length; columna++) {
                System.out.print(matriz2[fila][columna]+" ");
            }
        }
        System.out.println();
        //imprime matriz3 que es la suma
        System.out.println("SUMA :");
        for (int fila = 0; fila < matriz1.length; fila++) {
            System.out.println();
            for (int columna = 0; columna < matriz1[fila].length; columna++) {
                System.out.print(matriz3[fila][columna]+" ");
            }
        }
        System.out.println();
    }
}

