import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scannerVector = new Scanner(System.in);
        int[] vectorGeneral = {1, 2, 3, 4, 5, 6, 7, 8};
        
        // Inicializamos un objeto de la clase Vector
        Vector vector1 = new Vector(vectorGeneral);
        
        // Llamamos los métodos pertinentes
        vector1.mostrarEntradas();
        vector1.cambiarNumeros();
        vector1.mostrarEntradas();
        vector1.ordenamiento();
        
        System.out.println("El nuevo vector ordenado es:");
        vector1.mostrarEntradas();
        
        int CantidadParesAux = vector1.entradasPares();
        System.out.println("la cantidad de entradas pares son: "+CantidadParesAux);
        
        int CantidadImparesAux = vector1.entradasImpares();
        System.out.println("la cantidad de entradas impares son: "+CantidadImparesAux);
           
        int restaAux = vector1.longitudVector();
        System.out.println("la diferencia entre el mayor numero y el menos numero es: "+restaAux);
        
        int numeroMenor1Aux = vector1.numeroMenor1();
        System.out.println("el numero mas pequeño es: "+numeroMenor1Aux);
        
        int numeroMenor2Aux = vector1.numeroMenor2();
        System.out.println("El siguiente numero mas pequeño es: "+numeroMenor2Aux);
        
        System.out.println("Ingrese la entrada que desea: ");
        int entradaAux = scannerVector.nextInt();
        
        // Captura el resultado de la búsqueda
        int indice = vector1.busquedaSecuencial(entradaAux);
        if (indice != -1) {
            System.out.println("El índice de la entrada es: " + indice);
        } else {
            System.out.println("La entrada no se encontró en el vector.");
        }

    }
}
