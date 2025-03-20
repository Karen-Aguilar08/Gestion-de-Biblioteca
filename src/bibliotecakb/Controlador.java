/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecakb;

/**
 *
 * @author Admin
 */
public class Controlador {
    private Biblioteca biblioteca;

    public Controlador(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    
    public void manejarAgregar(String titulo, String autor){
        biblioteca.agregarLibro(titulo, autor);
    }
    
    public void manejarEliminar(String titulo){
        biblioteca.eliminarLibro(titulo);
    }
    
    public String manejarListar(){
        return biblioteca.listarLibros();
    }
    
    public boolean manejarBuscar(String titulo){
        return biblioteca.buscarLibro(titulo);
    }
}
