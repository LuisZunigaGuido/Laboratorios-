public class ExtraerMatriz {
    int tamaño;
    public int[][] extraerMatriz(int[][] matriz, int fila, int columna, int rango ){
        tamaño = (rango+1)*2;
        //creamos la submatriz del tamaño correcto
        int[][] submatriz = new int[tamaño][tamaño];
        
        //aqui vamos a llamar al metodo recursivo
        llenarSub(matriz,submatriz, fila, columna , rango, 0);
        return submatriz;
    }
    
    public void llenarSub(int[][] matriz,int[][] submatriz, int fila, int columna, int rango, int centro){
        //caso base
        if (fila>= matriz.length){
            return; //salga de la recursividad
        } else {
            int X= centro-rango +fila;
            int Y= centro-rango+fila;
             if (X >= 0 && X < matriz.length && Y >= 0 && Y< matriz[0].length) {
                submatriz[fila][columna] = matriz[X][Y];
            } else {
                submatriz[fila][columna] = 0; // Fuera de límites
            }

            // Avanzar a la siguiente posición en la submatriz
            if (columna < submatriz[0].length - 1) {
                llenarSub(matriz, submatriz, centro, rango, fila, columna + 1);
            } else {
                llenarSub(matriz, submatriz, centro, rango, fila + 1, 0);
            }
        }
    }
    
    
}