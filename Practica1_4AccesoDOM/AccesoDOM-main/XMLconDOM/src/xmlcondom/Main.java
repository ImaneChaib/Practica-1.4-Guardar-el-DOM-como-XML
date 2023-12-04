/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xmlcondom;

import java.io.File;

/**
 *
 * @author IMANE
 */
public class Main {

    
    public static void main(String[] args) {
        AccesoDOM acceso = new AccesoDOM();
        File file = new File("./Libros.xml");
        acceso.abrirXMLaDOM(file);
        acceso.recorreDOMyMuestra();
        acceso.insertarLibroEnDOM("AstErix & ObElix", "Uderzo", "1959");
        acceso.recorreDOMyMuestra();
        acceso.borrarLibro("Don Quijote");
        acceso.recorreDOMyMuestra();
        acceso.guardarDOMaArchivo("./LibrosDOM.xml");
    }
    
}
