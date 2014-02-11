/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo.Utilitario;

/**
 *
 * @author Usuario
 */
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author MBegerez
 */
public class GeneradorArchivo {
    public static void main(String args[]){
        try {
            FileWriter fstream = new FileWriter("c:\\Temp\\out1.txt");
            BufferedWriter out = new BufferedWriter(fstream);
            for(int i=0;i<=2000;i++){
                out.write("10015355310|20120131| ||1|29286173|1| |002|10000|00000|00000|00000|00000||FLORES|MOTTA|JULIA|AURELIA     \n");
                out.write("2004827655500142118113020000000021710000000000002767514\n");
            }
            //Close the output stream
            out.close();
        }catch(Exception e){
            
        }
    }
}
