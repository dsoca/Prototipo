/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo.Utilitario;

import java.io.File;
import javax.swing.filechooser.*;

// La clase FiltroImagenes es utilizada por PanelIngresoJugador
public class FiltroArchivos extends FileFilter {
    

    //Acepta sólo los directorios y  los archivos gif, jpg, tiff, tif, o png.
    @Override
    public boolean accept(File archivo) {
        boolean retorno = false;
        if (archivo.isDirectory()) {
            retorno =  true;
        }

        String extension = Edicion.getExtension(archivo);
        if (extension != null) {
            if (extension.equals("txt") ||
                extension.equals("xls")){                
                    retorno = true;
            } else {
                retorno = false;
            }
        }
        return retorno;
    }

    //Descripción del Filtro que aparecerá en el JFileChooser.
    @Override
    public String getDescription() {
        return "Archivos Texto";
    }
}
