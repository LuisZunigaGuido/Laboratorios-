import java.util.Scanner;

public class Main {
    private static Tablas tablaMaxima = new Tablas(400, 600); // Tabla del tamaño máximo
    private static Tablas[] almacenTablas = new Tablas[500]; // Almacén de tablas
    private static int almacenIndex = 0; // Índice para el almacén
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true; // Control para el ciclo principal
        while (continuar) {
            System.out.println("Ingrese el ancho deseado para la tabla en centimetros: ");
            int anchoSolicitado = scanner.nextInt();
            System.out.println("Ingrese el alto deseado para la tabla en centimetros: ");
            int altoSolicitado = scanner.nextInt();

            // Verificar si hay suficiente área en el almacén
            Tablas tablaUsar = buscarTablaEnAlmacen(anchoSolicitado, altoSolicitado);
            if (tablaUsar != null) {
                cortarTabla(tablaUsar, anchoSolicitado, altoSolicitado);
                System.out.println("El precio de la tabla cortada es: $" + tablaUsar.getPrecio()); // Mostrar precio
            } else {
                System.out.println("No hay tablas en el almacén con suficiente área. Creando nueva tabla...");
                cortarTabla(tablaMaxima, anchoSolicitado, altoSolicitado);
                System.out.println("El precio de la nueva tabla es: $" + tablaMaxima.getPrecio()); // Mostrar precio
            }

            System.out.println("¿Desea continuar? (s/n)");
            char respuesta = scanner.next().charAt(0);
            if (respuesta != 's' && respuesta != 'S') {
                continuar = false; // Terminar el ciclo
            }
        }
    }

    // Método para buscar la tabla más óptima en el almacén
    private static Tablas buscarTablaEnAlmacen(int ancho, int alto) {
        for (int i = 0; i < almacenIndex; i++) {
            if (almacenTablas[i].verificar(ancho, alto)) {
                return almacenTablas[i]; // Devolver la tabla que cumple
            }
        }
        return null; // No hay tabla adecuada
    }

    // Método para cortar la tabla y almacenar el sobrante
    private static void cortarTabla(Tablas tabla, int ancho, int alto) {
        if (tabla.verificar(ancho, alto)) {
            // Se corta la tabla
            System.out.println("Cortando tabla de " + ancho + "x" + alto);
            tabla.setAncho(tabla.getAncho() - ancho);
            tabla.setAlto(tabla.getAlto() - alto);

            // Almacenar el sobrante
            almacenarSobrante(tabla.getAncho(), tabla.getAlto());
            System.out.println("Tabla cortada y sobrante almacenado.");
        } else {
            System.out.println("No se puede cortar la tabla solicitada.");
        }
    }

    // Método para almacenar el sobrante en el almacén
    private static void almacenarSobrante(int anchoRestante, int altoRestante) {
        if (almacenIndex < almacenTablas.length) {
            almacenTablas[almacenIndex] = new Tablas(anchoRestante, altoRestante);
            almacenIndex++;
            System.out.println("Sobrante almacenado.");
        } else {
            System.out.println("Almacén lleno, no se puede almacenar más tablas.");
        }
    }
}

/*import java.util.Scanner;

public class Main {
    private static Tablas tablaMaxima = new Tablas(400, 600); // Tabla del tamaño máximo
    private static Tablas[] almacenTablas = new Tablas[500]; // Almacén de tablas
    private static int almacenIndex = 0; // Índice para el almacén
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true; // Control para el ciclo principal
        while (continuar) {
            System.out.println("Ingrese el ancho deseado para la tabla: ");
            int anchoSolicitado = scanner.nextInt();
            System.out.println("Ingrese el alto deseado para la tabla: ");
            int altoSolicitado = scanner.nextInt();

            // Verificar si hay suficiente área en el almacén
            Tablas tablaUsar = buscarTablaEnAlmacen(anchoSolicitado, altoSolicitado);
            if (tablaUsar != null) {
                cortarTabla(tablaUsar, anchoSolicitado, altoSolicitado);
            } else {
                System.out.println("No hay tablas en el almacén con suficiente área. Creando nueva tabla...");
                cortarTabla(tablaMaxima, anchoSolicitado, altoSolicitado);
            }
        
            System.out.println("¿Desea continuar? (s/n)");
            char respuesta = scanner.next().charAt(0);
            if (respuesta != 's' && respuesta != 'S') {
                continuar = false; // Terminar el ciclo
            }
        }
    }

    // Método para buscar la tabla más óptima en el almacén
    private static Tablas buscarTablaEnAlmacen(int ancho, int alto) {
        for (int i = 0; i < almacenIndex; i++) {
            if (almacenTablas[i].verificar(ancho, alto)) {
                return almacenTablas[i]; // Devolver la tabla que cumple
            }
        }
        return null; // No hay tabla adecuada
    }

    // Método para cortar la tabla y almacenar el sobrante
    private static void cortarTabla(Tablas tabla, int ancho, int alto) {
        if (tabla.verificar(ancho, alto)) {
            // Se corta la tabla
            System.out.println("Cortando tabla de " + ancho + "x" + alto);
            tabla.setAncho(tabla.getAncho() - ancho);
            tabla.setAlto(tabla.getAlto() - alto);

            // Almacenar el sobrante
            almacenarSobrante(tabla.getAncho(), tabla.getAlto());
            System.out.println("Tabla cortada y sobrante almacenado.");
        } else {
            System.out.println("No se puede cortar la tabla solicitada.");
        }
    }

    // Método para almacenar el sobrante en el almacén
    private static void almacenarSobrante(int anchoRestante, int altoRestante) {
        if (almacenIndex < almacenTablas.length) {
            almacenTablas[almacenIndex] = new Tablas(anchoRestante, altoRestante);
            almacenIndex++;
            System.out.println("Sobrante almacenado.");
        } else {
            System.out.println("Almacén lleno, no se puede almacenar más tablas.");
        }
    }
    
}*/
