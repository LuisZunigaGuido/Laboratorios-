
public class Tablas {
    private int ancho;
    private int alto;
    private double precio;
    private int AREA_MAXIMA = 400 * 600; // Definimos el área máxima

    // Constructor
    public Tablas(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.precio = calcularPrecio(); // Inicializamos el precio al crear la tabla
    }

    // Setters
    public void setAlto(int alto) {
        this.alto = alto;
        this.precio = calcularPrecio(); // Actualizamos el precio al cambiar el tamaño
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
        this.precio = calcularPrecio(); // Actualizamos el precio al cambiar el tamaño
    }

    // Getters
    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public double getPrecio() {
        return precio;
    }

    // Método para calcular el área
    public int area() {
        return ancho * alto;
    }

    // Método para verificar si hay suficiente área disponible
    public boolean verificar(int anchoSolicitado, int altoSolicitado) {
        return (this.area() >= anchoSolicitado * altoSolicitado);
    }

    // Método para calcular el precio en función del área (con límite de 200)
    private double calcularPrecio() {
        double areaTabla = area(); // Área actual de la tabla
        return (areaTabla / AREA_MAXIMA) * 200; // Escalamos el precio al rango [0, 200]
    }
}



/*public class Tablas {
    private int ancho;
    private int alto;

    // Constructor
    public Tablas(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Setters
    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    // Getters
    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    // Método para calcular el área
    public int area() {
        return ancho * alto;
    }

    // Método para verificar si hay suficiente área disponible
    public boolean verificar(int anchoSolicitado, int altoSolicitado) {
        return (this.area() >= anchoSolicitado * altoSolicitado);
    }
}*/


