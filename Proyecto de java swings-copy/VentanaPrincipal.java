import javax.swing.*;
import java.io.IOException;
import java.io.FileWriter;
public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
        setTitle("Formulario del usuario ");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //centrar la ventana
        
        //barra de menus
        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu ("Archivo");
        JMenuItem nuevoItem = new JMenuItem ("Nuevo");
        JMenuItem guardarItem = new JMenuItem ("Guardar");
        JMenuItem salirItem = new JMenuItem("Salir");
        
        
        menuArchivo.add(nuevoItem);
        menuArchivo.add(guardarItem);
        menuArchivo.addSeparator();
        menuArchivo.add(salirItem);
        menuBar.add(menuArchivo);
        setJMenuBar(menuBar);
        
        salirItem.addActionListener(e -> System.exit(0));
        
        JPanel panelFormulario = new JPanel();
        panelFormulario.setLayout(new BoxLayout (panelFormulario, BoxLayout.Y_AXIS));
        
        JLabel etiquetaNombre = new JLabel ("nombre");
        JTextField campoNombre = new JTextField(10);
        
        JLabel etiquetaEmail = new JLabel("Email");
        JTextField campoEmail = new JTextField(30);
        
        JLabel etiquetaTelefono = new JLabel ("Telefono");
        JTextField campoTelefono = new JTextField(20);
        
        panelFormulario.add(etiquetaNombre);
        panelFormulario.add(campoNombre);
        panelFormulario.add(etiquetaEmail);
        panelFormulario.add(campoEmail);
        panelFormulario.add(etiquetaTelefono);
        panelFormulario.add(campoTelefono);
        add(panelFormulario);
        
        JButton botonGuardar = new JButton("Guardar");
        botonGuardar.addActionListener(e -> {
            String Nombre = campoNombre.getText();
            String Email = campoEmail.getText();
            String Telefono = campoTelefono.getText();
            
            try{
                FileWriter writer = new FileWriter("datos_usuario.txt", true);
                writer.write("  nombre: "+Nombre+ ", email: " +Email+ ", Telefono: " +Telefono); //\n
                writer.write("                                  ");
                writer.close();
                JOptionPane.showMessageDialog(null, "Datos guaradados exitosamente.");
            } catch (IOException ex){
                JOptionPane.showMessageDialog(null, "Error al guardar los archivos.");
            }
        });
        panelFormulario.add(botonGuardar);
        
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JComboBox <String> comboBox = new JComboBox<> (items);
        comboBox.setBounds(50,50,50,50);    
        add(comboBox);
    } 
    
        public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true); //mostrar la ventana 
    }      
}
