import java.util.Random;
public class Vector {
    private int []vector;
     public Vector (int[] vectorParam){
     this.vector = vectorParam;
    }
    public void setVector(int[] vector){
        this.vector = vector;
    }
    public void mostrarEntradas() {
        System.out.print("[");
        for(int i=0; i<this.vector.length; i++) {
            System.out.print(" " +vector[i]);
            
        }
        System.out.print("]");
        System.out.println(" ");
    }
    public void cambiarNumeros(){
        Random randomGen = new Random();
        for (int i=0;i<this.vector.length;i++) { 
           vector[i] = randomGen.nextInt(101);
        }
    }
    public void ordenamiento() {
        int valorMenor;
        int pocicionMenor;
        for(int i=0; i<vector.length; i++) {
            valorMenor = vector[0];
            for (int j=i+1;j<vector.length;j++) {
            if(valorMenor>vector[j]) {
                valorMenor = vector[j];
                }
            }
        }
    } 
    public int MostrarIndice () {
        int valorEntrada;
        for(int i=0;i < vector.length; i++) {
            
        }
        
    }
}
