public class main {
    public static void main(String[] args){
       RecursividadHileras hileras = new RecursividadHileras();
       String cadena = "abdhgjfgljrk";
       int valor = 4;
       hileras.separar(cadena,valor);
       
       
       // Matriz de ejemplo
       ExtraerMatriz ExMatriz = new ExtraerMatriz();
       int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

       int i = 2;  // Centro X
       int j = 2;  // Centro Y
       int rango = 1; // Rango de extracción

        // Extraer submatriz
       int[][] subMatriz = ExMatriz.extraerMatriz(matriz, i, j, rango);
       // Imprimir la submatriz
        for (int k=0; i<subMatriz.length; i++) {
            for (int n=0; n<subMatriz.length; n++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}

