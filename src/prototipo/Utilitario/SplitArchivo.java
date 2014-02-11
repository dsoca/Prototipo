/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo.Utilitario;

import java.io.*;
/**
 *
 * @author Usuario
 */
public class SplitArchivo {
    public static void main(String[] args) {
        String encoding = "UTF-8";
        int maxlines = 100;
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("/bigfile.txt"), encoding));
            int count = 0;
            for (String line; (line = reader.readLine()) != null;) {
                if (count++ % maxlines == 0) {
                    if(writer!=null)
                        writer.close();
                    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/smallfile" + (count / maxlines) + ".txt"), encoding));
                }
                writer.write(line);
                writer.newLine();
            }
         
        }catch (Exception e) {
        } finally {
            try {
                if(writer!=null)
                    writer.close();
                if(reader!=null)
                    reader.close();
            }catch(Exception e){}
        }
    }
}
