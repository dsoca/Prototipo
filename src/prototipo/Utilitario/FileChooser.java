/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo.Utilitario;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.io.File;
import java.util.Date;
import java.util.InputMismatchException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class FileChooser {
    private JFileChooser fc;

    public FileChooser() {
        fc = new JFileChooser();
        fc.setBackground(Color.RED);        
        fc.setApproveButtonToolTipText("Guardar");
    }

    
    //CREA EL FILE CHOOSER PARA SELECCIONAR UN ARCHIVO
    public File abrirArchivo() {
        reset();
        File retorno = null;
        //Inhabilita el filtro predeterminado, que permite elegir cualquier archivo
        fc.setAcceptAllFileFilterUsed(false);
        
        //Habilita como filtro, al Filtro de Archivos
        fc.addChoosableFileFilter(new FiltroArchivos());
        //Agrega el accesorio para la vista previa del archivo.
        fc.setAccessory(new VistaPrevia(fc));

        //Muestra el FileChooser.
        int returnVal = fc.showOpenDialog(null);

        //Procesa el resultado, triando una excepcion en caso de error.
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            retorno = fc.getSelectedFile();
            if(retorno.exists()){
                return retorno;
            }
            else{
                throw new InputMismatchException();
            }
        }
        return null;
    }
    
  //MÉTODO PARA ASEGURAR QUE EL ARCHIVO TENGA EXTENSION .txt
    private File checkExtension(File retorno) {
        if (Edicion.getExtension(retorno) == null || !Edicion.getExtension(retorno).equals("txt")) {
            String nombre = retorno.getPath();
            nombre = nombre + ".txt";
            retorno = new File(nombre);
        }
        return retorno;
    }
    
//RESETEA LOS VALORES DEL FILECHOOSER.
    private void reset() {
        fc.setSelectedFile(null);
        fc.resetChoosableFileFilters();
    }
}

