import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class VentanaPrincipal extends JFrame {
    private JTextField campoNombre;
    private JTextField campoEmail;
    private JTextField campoTelefono;
    private JButton botonGuardar;

    public VentanaPrincipal() {
        setTitle("Formulario del usuario");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centrar la ventana

        // barra de menús
        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem nuevoItem = new JMenuItem("Nuevo");
        JMenuItem guardarItem = new JMenuItem("Guardar");
        JMenuItem salirItem = new JMenuItem("Salir");

        menuArchivo.add(nuevoItem);
        menuArchivo.add(guardarItem);
        menuArchivo.addSeparator();
        menuArchivo.add(salirItem);
        menuBar.add(menuArchivo);
        setJMenuBar(menuBar);

        salirItem.addActionListener(e -> System.exit(0));

        JPanel panelFormulario = new JPanel();
        panelFormulario.setLayout(new BoxLayout(panelFormulario, BoxLayout.Y_AXIS));

        JLabel etiquetaNombre = new JLabel("Nombre");
        campoNombre = new JTextField(10);

        JLabel etiquetaEmail = new JLabel("Email");
        campoEmail = new JTextField(30);

        JLabel etiquetaTelefono = new JLabel("Telefono");
        campoTelefono = new JTextField(20);

        panelFormulario.add(etiquetaNombre);
        panelFormulario.add(campoNombre);
        panelFormulario.add(etiquetaEmail);
        panelFormulario.add(campoEmail);
        panelFormulario.add(etiquetaTelefono);
        panelFormulario.add(campoTelefono);
        add(panelFormulario);

        //boton de Guardar
        JButton botonGuardar = new JButton("Guardar");
        String Nombre = campoNombre.getText();
        String Email = campoEmail.getText();
        String Telefono = campoTelefono.getText();
        botonGuardar.setVisible(false);
        botonGuardar.addActionListener(e -> {
        try {
            FileWriter writer = new FileWriter("datos_usuario.txt", true);
            writer.write("nombre: " + Nombre + ", email: " + Email + ", Telefono: " + Telefono + "\n");
            writer.write("                                  ");
            writer.close();
            JOptionPane.showMessageDialog(null, "Datos guardados exitosamente.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar los archivos.");
        }});
        
        // JCheckBox para aceptar términos y condiciones
        JCheckBox checkBox = new JCheckBox("He leído y acepto los términos y condiciones previamente señalados");
        panelFormulario.add(checkBox);
        checkBox.setVisible(true);
        
        // JComboBox que tenga opciones de usuario
        String[] items = {"Cliente", "Empleado", "Administrador"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.addActionListener(e-> {
           botonGuardar.setVisible(checkBox.isSelected()); 
        }
        );
        comboBox.setName("Opciones de usuario");
        panelFormulario.add(comboBox);
        comboBox.setVisible(true);
        
        // Botón de limpiar
        JButton botonLimpiar = new JButton("Limpiar");
        botonLimpiar.addActionListener(e -> {
            campoNombre.setText("");
            campoEmail.setText("");
            campoTelefono.setText("");
            checkBox.setSelected(true);
            JOptionPane.showMessageDialog(null, "los datos fueron limpiados, inserte nuevos datos.");
        });
        

        panelFormulario.setLayout(new GridLayout(0, 1)); //deseo poner los botones a la par y moderados pero me conformo por el momento.
        panelFormulario.add(botonGuardar);
        panelFormulario.add(botonLimpiar);
    }
    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}