
/**
 * Write a description of class Diccionario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diccionario
{
   NodoDiccionario nodoRaiz;
   public Diccionario(){
       this.nodoRaiz = null;
   }
   
   public boolean vacio(){
       if(this.nodoRaiz==null){
           System.out.println("el arbol esta vacío");
           return true;
       } else {
           return false;
       }
   }
   
   public void insertarRecursivo(NodoDiccionario nodo, String palabra1, String palabra2){
       NodoDiccionario nodoIngresado = new NodoDiccionario (palabra1, palabra2);
       if (nodo==null){
           this.nodoRaiz = nodoIngresado;
       } else {
           if(nodo.getPalabra1().compareTo(palabra1)<0){
               insertarRecursivo(nodo.getNodoDerecho(),palabra1, palabra2);
           } else if(nodo.getPalabra1().compareTo(palabra1)>0){
               insertarRecursivo(nodo.getNodoIzquierdo(), palabra1, palabra2);
           }
       }
   }
   
   public void insertar(String palabraNueva, String palabraNueva2){
       insertarRecursivo(this.nodoRaiz, palabraNueva, palabraNueva2);    
   }
}
