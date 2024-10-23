import javax.swing.*;
public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
        setTitle("Formulario del usuario ");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //centrar la ventana
        
        //barra de menus
        JMenuBar menuBar = new JMenuBar();
        JMenu menuSalir = new JMenu ("Salir");
        JMenuItem salirOpcional = new JMenuItem ("salir opcional");
        JMenu menuArchivo = new JMenu ("Archivo");
        JMenuItem nuevoItem = new JMenuItem ("Nuevo");
        JMenuItem guardarItem = new JMenuItem ("Guardar");
        JMenuItem salirItem = new JMenuItem("Salir");
        
        
        menuArchivo.add(nuevoItem);
        menuArchivo.add(guardarItem);
        menuArchivo.addSeparator();
        menuArchivo.add(salirItem);
        menuSalir.add(salirOpcional);
        menuBar.add(menuArchivo);
        menuBar.add(menuSalir);
        setJMenuBar(menuBar);
    }
    
    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true); //mostrar la ventana 
    }      
}
