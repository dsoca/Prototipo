/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo.Utilitario;

/**
 *
 * @author Usuario
 */
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.*;

public class Utilitario {

    public static int mensajeConfirma(String mensaje, String titulo){
       return JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.YES_NO_OPTION);
    }
   
   public static void mensajeError(String mensaje, String titulo){
       JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
   }

   public static void mensajeProcedimientoCorrecto(String mensaje,String titulo){
       JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
   }
   
   public static Color panelColor(String titulo){       
       Color retorno = JColorChooser.showDialog(null, titulo.toUpperCase(), Color.white);
       return retorno;
   }

    /** Returns an ImageIcon, or null if the path was invalid. */
   public static ImageIcon crearIcono(String path, int ancho, int largo) {
        ImageIcon tmpIcon = new ImageIcon(path);
        if (tmpIcon.getIconWidth() > ancho) {
                tmpIcon = new ImageIcon(tmpIcon.getImage().getScaledInstance(ancho, largo, Image.SCALE_DEFAULT));
        }
        return tmpIcon;
    }

    public static String getExtension(File archivo) {
        String ext = null;
        String s = archivo.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
        }
        return ext;
    }

    
}
