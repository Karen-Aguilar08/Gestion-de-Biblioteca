/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecakb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



/**
 *
 * @author Admin
 */
public class BibliotecaKB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame pantallaPrincipal = new JFrame("Pantalla Principal");
        pantallaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantallaPrincipal.setSize(500, 400);
        pantallaPrincipal.setLayout(new BorderLayout());
        
        pantallaPrincipal.getContentPane().setBackground(Color.BLACK);

        JLabel tituloPantalla = new JLabel("Biblioteca KB", SwingConstants.CENTER);
        tituloPantalla.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 50));
        tituloPantalla.setForeground(new Color(139, 69, 75));
        
        pantallaPrincipal.add(tituloPantalla, BorderLayout.NORTH);
        
        // Imagen en el centro
        ImageIcon icono = new ImageIcon("C:\\Users\\Admin\\Pictures\\pla.jpg"); // Ruta a tu imagen
        JLabel imagenCentro = new JLabel(icono, SwingConstants.CENTER); // Etiqueta con la imagen
        pantallaPrincipal.add(imagenCentro, BorderLayout.CENTER); // Agregar la imagen al centro

        JButton btnContinuar = new JButton("Continuar");
        btnContinuar.setFont(new Font("Arial", Font.BOLD, 16)); // Letras negras y gruesas
        btnContinuar.setForeground(Color.BLACK); // Color del texto
        btnContinuar.setBackground(new Color(255, 182, 193)); // Fondo dusty pink
        btnContinuar.setFocusPainted(false); // Quitar el contorno al hacer clic
        pantallaPrincipal.add(btnContinuar, BorderLayout.SOUTH);
        
        pantallaPrincipal.setLocationRelativeTo(null);
        pantallaPrincipal.setVisible(true);

        // Acción del botón "Continuar"
        btnContinuar.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                pantallaPrincipal.setVisible(false); // Ocultar la pantalla principal
                mostrarVentanaPrincipal(); // Mostrar la ventana principal del sistema
            }
        });
    }
        
        public static void mostrarVentanaPrincipal() {
        Biblioteca biblioteca = new Biblioteca();
        
        JFrame frame = new JFrame("Sistema de Préstamos de Libros");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        Color verdePastel = new Color(200, 255, 200);
        frame.getContentPane().setBackground(verdePastel);
        
        Color verdeClaro = new Color(220, 255, 220);
        
        // Panel combinado para campos y botones
        JPanel panelCombinado = new JPanel();
        panelCombinado.setLayout(new BorderLayout());
        panelCombinado.setBackground(Color.BLACK);
        
        //Panel donde podemos agregar los libros
        JPanel panelAgregar = new JPanel();
        panelAgregar.setLayout(new GridLayout(2,2));
        panelAgregar.setBackground(verdePastel);
        panelAgregar.add(new JLabel("Título: "));
        JTextField txtTitulo = new JTextField();
        txtTitulo.setBackground(verdeClaro);
        panelAgregar.add(txtTitulo);
        panelAgregar.add(new JLabel("Autor: "));
        JTextField txtAutor = new JTextField();
        txtAutor.setBackground(verdeClaro);
        panelAgregar.add(txtAutor);
        
        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(verdePastel);
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton btnAgregar = new JButton("Agregar ");
        btnAgregar.setPreferredSize(new java.awt.Dimension(100, 25));
        JButton btnEliminar = new JButton("Eliminar ");
        btnEliminar.setPreferredSize(new java.awt.Dimension(100, 25));
        JButton btnMostrarLista = new JButton("Lista ");
        btnMostrarLista.setPreferredSize(new java.awt.Dimension(100, 25));
        JButton btnSalir = new JButton("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 25));
        
        // Personalizar los botones
        Color dustyPink = new Color(255, 182, 193); // Color dusty pink
        btnAgregar.setBackground(dustyPink);
        btnAgregar.setForeground(Color.BLACK); // Texto negro
        btnAgregar.setFont(new Font("Arial", Font.BOLD, 14)); // Texto grueso

        btnEliminar.setBackground(dustyPink);
        btnEliminar.setForeground(Color.BLACK);
        btnEliminar.setFont(new Font("Arial", Font.BOLD, 14));

        btnMostrarLista.setBackground(dustyPink);
        btnMostrarLista.setForeground(Color.BLACK);
        btnMostrarLista.setFont(new Font("Arial", Font.BOLD, 14));
        
        btnSalir.setBackground(dustyPink);
        btnSalir.setForeground(Color.BLACK);
        btnSalir.setFont(new Font("Arial", Font.BOLD, 14));
        
        panelBotones.add(btnAgregar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnMostrarLista);
        panelBotones.add(btnSalir);
        
        
        panelCombinado.add(panelAgregar, BorderLayout.NORTH);
        panelCombinado.add(panelBotones, BorderLayout.SOUTH);
        
        // Añadir el panel combinado al frame
        frame.add(panelCombinado, BorderLayout.NORTH);
        
        //Donde se muestra la lista de los libros
        
        
        JTextArea areaLista = new JTextArea();
        areaLista.setEditable(false);
        areaLista.setBackground(verdeClaro);
        JScrollPane scrollPane = new JScrollPane(areaLista);
        scrollPane.setBackground(verdePastel);
        
        //Panel para buscar los libros
        JPanel panelBuscar = new JPanel();
        panelBuscar.setLayout(new GridLayout(1, 3));
        panelBuscar.setBackground(verdePastel);
        panelBuscar.add(new JLabel("Buscar: "));
        JTextField txtBuscar = new JTextField();
        txtBuscar.setBackground(verdeClaro);
        panelBuscar.add(txtBuscar);
        JButton btnBuscar = new JButton("Buscar");
        
        btnBuscar.setBackground(dustyPink);
        btnBuscar.setForeground(Color.BLACK);
        btnBuscar.setFont(new Font("Arial", Font.BOLD, 14));
        
        panelBuscar.add(btnBuscar);
        
        //Todos los paneles a la pantalla
        frame.add(panelCombinado, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panelBuscar, BorderLayout.SOUTH);
        
        frame.setLocationRelativeTo(null);
        
        //Funcionalidad de los botones
        
        btnAgregar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String titulo = txtTitulo.getText().trim();
                String autor = txtAutor.getText().trim();
                if (!titulo.isEmpty() && !autor.isEmpty()){
                    biblioteca.agregarLibro(titulo, autor);
                    areaLista.append(titulo + " - " + autor + "\n");
                    txtTitulo.setText("");
                    txtAutor.setText("");
                }else{
                    JOptionPane.showMessageDialog(frame, "Rellene todos los campos");
                }
            }
        });
        
        btnEliminar.addActionListener(new ActionListener() {
   
    public void actionPerformed(ActionEvent e) {
        String titulo = txtTitulo.getText().trim();
        if (titulo != null && !titulo.trim().isEmpty()) {
            if (biblioteca.buscarLibro(titulo.trim())) {
                biblioteca.eliminarLibro(titulo.trim());
                // Actualizar el área de texto con la lista restante de libros
                areaLista.setText(biblioteca.listarLibros());
                JOptionPane.showMessageDialog(frame, "Libro eliminado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(frame, "Ingrese un título válido.");
        }
        }
    }
});
        
        btnBuscar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String titulo = txtBuscar.getText().trim();
                if (titulo != null && !titulo.trim().isEmpty()) {
                    if (biblioteca.buscarLibro(titulo.trim())) {
                        areaLista.setText("");
                        biblioteca.listarLibros().lines().forEach(line -> {
                            if (line.toLowerCase().contains(titulo.toLowerCase())) {
                                areaLista.append(line + "\n");
                            }
                        });
                    }                       
                }
            }
        });
        
        btnMostrarLista.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String listaLibros = biblioteca.listarLibros();
                if (!listaLibros.isEmpty()){
                    areaLista.setText(listaLibros);
                }else{
                    areaLista.setText("No hay libros en la biblioteca");
                }
            }
        });
        
        btnSalir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}