
/**
 * Write a description of class RecursividadHileras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecursividadHileras
{
   int fin;
   public void separar(String cadena, int valor){
       //caso base
       if(cadena.isEmpty()){
           return; //salimos de la recursividad
       } else {
       
       // se determina el menor entre el tamaño de la cadena y el valor que queremos dividir.
       fin = Math.min(valor, cadena.length());
       // el substring empieza desde cero y corta en el minimo, extrayendo una parte del String
       System.out.println(cadena.substring(0, fin));
       
       //llamamos recursivo
       separar(cadena.substring(fin), valor);
       }
   }
   
}