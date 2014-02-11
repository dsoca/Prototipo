/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo.Utilitario;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Edicion {

    public static void copiar(String archOriginalNombre, String archCopiaNombre) throws IOException {
        File archOriginal = new File(archOriginalNombre);
        File archCopia = new File(archCopiaNombre);
        //SE CREAN LOS BUFFERS
        BufferedInputStream bufferOriginal = null;
        BufferedOutputStream bufferCopia = null;
        try {
            bufferOriginal = new BufferedInputStream(new FileInputStream(archOriginal));
            bufferCopia = new BufferedOutputStream(new FileOutputStream(archCopia));
            byte[] bufferAux = new byte[9999];// ARRAY PARA CARGAR CADA BYTE DEL ARCHIVO ORIGINAL.
            int bytesRead;
            while ((bytesRead = bufferOriginal.read(bufferAux)) != -1) {
                bufferCopia.write(bufferAux, 0, bytesRead); //SE ESCRIBEN LOS BYTES EN EL ARCHIVO DESTINO.
            }
        } finally {//ASEGURA QUE SE CIERREN LOS BUFFERS
            bufferOriginal.close();
            bufferCopia.flush();
            bufferCopia.close();
        }
    }
/*
    //METODO PARA GUARDAR EL ARCHIVO Sistema.data CON TODOS LOS DATOS DEL SISTEMA.
    public static void guardar(Sistema unSistema) throws IOException {
        ObjectOutputStream obj = null;
        try {
            File arch = new File("src\\Dominio\\Memoria\\Sistema.data");
            BufferedOutputStream buffer = new BufferedOutputStream(new FileOutputStream(arch));
            obj = new ObjectOutputStream(buffer);
            obj.writeObject(unSistema);
        } finally {
            obj.flush();
            obj.close();
        }
    }

    //MÉTODO PARA ABRIR EL ARCHIVO Sistema.data QUE CONTIENE TODOS LOS DATOS DEL SISTEMA.
    public static Sistema abrir() throws ClassNotFoundException, IOException {
        Sistema retorno = new Sistema();
        ObjectInputStream obj = null;
        try {
            File arch = new File("src\\dominio\\memoria\\Sistema.data");
            if (!arch.exists()) {
                guardar(retorno);
            }
            BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(arch));
            obj = new ObjectInputStream(buffer);
            retorno = (Sistema) obj.readObject();
        } finally {
            obj.close();
            return retorno;
        }
    }
*/
        //MÉTODO PARA DETERMINAR LA EXTENSION DE UN ARCHIVO.
    public static String getExtension(File archivo) {
        String ext = null;
        String s = archivo.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 && i < s.length() - 1) {
            ext = s.substring(i + 1).toLowerCase();
        }
        return ext;
    }
}
