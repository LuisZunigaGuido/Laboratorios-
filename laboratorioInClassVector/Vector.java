import java.util.Random;
public class Vector {
    int numeroMenor1=100;
    int numeroMenor2=100;
    private int []vector;
     public Vector (int[] vectorParam){
     this.vector = vectorParam;
    }
    public void setVector(int[] vector){
        this.vector = vector;
    }
    //metodo para mostrar las entradas del vector
    public void mostrarEntradas() {
        System.out.print("[");
        for(int i=0; i<this.vector.length; i++) {
            System.out.print(" " +vector[i]);
            
        }
        System.out.print("]");
        System.out.println(" ");
    }
    //metodo para cambiar las entradas del vector
    public void cambiarNumeros(){
        Random randomGen = new Random();
        for (int i=0;i<this.vector.length;i++) { 
           vector[i] = randomGen.nextInt(101);
        }
    }
    //metodo de ordenamiento
    public void ordenamiento() {
        int valorMenor;
        int posicionMenor;
        //puntero que dejamos fijo
        for (int i = 0; i < vector.length; i++) {
            valorMenor = vector[i];
            posicionMenor = i;
            //puntero con el que vamos a comparar
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] < valorMenor) {
                    valorMenor = vector[j];
                    posicionMenor = j;
                }
            }
            // intercambio de posiciones
            if (posicionMenor != i) {
                int intercambio = vector[i];
                vector[i] = vector[posicionMenor];
                vector[posicionMenor] = intercambio;
            }
        }
    }
    public int busquedaSecuencial(int entrada) {
        for(int i=0 ; i < vector.length ; i++) {
            if(entrada == vector[i]) {
                return i;
            } 
        }
        return -1;
    }
    public int entradasPares() {
        int CantidadPares=0;
        for(int i=0; i<vector.length;i++) {
            if(vector[i]%2==0) {
                CantidadPares++;
            }
        }
        return CantidadPares;
    }
    public int entradasImpares() {
        int CantidadImpares=0;
        for(int i=0; i<vector.length;i++) {
            if(vector[i]%2==1) {
                CantidadImpares++;
            }
        }
        return CantidadImpares;
    }
    public int longitudVector() {
        int mayor=0;
        int menor=100;
        int Resta=0;
        for(int j=1;j<vector.length;j++) {
            if(vector[j]>mayor) {
                mayor=vector[j];
            }
        }
        for(int i=0;i<vector.length;i++) {
            if(vector[i]<menor) {
                menor=vector[i];
            } 
        }
        Resta=mayor-menor;
        return Resta;
    }
    public int numeroMenor1(){
        for (int i=0;i<vector.length;i++) {
            if(vector[i]<numeroMenor1) {
                numeroMenor1=vector[i];
            } 
        }
        return numeroMenor1;
    }
    public int numeroMenor2(){
        for (int i=0;i<vector.length;i++) {
            if(vector[i]<numeroMenor2 && vector[i]>numeroMenor1) {
                numeroMenor2=vector[i];
            } 
        }
        return numeroMenor2;
    } 
}
