public class Carta {
    private int valor;  // El valor de la carta
    private String tipo;
    private String paloPerteneciente; //tipo de la carta perteneciente a un palo
    // Constructor
    public Carta(int valor, String tipo, String paloPerteneciente) {
        this.valor = valor;
        this.tipo = tipo;
        this.paloPerteneciente = paloPerteneciente;
    }

    // getters
    public String getPaloPerteneciente () {
        return paloPerteneciente;
    }
    public int getValor() {
        return valor;
    }
    public String getTipo(){
        return tipo;
    }

    // setters
    public void setPaloPerteneciente (){
        this.paloPerteneciente = paloPerteneciente;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public void setTipo(){
        this.tipo = tipo;
    }
}

