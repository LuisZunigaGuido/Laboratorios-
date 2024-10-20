import java.util.Scanner;

/**
 * Write a description of class Aritmetica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aritmetica
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Aritmetica
     */
    public Aritmetica()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public static void main ( String[] args){
        Scanner scanner = new Scanner(System.in); //llamamos una biblioteca y le ponemos scanner
        
        //medicion uno
         //toma los milisegundos actuales y system es un objeto dentro de Java
        System.out.println("Ingrese un numero: "); //esto le sale en la aplicacion 
    int num1 = scanner.nextInt(); 
    long startTime1= System.currentTimeMillis();
    System.out.println("El numero ingresado +2 es: " +(num1+2));
    long endTime1 = System.currentTimeMillis();
    long duration1 = endTime1 = startTime1;
    System.out.println("Tiempo de duración: " +duration1+ "milisegundos ");
    
    
    }
    
}
