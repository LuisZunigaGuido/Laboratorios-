
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    private static int numero1=1234;
    private static int base=3;
    private static int exponente=4;
    private static String cadena = "recursividad";
    private static int numeroA = 36;
    private static int numeroB = 6;
    public static int sumaRecursiva(int n){
        //caso base
        if(n==0){
            return 0;
        } else {
            return n%10+sumaRecursiva(n/10);
        }
    }
    public static void main(String[] args){
        int resultadoSuma = sumaRecursiva(numero1);
        System.out.println("el resultado es "+ resultadoSuma);
        
        int resultadoElevar = elevarNumero(base, exponente);
        System.out.println(" el resultado de elevar "+base+ " al numero "+exponente+ " es "+resultadoElevar);
        
        String voltear = invertirCadena(cadena);
        System.out.println("la palabra es "+cadena+ " y volteada es " +voltear);
    }
    public static int elevarNumero(int numeroX, int numeroN){
        //caso base
        if(numeroN==0){
            return 1;
        } else {
            return numeroX*elevarNumero(numeroX,numeroN-1);
        }
    }
    public static String invertirCadena(String cadenaInvertir){
        //caso base
        if(cadenaInvertir.substring(1).isEmpty()){
            return cadenaInvertir;
        } else {
            return invertirCadena(cadenaInvertir.substring(1))+cadenaInvertir.charAt(0);
            
        }
    }
    //public static int mcd(int numeroA, int numeroB){
        //caso base
        //if(numeroA%numeroB==0){
          //  return numeroA/numeroB;
        //} else {
            
        
    }

