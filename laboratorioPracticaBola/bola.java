
/**
 * Write a description of class bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bola
{
    private int radio;
    private int pocisionX;
    private int pocisionY;
    private int velocidadX;
    private int velocidadY;
    public bola (int radio, int pocisionX, int pocisionY, int velocidadX, int velocidadY){
        this.radio = radio;
        this.pocisionX = pocisionX;
        this.pocisionY = pocisionY;
        this.velocidadX = velocidadX;
        this.velocidadY = velocidadY;
    }
    //setter
    public void setRadio(int radio) {
        this.radio = radio;
    }
    public void setPocisionX(int pocisionX) {
        this.pocisionX = pocisionX;
    }
    public void setPocisionY(int pocisionY) {
        this.pocisionY = pocisionY;
    }
    public void setVelocidadX(int velocidadX) {
        this.velocidadX = velocidadX;
    }
    public void setVelocidadY(int velocidadY) {
        this.velocidadY = velocidadY;
    }
    
    //getters
    public int getRadio(){
        return radio;
    }
    public int getPocisionX(){
        return pocisionX;
    }
    public int getPocisionY(){
        return pocisionY;
    }
    public int getVelocidadX() {
        return velocidadX;
    }
    public int getVelocidadY() {
        return velocidadY;
    }
    
    //metodo para mover la bola
    public void MoverBola() {
        this.pocisionX = pocisionX + velocidadX;
        this.pocisionY = pocisionY + velocidadY;
    }
    //metodo para  rebotar la bola
    public void Rebote(int anchoLim, int altoLim) {
        //Rebote en el eje X
        if(this.pocisionX <=0 || this.pocisionY>=anchoLim) {
            this.velocidadX = -this.velocidadX;
        }
        //Rebote en el eje Y
        if(this.pocisionY <=0 || this.pocisionY>=altoLim) {
            this.velocidadY = -this.velocidadY;
        }
    }
    //pocision actual bola
    public void dibujar() {
    // Lógica para representar la bola en la pantalla
    System.out.println("Bola en X: " + pocisionX + " Y: " + pocisionY);
    }
    // actualizar el marco de rebote
    public void actualizar(int anchoLimite, int altoLimite) {
        MoverBola();
        Rebote(anchoLimite, altoLimite);
    }
    //reinicia pocisiones
    public void reiniciarPosicion(int nuevaX, int nuevaY) {
    this.pocisionX = nuevaX;
    this.pocisionY = nuevaY;
    }
}
