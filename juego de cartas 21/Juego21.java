import java.util.Scanner;
import java.util.Random;
public class Juego21 {
    static String[] baraja = {"As","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    //array figuras
    static String[] palos = {"corazón","diamante","espada","trebol"};
    public static void main(String[] args) {
        //array numeros
        for (int i=0;i<palos.length;i++) {
            for (int j=0;j<baraja.length;j++) {
                System.out.println(baraja[i] + "de"+palos[j]);
            }
        }
    }
    public void Mezclar(){
        Random rand = new Random ();
        //mezclamos baraja
        for (int i=0;i<baraja.length;i++) {
        int randomIndex = rand.nextInt(baraja.length);
        String temp = baraja[i];
        baraja[i] = baraja[randomIndex];
        baraja[randomIndex] = temp;
        }
        
        //mezclamos baraja
        for (int j=0;j<palos.length;j++) {
        int randomIndex = rand.nextInt(palos.length);
        String temp = palos[j];
        palos[j] = palos[randomIndex];
        palos[randomIndex] = temp;
        }
    }
}
