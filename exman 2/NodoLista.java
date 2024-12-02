
/**
 * Write a description of class NodoLista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NodoLista
{
   String nombre;
   int frecuencia;
   NodoLista nodoSiguiente;
   public NodoLista(String nombre){
        this.nombre = nombre;
        nodoSiguiente = null;
   }
    
    public void setnombre(String nombre){
       this.nombre = nombre;
   }
   public void setNodoSiguiente(NodoLista nodoSiguiente){
       this.nodoSiguiente = nodoSiguiente;
   }
   public void setFrecuencia(int frecuencia){
       this.frecuencia = frecuencia;
   }
   //getters
   public String getNombre(){
       return this.nombre;
   }
   public NodoLista getNodoSiguiente(){
       return this.nodoSiguiente;
   }
   public int getFrecuencia(){
       return this.frecuencia;
   }
}
