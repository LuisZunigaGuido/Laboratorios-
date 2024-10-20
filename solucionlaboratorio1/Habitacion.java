public class Habitacion
{
    // atributos de la clase
    private int numeroHabitacion;
    private String tipoHabitacion;
    private double precioPorNoche;
    private boolean estadoReserva; // true = reservada, false = disponnible 
    private int numeroCamas;
    private int diasReservados;
    private double costoTotal = diasReservados*precioPorNoche;
    //constructor
    public Habitacion (int numeroHabitacion, String tipoHabitacion, 
    double precioPorNoche, int numeroCamas)
    {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioPorNoche = precioPorNoche;
        this.estadoReserva = false;//la habitacion va a empezar en disponible 
        this.numeroCamas = numeroCamas;
        this.diasReservados = 0; // vamos a empezar con cero dias reservados 
    }
    //metodos set y get para cada unos de los atributos 
    public int getNumeroHabitacion()//get del atributo numero de habitacion
    {
        return numeroHabitacion;
    }
    public void setNumeroHabitacion(int numeroHabitacionParam)//set del atributo numero de habitacion
    {
        this.numeroHabitacion = numeroHabitacionParam;
    }
    public String getTipoHabitacion()  //get del atributo tipo de habitacion
    {
        return tipoHabitacion;
    }
    public void setTipoHabitacion(String tipoHabitacionParam)
    {
        this.tipoHabitacion = tipoHabitacionParam; //set del atributo tipo de habitacion
    }
    public double getPrecioPorNoche() //get del atributo precio por noche 
    {
        return precioPorNoche;
    }
    public void setPrecioPorNoche() // set del atributo precio por noche 
    {
        this.precioPorNoche = precioPorNoche; 
    }
    public boolean getEstadoReserva() //get del atributo estado de reserva
    {
        return estadoReserva;
    }
    public void setEstadoReserva() //set del atributo estado de reserva
    {
        this.estadoReserva = estadoReserva;
    }
    public int getNumeroCamas() //get del atributo de numero de camas
    {
        return numeroCamas;
    }
    public void setNumeroCamas() //set del atributo numero de camas
    {
        this.numeroCamas = numeroCamas;
    }
    public int getDiasReservados() //get del atributo dias reservados
    {
        return diasReservados;
    }
    public void setDiasReservados() //set del atributo dias reservados
    {
        this.diasReservados = diasReservados;
    }
    // metodo para la reserva de la habitacion
    public void reservarHabitacion(int dias)
    {
        if (!estadoReserva)
        {
            this.estadoReserva = true;
            this.diasReservados = dias;
            System.out.println("la habitacion numero " 
            +(this.numeroHabitacion)+ " ha sido reservada exitosamente por" 
            +(dias)+ "dias");
            } else {
            System.out.println("la habitacion numero "
            +(numeroHabitacion)+ 
            "del hotel Paraiso de Marta esta reservada"); 
            System.out.println("El costo total es de "+costoTotal);
               }
    }
    // metodo para liberar la habitacion
    public void liberarHabitacion()
    {
        if (estadoReserva)
        {
            estadoReserva = false;
            diasReservados = 0;
            System.out.println("la habitacion numero " 
            +(numeroHabitacion)+ "esta liberada");
        } else {
            System.out.println("la habitacion numero " 
            +(numeroHabitacion)+ "ya se encuentra disponible");
        }
    }
    //metodo para calcular el costo total
    public double calcularCostoTotal() 
    {
        return precioPorNoche * diasReservados; 
    }
    //metodo para cambiar el tipo de habitacion
    public void cambiarTipo (String nuevoTipo)
    {
        this.tipoHabitacion = nuevoTipo;  
    }
    //metodo para cambiar el precio de la habitacion
    public void nuevoPrecio(double nuevoPrecio)
    {
        this.precioPorNoche = nuevoPrecio;
    }
    //metodo para cambiar el numero de camas
    public void nuevoNumeroCamas(int nuevoNumeroCamas)
    {
        this.numeroCamas = nuevoNumeroCamas;
    }
}

        
        
    
        
    
    
    