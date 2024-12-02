
/**
 * Write a description of class NodoDiccionario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NodoDiccionario
{
   String palabra1;
   String palabra2;
   NodoDiccionario nodoDerecho;
   NodoDiccionario nodoIzquierdo;
   public NodoDiccionario(String palabra1, String palabra2){
       this.palabra1 = palabra1;
       this.palabra2 = palabra2;
       nodoDerecho = null;
       nodoIzquierdo = null;
   }
   //setters
   public void setPalabra1(String palabra1){
       this.palabra1 = palabra1;
   }
   public void setPalabra2(String palabra2){
       this.palabra2 = palabra2;
   }
   public void setNodoDerecho(NodoDiccionario nodoDerecho){
       this.nodoDerecho = nodoDerecho;
   }
    public void setNodoIzquierdo(NodoDiccionario nodoIzquierdo){
       this.nodoIzquierdo = nodoIzquierdo;
   }
   //getters
   public String getPalabra1(){
       return this.palabra1;
   }
   public String getPalabra2(){
       return this.palabra2;
   }
   public NodoDiccionario getNodoDerecho(){
       return this.nodoDerecho;
   }
    public NodoDiccionario getNodoIzquierdo(){
       return this.nodoIzquierdo;
   }
}