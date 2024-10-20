public class Main {
    public static void main(String[] args) {
        // Define los límites del área de movimiento
        int anchoLimite = 800; // Ancho del área de juego
        int altoLimite = 600;  // Alto del área de juego

        // Crea una instancia de la bola
        bola bola = new bola(20, 100, 100, 5, 3); // radio, posicionX, posicionY, velocidadX, velocidadY

        // Simulación en un bucle (bucle infinito)
        int contadorIteraciones = 0; // Contador de iteraciones
        while (true) {
            // Actualiza la posición y verifica el rebote
            bola.actualizar(anchoLimite, altoLimite);
            bola.dibujar();

            // Incrementa el contador
            contadorIteraciones++;

            // Sal del bucle después de 20 iteraciones
            if (contadorIteraciones >= 50) {
                break; // Salir del bucle
            }
        }
    }
}




