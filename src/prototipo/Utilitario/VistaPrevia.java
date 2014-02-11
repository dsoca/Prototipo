/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo.Utilitario;

import javax.swing.*;
import java.beans.*;
import java.awt.*;
import java.io.File;


public class VistaPrevia extends JComponent implements PropertyChangeListener {
    ImageIcon miniatura = null;
    File arch = null;

    public VistaPrevia(JFileChooser fc) {
        setPreferredSize(new Dimension(100, 125));
        fc.addPropertyChangeListener(this);
    }

    public void loadImage() {
        if (arch == null) {
            miniatura = null;
            return;
        }
        
        //No se utiliza createImageIcon que es un wrapper de getResource()
        //porque la imagen que se va a cargar probablemente no
        //pertenezca a los recursos del programa
        else
        miniatura = Utilitario.crearIcono(arch.getPath(), 100, -1);
    }

    public void propertyChange(PropertyChangeEvent e) {
        boolean update = false;
        String prop = e.getPropertyName();

        //Si se cambia el directorio, no mostrar imagen.
        if (JFileChooser.DIRECTORY_CHANGED_PROPERTY.equals(prop)) {
            arch = null;
            update = true;

        //Si un archivo es seleccionado, averiguar de que tipo es.
        } else if (JFileChooser.SELECTED_FILE_CHANGED_PROPERTY.equals(prop)) {
            arch = (File) e.getNewValue();
            update = true;
        }

        //Actualizar la vista previa correspondiente.
        if (update) {
            miniatura = null;
            if (isShowing()) {
                loadImage();
                repaint();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (miniatura == null) {
            loadImage();
        }
        if (miniatura != null) {
            int x = getWidth()/2 - miniatura.getIconWidth()/2;
            int y = getHeight()/2 - miniatura.getIconHeight()/2;

            if (y < 0) {
                y = 0;
            }

            if (x < 5) {
                x = 5;
            }
            miniatura.paintIcon(this, g, x, y);
        }
    }
}
