import java.util.Scanner;
import java.util.Random; // Importamos Random para generar números aleatorios
public class juegoBatalla {
    static int robotsVivos = 0; // Variable global para contar robots vivos
    public static Scanner scannerBattle = new Scanner(System.in); // Scanner para entrada de datos
    public static Random random = new Random(); // Objeto Random para selección aleatoria
    public int dañoAleatorio;
    public static int daño;
    public static void main(String[] args) {
        int numRobots = 0; // Variable para almacenar el número de robots
        // Pedimos al usuario que ingrese el número de robots entre 2 y 10
        
        do {
            System.out.print("Ingrese el número de robots que participarán (entre 2 y 10): ");
            numRobots = scannerBattle.nextInt(); // Captura del número de robots
        } while (numRobots < 2 || numRobots > 10); // Asegurarse de que el número esté entre 2 y 10
        
        // Crear el array de robots con el tamaño que eligió el usuario
        Robot[] robotsArray = new Robot[numRobots];
        // Pedimos al usuario que ingrese un nombre para cada robot
        
        for (int i = 0; i < robotsArray.length; i++) {
            System.out.print("Ingrese el nombre del robot " + (i + 1) + ": ");
            String nombre = scannerBattle.next(); // Captura del nombre
            robotsArray[i] = new Robot(nombre, 100, true); // Inicialización del robot
        }
        iniciarBatalla(robotsArray); // Iniciar la simulación de la batalla
    }
    public static void iniciarBatalla(Robot[] robotsArray) {
        boolean batallaEnCurso = true; // Variable para controlar el estado de la batalla

        // Mientras haya más de un robot vivo, la batalla sigue
        while (batallaEnCurso) {
            robotsVivos = 0; // Reiniciar el contador de robots vivos al comienzo de cada ronda
            for (int i = 0; i < robotsArray.length; i++) {
                // Si el robot actual está vivo
                if (robotsArray[i].estadoRobot()) {
                    int objetivo = seleccionaOtroRobot(i, robotsArray); // Seleccionar oponente aleatorio
                    
                    // Si encontramos un robot vivo para atacar
                    if (robotsArray[objetivo].estadoRobot()) {
                        robotsArray[i].atacar(robotsArray[objetivo]);// El robot ataca a su objetivo
                        // Mostrar los puntos de vida del robot atacado
                        System.out.println(robotsArray[objetivo].getNombre() + " tiene " 
                        + robotsArray[objetivo].getPuntosVida() + " puntos de vida.");

                        // Verificar si el robot atacado sigue vivo
                        EstadoRobot(robotsArray, objetivo);
                    }
                }
            }
            // Contamos cuántos robots siguen vivos después de cada ronda
            contadorDeRobots(robotsArray);
            // Si queda uno o menos robots vivos, termina la batalla
            if (robotsVivos <=1) {
                    batallaEnCurso = false; // Cambiar la bandera para terminar la batalla
            }
            if (robotsVivos <= 1) {
                batallaEnCurso = false; // Cambiar la bandera para terminar la batalla
                buscarGanador(robotsArray); // Buscar y anunciar el ganador
            } else {
                System.out.println("No hay un ganador hasta el momento.");
                System.out.println("Pulse una tecla para continuar la simulación.");
                scannerBattle.next(); // Pausar la simulación hasta que el usuario pulse una tecla
            }
        }
    }
    // Método para seleccionar otro robot aleatorio
    public static int seleccionaOtroRobot(int atacante, Robot[] robotsArray) {
        int objetivo;
        do {
            objetivo = random.nextInt(robotsArray.length); // Selecciona un índice aleatorio
        } while (objetivo == atacante || !robotsArray[objetivo].estadoRobot()); // Asegurarse de que el objetivo no sea el atacante ni esté destruido
        return objetivo;
    }
    //Método para que cuente 
    public static void contadorDeRobots(Robot[] robotsArray) {
        for (Robot robot : robotsArray) {
                if (robot.estadoRobot()) {
                    robotsVivos++;
                }
            }
    }
    
    public static void EstadoRobot(Robot[] robotsArray, int objetivo) {
        if (robotsArray[objetivo].estadoRobot()) {
        System.out.println(robotsArray[objetivo].getNombre() + " aún está vivo.");
        } else {
        System.out.println(robotsArray[objetivo].getNombre() + " ha sido destruido.");
        }
    }
    
    public static void buscarGanador(Robot[] robotsArray) {
        // Anunciar el robot ganador
        for (Robot robot : robotsArray) {
            if (robot.estadoRobot()) {
                System.out.println("El ganador es: " + robot.getNombre());
            }
        }
    }
}