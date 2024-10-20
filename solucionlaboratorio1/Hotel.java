import java.util.Scanner;
public class Hotel
{ 
    public static Scanner scannerHoteleria /*mal nombre*/ = new Scanner(System.in);
    public static void main( String[] args)
    {
        System.out.println("Bienvenido al hotel El paraíso de Marta ");
        int numeroHabitacionAux;//pongale aux
        String tipoHabitacionAux;
        double precioPorNocheAux;
        boolean estadoReservaAux; // true = reservada, false = disponnible 
        int numeroCamasAux = 1;
        //creacion de las habitaciones
        //habitacion 1
        System.out.println("Ingrese el numero de la habitacion ");/*guarde en variables*/
        numeroHabitacionAux = scannerHoteleria.nextInt();
        System.out.println("Ingrese el tipo de habitacion ");
        tipoHabitacionAux = scannerHoteleria.nextLine();
        scannerHoteleria.nextLine();
        System.out.println("Ingrese el numero de camas de la habitacion");
        numeroCamasAux = scannerHoteleria.nextInt();
        System.out.println("Ingrese el precio por noche ");
        precioPorNocheAux = scannerHoteleria.nextDouble();

        Habitacion habitacion1 = new Habitacion(numeroHabitacionAux, tipoHabitacionAux, precioPorNocheAux, numeroCamasAux);
        
        //habitacion 2
        System.out.println("Ingrese el numero de la habitacion ");
        numeroHabitacionAux = scannerHoteleria.nextInt();
        System.out.println("Ingrese el tipo de habitacion ");
        tipoHabitacionAux = scannerHoteleria.nextLine();
        scannerHoteleria.nextLine();
         System.out.println("Ingrese el numero de camas ");
         numeroCamasAux = scannerHoteleria.nextInt();
        System.out.println("Ingrese el precio por noche ");
        precioPorNocheAux = scannerHoteleria.nextInt();
    
        Habitacion habitacion2 = new Habitacion(numeroHabitacionAux, tipoHabitacionAux, precioPorNocheAux, numeroCamasAux);
        
        //habitacion 3
        System.out.println("Ingrese el numero de la habitacion ");
        numeroHabitacionAux = scannerHoteleria.nextInt();
        System.out.println("Ingrese el tipo de habitacion ");
        tipoHabitacionAux = scannerHoteleria.nextLine();
        scannerHoteleria.nextLine();
        System.out.println("Ingrese el numero de camas ");
         numeroCamasAux = scannerHoteleria.nextInt();
        System.out.println("Ingrese el precio por noche ");
        precioPorNocheAux = scannerHoteleria.nextInt();
        
        Habitacion habitacion3 = new Habitacion(numeroHabitacionAux, tipoHabitacionAux, precioPorNocheAux, numeroCamasAux);
        
        //hbaitacion 4
        System.out.println("Ingrese el numero de la habitacion ");
        numeroHabitacionAux = scannerHoteleria.nextInt();
        System.out.println("Ingrese el tipo de habitacion ");
        tipoHabitacionAux = scannerHoteleria.nextLine();
        scannerHoteleria.nextLine();
        System.out.println("Ingrese el numero de camas ");
        numeroCamasAux = scannerHoteleria.nextInt();
        System.out.println("Ingrese el precio por noche ");
        precioPorNocheAux = scannerHoteleria.nextInt();
        
        Habitacion habitacion4 = new Habitacion(numeroHabitacionAux, tipoHabitacionAux, precioPorNocheAux, numeroCamasAux);
         
        //habitacion 5
        System.out.println("Ingrese el numero de la habitacion ");
        numeroHabitacionAux = scannerHoteleria.nextInt();
        System.out.println("Ingrese el tipo de habitacion ");
        tipoHabitacionAux = scannerHoteleria.nextLine();
        scannerHoteleria.nextLine();
        System.out.println("Ingrese el numero de camas ");
        numeroCamasAux = scannerHoteleria.nextInt();
        System.out.println("Ingrese el precio por noche ");
        precioPorNocheAux = scannerHoteleria.nextInt();        
        
        Habitacion habitacion5 = new Habitacion(numeroHabitacionAux, tipoHabitacionAux, precioPorNocheAux, numeroCamasAux);
        
        //relaciones entre habitaciones
        int option=0;
        do {
            System.out.println("----Cambios pertinentes de las habitaciones----");
            System.out.println("1. cambiar el tipo de habitacion ");
            System.out.println("2. cambiar el precio de la habitacion ");
            System.out.println("3. cambiar el numero de camas ");
            System.out.println("4. reservar habitacion ");
            System.out.println("5. liberar la habitacion ");
            System.out.println("6. salir del sistema  ");
            option = scannerHoteleria.nextInt();
            switch (option){
                case 1:
                    cambiarTipoAux(seleccionarHabitacion(scannerHoteleria, habitacion1, habitacion2, habitacion3, habitacion4, habitacion5));
                    break;
                case 2:
                    nuevoPrecio(seleccionarHabitacion(scannerHoteleria, habitacion1, habitacion2, habitacion3, habitacion4, habitacion5));
                    break;
                case 3:
                    nuevoNumeroCamas(seleccionarHabitacion(scannerHoteleria, habitacion1, habitacion2, habitacion3, habitacion4, habitacion5));
                    break;
                case 4:
                    reservarHabitacion(seleccionarHabitacion(scannerHoteleria, habitacion1, habitacion2, habitacion3, habitacion4, habitacion5));
                    break;
                case 5:
                    liberarHabitacion(seleccionarHabitacion(scannerHoteleria, habitacion1, habitacion2, habitacion3, habitacion4, habitacion5));   
                    break;
                case 6:
                    System.out.println("saliendo del sistema ");
                    break;
                default:
                    System.out.println("la opcion seleccionada no es valida ");   
            }   
        } while (option!=5);
        scannerHoteleria.close();
    }
    
