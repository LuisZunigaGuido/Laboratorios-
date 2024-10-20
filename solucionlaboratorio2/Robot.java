import java.util.Random;
public class Robot 
{
    // Atributos de la clase Robot
    public String nombre;
    public int puntosVida;
    public boolean estadoRobot = true; 
    public static Random random = new Random();

    // Constructor de la clase
    public Robot(String nombre, int puntosVida, boolean estadoRobot) {
        this.nombre = nombre;
        this.puntosVida = 100;  // El robot siempre empieza con 100 puntos de vida
        this.estadoRobot = true; // El robot empieza vivo
    }
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getPuntosVida() {
        return puntosVida;
    }

    // Setters
    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    // Método para atacar a otro robot
    public void atacar(Robot atacado) {
        // Genera el daño aleatorio entre 10 y 20
        int daño = dañoAtaque();
        
        // Resta el daño a los puntos de vida del robot atacado
        atacado.setPuntosVida(atacado.getPuntosVida() - daño);

        // Verifica si el robot atacado ha sido destruido
        if (atacado.getPuntosVida() <= 0) {
            atacado.setPuntosVida(0);  // Asegura que la vida no sea negativa
            atacado.estadoRobot = false;
            System.out.println(atacado.getNombre() + " se encuentra sin vida, pues tiene " + atacado.getPuntosVida() + " de vida.");
        } else {
            System.out.println(this.getNombre() + " ha infligido " + daño + " puntos de daño a " + atacado.getNombre() + ".");
        }
    }

    // Método que devuelve el estado del robot (si está vivo o no)
    public boolean estadoRobot() {
        return puntosVida > 0;
    }

    // Método para generar el daño aleatorio entre 10 y 20
    public int dañoAtaque() {
        return random.nextInt(11) + 10;  // Daño entre 10 y 20 (inclusive)
    }
}
