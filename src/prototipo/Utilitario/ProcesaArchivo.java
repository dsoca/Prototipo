/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo.Utilitario;

/**
 *
 * @author Usuario
 */

import java.sql.*;
import java.util.Calendar;


public class ProcesaArchivo {
       
   //JDBC_DRIVER=oracle.jdbc.driver.OracleDriver
   //DB_URL=jdbc:oracle:thin:@10.12.1.12:1521:orcl
   public static void UpdateBatch(BigFile bigfile) throws SQLException {              
       /*
        long i1 = 0;
        long i2 = 0;        
        Calendar c = Calendar.getInstance();
        //long aux3 = c.getTimeInMillis();
        for (String line: bigfile) {
            i2++; 
            if(line.startsWith("1")){                               
                String aux = " ";
                String [] textos = line.split("\\|");                
                String texto = "";
                int iparm = 1;
                for(; iparm <= textos.length; iparm++){
                    texto = textos[iparm-1].trim();                    
                    if((iparm > 0 && iparm < 3) || (iparm > 8 && iparm < 15)){ // Campos Numéricos
                        if(iparm ==2) {                            
                            c.set(Integer.parseInt(texto.substring(0,4)), Integer.parseInt(texto.substring(4,6))-1, Integer.parseInt(texto.substring(6,8)), 0, 0, 0);                                                        
                            long aux3 = c.getTimeInMillis();
                            Timestamp  aux2 = new Timestamp(aux3);
                            pstmt1.setTimestamp(iparm, aux2);
                            //pstmt1.setTimestamp(iparm, new Timestamp(Integer.parseInt(texto)));
                        }else if(iparm ==1){
                            aux = texto.substring(1, 11);
                            pstmt1.setInt(iparm,Integer.parseInt(aux));                            
                        }else{
                            if(texto.trim().equals("")){texto = "0";}
                            else{
                                if(iparm > 9)                                    
                                    pstmt1.setDouble(iparm,Double.parseDouble(texto)/100);
                                else                                    
                                    pstmt1.setInt(iparm,Integer.parseInt(texto));
                            }                                   
                        }
                    }else{ // Character   
                        if(!texto.equals(""))
                            pstmt1.setString(iparm,texto);
                        else
                            texto = " ";
                            pstmt1.setString(iparm,texto);
                    }                                      
                }                
                if(iparm <= 19){
                    for(;iparm < 20; iparm++)
                    {   
                        pstmt1.setString(iparm," ");
                    }
                }
                int updateCount = pstmt1.executeUpdate();
            }else{                               
                pstmt2.setInt(1,Integer.parseInt(line.substring(1, 11)));                                
                pstmt2.setInt(2,Integer.parseInt(line.substring(11, 16)));                
                pstmt2.setString(3,line.substring(16, 18));
                pstmt2.setLong(4,Long.parseLong(line.substring(18, 32)));                
                pstmt2.setInt(5,Integer.parseInt(line.substring(32, 36)));                
                pstmt2.setFloat(6,Float.parseFloat(line.substring(36, 54))/100);
                pstmt2.setString(7,line.substring(54, 55));                
                int updateCount = pstmt2.executeUpdate();                
            }            
            if (i2 % executeBatch == 0) {
                //System.out.println("Commit: " + i2);
                con1.commit();
                con2.commit();
            }
            
        }   
        if (i2 % executeBatch != 0) {
                //System.out.println("Commit: " + i2);
                con1.commit();
                con2.commit();
        }
        //System.out.printf("Inserting file1 " + i1 + " file2 " + i2 + " rows took %4.2f seconds\n",  
        //                (System.currentTimeMillis() - start) / 1000f);
        pstmt1.close();
        con1.close();
        pstmt2.close();
        con2.close();
    */
   }
}