    //metodos auxiliares 
    private static Habitacion seleccionarHabitacion(Scanner scannerHoteleria, Habitacion habitacion1, Habitacion habitacion2,
                    Habitacion habitacion3, Habitacion habitacion4, Habitacion habitacion5) {
        System.out.print("Ingrese el número de habitacion (1-5): ");
        int numHabitacion = scannerHoteleria.nextInt();
        switch (numHabitacion) {
            case 1:
                    return habitacion1;
            case 2:
                    return habitacion2;
            case 3:
                    return habitacion3;
            case 4:
                    return habitacion4;
            case 5:
                    return habitacion5;
            default:
                    System.out.println("Número de habitacion inválido.");
                    return null;
        }
    }
    
    private static void cambiarTipoAux(Habitacion habitacionParam) {
        if (habitacionParam!=null) {
            System.out.println("Ingrese el nuevo tipo ");
            String nuevoTipoAux = scannerHoteleria.nextLine();
            habitacionParam.cambiarTipo(nuevoTipoAux);  
            scannerHoteleria.nextLine();
        }
    }
    
    private static void nuevoPrecio(Habitacion habitacionParam) {
        if (habitacionParam!=null) {
            System.out.println("Ingrese el nuevo precio de la habitacion ");
            double nuevoPrecioAux = scannerHoteleria.nextDouble();
            habitacionParam.nuevoPrecio(nuevoPrecioAux);
        }
    }
    
    private static void nuevoNumeroCamas(Habitacion habitacionParam) {
        if (habitacionParam!=null) {
            System.out.println("Ingrese el nuevo numero de camas de la habitacion");
            int nuevoNumeroCamasAux = scannerHoteleria.nextInt();
            habitacionParam.nuevoNumeroCamas(nuevoNumeroCamasAux);
        }
    }
    
    private static void reservarHabitacion(Habitacion habitacionParam) {
        if (habitacionParam!=null) {
            System.out.println("Ingrese el numero de dias que desea reservar ");
            int dias = scannerHoteleria.nextInt();
            habitacionParam.reservarHabitacion(dias);
            System.out.println("la habitacion ha sido reservada exitosamente ");
        }
    }
    
    private static void liberarHabitacion(Habitacion habitacionParam) {
        if (habitacionParam!=null) {
            habitacionParam.liberarHabitacion();
            System.out.println("la habitacion fue liberada con exito");
        }
    }
}