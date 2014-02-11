
package prototipo.Utilitario;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.ArrayList;

/* import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
*/
import javax.swing.text.Document;

public class GeneradorPDF {


private Document reporte;
private String[] fechasVac;
private char modo;  
/*    try{
        reporte = new Document();
        file= new FileOutputStream(new File(direcciónDelArchivo));
        niño= sis.getNiñoSel();
        listVacu=sis.getVacunas();
        fechasVac= sis.getFechaPosiblesDosis();
        PdfWriter.getInstance(reporte, file);
        reporte.open();
        if(modo != 'V'){
            reporte.add(new Paragraph("ESTE CARNÉ PERTENECE A: "));
            reporte.add(new Paragraph(" "));
            this.informacionDelNiño();
            reporte.add(new Paragraph(" "));

            if(modo == 'N'){
                this.informacionDelEmbarazo();
                reporte.add(new Paragraph(" "));
            }

            if(modo == 'N'){
                this.informacionDelNacimiento();
                reporte.add(new Paragraph(" "));
            }

            if(modo == 'N'){
                reporte.add(new Paragraph("DATOS DE LOS RESPONSABLES: "));
                if(niño.getMadre()!=null){
                    this.informacionDelResponsable("Madre", niño.getMadre());
                }
                if(niño.getPadre()!=null){
                    this.informacionDelResponsable("Padre", niño.getPadre());
                }
                if(niño.getTutor()!=null){
                    this.informacionDelResponsable("Tutor", niño.getTutor());
                }
            }

            if(modo == 'N' || modo == 'C'){
                reporte.add(new Paragraph("CONTROLES DE SALUD: "));
                reporte.add(new Paragraph(" "));
                this.reporteConsulta();
                reporte.add(new Paragraph(" "));
                reporte.add(new Paragraph(" "));
            }

            if(modo == 'N'){
                reporte.add(new Paragraph("CONSTANCIAS FÍSICAS: "));
                reporte.add(new Paragraph(" "));
                this.reporteConstanciaFisica();
            }

            if(modo == 'N' || modo == 'D'){
                reporte.add(new Paragraph(" "));
                if(modo== 'N') reporte.newPage();
                reporte.add(new Paragraph("CARNÉ DE VACUNAS: "));
                reporte.add(new Paragraph(" "));
                this.reporteVacunas();
            }
            reporte.close();
            file.close();
        }else{
            reporte.add(new Paragraph("REPORTE DE VACUNAS OBLIGATORIAS: "));
            reporte.add(new Paragraph(" "));
            reporte.add(new Paragraph("CARNÉ DE VACUNAS: "));
            reporte.add(new Paragraph(" "));
            this.reporteVacunasSinNiño();

            reporte.close();
            file.close();
        }

    }
    catch(Exception e){
        e.printStackTrace();
    }
};

 void informacionDelNiño(){
   try{
        reporte.add(new Paragraph("Nombre: "+ niño.getNombre()));
        reporte.add(new Paragraph("Apellido(s): "+ niño.getApellidos()));
        reporte.add(new Paragraph("Fecha de nacimiento: "+ niño.getFecNac()));
        reporte.add(new Paragraph("Lugar de nacimiento: "+ niño.getLugarNac()));
        reporte.add(new Paragraph("Cédula de identidad: "+ niño.getcI()));
        reporte.add(new Paragraph("Domicilio: "+ niño.getDomicilio()));
        reporte.add(new Paragraph("Teléfono: "+ niño.getTelefono()));
        reporte.add(new Paragraph("Servicio de Salud: "+ niño.getServSalud()));
        reporte.add(new Paragraph("Nro. de identificación en el servicio: "+ niño.getNroServ()));
   }  
   catch(Exception e){
        e.printStackTrace();
    }
 }
 
  void informacionDelEmbarazo(){
   try{
       if(niño.getEmb()!=null){
           reporte.add(new Paragraph("DATOS DEL EMBARAZO: "));
           reporte.add(new Paragraph(" "));
           Embarazo embarazo= niño.getEmb();
            reporte.add(new Paragraph("Número de embarazo: "+embarazo.getNumEmb()+"    "
                    +"Nro. de controles prenatales: "+embarazo.getNumContr()));
            if(embarazo.getEmbarazo()=='U')
                 reporte.add(new Paragraph("Embarazo único"));
            else 
                reporte.add(new Paragraph("Embarazo múltiple"));
            reporte.add(new Paragraph("Grupo Sanguíneo: "+ embarazo.getGrupoSang()));
            if(embarazo.getParto()=='E')
                reporte.add(new Paragraph("Parto Espontáneo"));
            else{ if(embarazo.getParto()=='F')
                    reporte.add(new Paragraph("Parto por Forceps"));
                 else
                    reporte.add(new Paragraph("Parto por Cesarea"));
            }
            if(embarazo.getLugarParto()=='I')
                reporte.add(new Paragraph("Institucional"));
            else
                reporte.add(new Paragraph("En domicilio/otro"));
            reporte.add(new Paragraph("Patología en embarazo: "+embarazo.getPatologiaEmb()));
            reporte.add(new Paragraph("Patología en parto: "+embarazo.getPatologiaPar()));
            reporte.add(new Paragraph("Patología en el puerperio: "+embarazo.getPatologiaPuer())); 
       }
   }  
   catch(Exception e){
        e.printStackTrace();
    }
 }
 
void informacionDelNacimiento(){
   try{
       if(niño.getNac()!=null){
          Nacimiento nacimiento= niño.getNac(); 
          reporte.add(new Paragraph("DATOS DEL NACIMIENTO: "));
          reporte.add(new Paragraph(" "));
          reporte.add(new Paragraph("Peso: "+nacimiento.getPeso()+"(gr)   Talla: "
                  +nacimiento.getTalla()+"cm.   Perímetro cefálico: "
                  +nacimiento.getPerCef()+"cm."));
          reporte.add(new Paragraph("Edad gestacional: "+nacimiento.getEdadGes()));
          reporte.add(new Paragraph("Screening neonatal "));
          reporte.add(new Paragraph("TSH: "+nacimiento.getTSH()+"mUL/L   Fenilalanina: "+
                    nacimiento.getFenilalanina()+"mg/dL   17-OHP: "+ nacimiento.getOHP()+
                    "ng/dL"));
          reporte.add(new Paragraph("Anomalías y malformaciones: "+nacimiento.getAnomYMalf()));
          reporte.add(new Paragraph("Patología: "+ nacimiento.getPatologia()+"   Peso Egreso: "+
                  nacimiento.getPesoEgr()+"gr"));
           if(nacimiento.getAlimentacion()=='L'){
                reporte.add(new Paragraph("Alimentación al alta Lactancia exclusiva"));
           }
           else{
               if(nacimiento.getAlimentacion()=='A'){
                   reporte.add(new Paragraph("Alimentación al alta Artificial"));
               }
               else{
                   reporte.add(new Paragraph("Alimentación al alta MIXTA"));
               }
           }
           reporte.add(new Paragraph("Fecha de Egreso: "+nacimiento.getFechaEgre().toString()));
          
       }
   }  
   catch(Exception e){
        e.printStackTrace();
    }
 }
  
 
 void informacionDelResponsable(String tipoResp, Persona p){
     try{ 
      reporte.add(new Paragraph(" "));      
      reporte.add(new Paragraph(tipoResp+": "+p.getNombre()+" "+p.getApellidos()));
      reporte.add(new Paragraph("Fecha de nacimiento: "+ p.getFecNac()));
      reporte.add(new Paragraph("Lugar de nacimiento: "+p.getLugarNac()));
      reporte.add(new Paragraph("Cédula de identidad: "+p.getcI()));   
      reporte.add(new Paragraph(" "));   
     }
     catch(Exception e){
        e.printStackTrace();
    }
}

 public void reporteConstanciaFisica(){
    try{     
         String[] titulos={"Fecha","Edad", "Certifico", "Válido Hasta", "Pediatra"};
         ArrayList<ConstanciaFisica> listaConstancia= this.niño.getListaConstanciaFisica();
         float[] medidaCeldas = {0.5f,0.3f, 0.7f,0.7f,0.8f };
         PdfPTable mitablasimple=new PdfPTable(medidaCeldas);
         mitablasimple.setWidthPercentage(100);
         for(int i=0; i<titulos.length;i++){
             mitablasimple.addCell(titulos[i]);
         }
         Iterator<ConstanciaFisica> iter= listaConstancia.iterator();
         while(iter.hasNext()){
             
             ConstanciaFisica constFisica= iter.next();
            
             mitablasimple.addCell(constFisica.getFechaAlta().toString());
             mitablasimple.addCell(constFisica.getEdad()+"");
             if(constFisica.isEsApto())
                mitablasimple.addCell("Si");
             else 
                  mitablasimple.addCell("Si");
             
             mitablasimple.addCell(constFisica.getFechaVence().toString());
             mitablasimple.addCell(constFisica.getNombrePediatra());
         }
          reporte.add(new Paragraph(" "));
          reporte.add(mitablasimple);      
    }
    catch(Exception e){
        e.printStackTrace();
    }

}

 public void reporteConsulta(){    
    try{     
         String[] titulos= {"Fecha", "Peso (gr)","Talla (cm)","PC (cm)","PAD","PAS","Hierro","Observaciones","Próximo Control"};
         ArrayList<Consulta> listaConsulta=this.niño.getConsultas();
         float[] medidaCeldas = {0.5f,0.3f,0.3f,0.3f,0.3f,0.3f,0.3f,0.8f,0.5f };
         PdfPTable mitablasimple=new PdfPTable(medidaCeldas);
         mitablasimple.setWidthPercentage(100);
         for(int i=0; i<titulos.length;i++){
             mitablasimple.addCell(titulos[i]);
         }
         Iterator<Consulta> iter= listaConsulta.iterator();
         while(iter.hasNext()){
             
             Consulta cons= iter.next();
            
             mitablasimple.addCell(cons.getFecha().toString());
             mitablasimple.addCell(cons.getPeso()+"");
             mitablasimple.addCell(cons.getTalla()+"");
             mitablasimple.addCell(cons.getpC()+"");
             mitablasimple.addCell(cons.getpAD()+"");
             mitablasimple.addCell(cons.getpAS()+"");
             mitablasimple.addCell(cons.getHierro()+"");
             mitablasimple.addCell(cons.getObservaciones());
             mitablasimple.addCell(cons.getProxVisita()+"");
         }
           reporte.add(new Paragraph(" "));
           reporte.add(mitablasimple);     
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
 }
    
 public void reporteVacunas(){
        try{     
            String[] titulos={"Vacunas Obligatorias", "Edad en meses", "Edad en años"};
            float [] tamanos= {0.8f, 3.0f, 0.9f};
            PdfPTable tablaFechas=new PdfPTable(tamanos);
             float []  tamanos2= {0.8f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f,0.3f,0.3f,0.3f};
            PdfPTable tablaVacunas=new PdfPTable(tamanos2);
            tablaFechas.setWidthPercentage(100);
            tablaVacunas.setWidthPercentage(100);
            PdfPCell celda =new PdfPCell (new Paragraph(titulos[0]));
            //celda.setColspan(2);
            tablaFechas.addCell(celda);
            celda = new PdfPCell (new Paragraph(titulos[1]));
            //celda.setColspan(11);
            tablaFechas.addCell(celda);
            celda = new PdfPCell (new Paragraph(titulos[2]));
            //celda.setColspan(4);
            tablaFechas.addCell(celda);
            celda = new PdfPCell (new Paragraph(""));
            tablaVacunas.addCell(celda);
            for(int j=0; j<this.fechasVac.length;j++){
                 celda = new PdfPCell (new Paragraph(fechasVac[j]));
                 tablaVacunas.addCell(celda);
            }
            Iterator<Vacuna> iter= this.listVacu.iterator();
            while(iter.hasNext()){
                Vacuna v= iter.next();
                celda = new PdfPCell (new Paragraph(v.getNombre()));
                tablaVacunas.addCell(celda);
                boolean[] posiblesDosis= v.getMeses();
                if(niño.getTablaVacunas().containsKey(v.getNombre())){
                    boolean[] dosisDadas= niño.getTablaVacunas().get(v.getNombre());
                    for(int i=0;i<posiblesDosis.length;i++){
                        if(posiblesDosis[i]){
                            if(dosisDadas[i]){
                                celda = new PdfPCell (new Paragraph("SI"));
                            }
                            else{
                                celda = new PdfPCell (new Paragraph(" "));
                            }
                        }
                        else{
                            celda = new PdfPCell (new Paragraph(" "));
                            celda.setBackgroundColor(BaseColor.GRAY);
                        }
                         tablaVacunas.addCell(celda);
                    }
                }
                else{
                    for(int i=0;i<posiblesDosis.length;i++){
                         celda = new PdfPCell (new Paragraph(" "));
                        if(!posiblesDosis[i]){
                            celda.setBackgroundColor(BaseColor.GRAY);
                        }
                        tablaVacunas.addCell(celda);
                    }
                    
                }
            }
           reporte.add(tablaFechas);
           reporte.add(tablaVacunas);
    }
    catch(Exception e){
        e.printStackTrace();
    }

}

 public void reporteVacunasSinNiño(){
        try{
            String[] titulos={"Vacunas Obligatorias", "Edad en meses", "Edad en años"};
            float [] tamanos= {0.8f, 3.0f, 0.9f};
            PdfPTable tablaFechas=new PdfPTable(tamanos);
             float []  tamanos2= {0.8f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f,0.3f,0.3f,0.3f};
            PdfPTable tablaVacunas=new PdfPTable(tamanos2);
            tablaFechas.setWidthPercentage(100);
            tablaVacunas.setWidthPercentage(100);
            PdfPCell celda =new PdfPCell (new Paragraph(titulos[0]));
            //celda.setColspan(2);
            tablaFechas.addCell(celda);
            celda = new PdfPCell (new Paragraph(titulos[1]));
            //celda.setColspan(11);
            tablaFechas.addCell(celda);
            celda = new PdfPCell (new Paragraph(titulos[2]));
            //celda.setColspan(4);
            tablaFechas.addCell(celda);
            celda = new PdfPCell (new Paragraph(""));
            tablaVacunas.addCell(celda);
            for(int j=0; j<this.fechasVac.length;j++){
                 celda = new PdfPCell (new Paragraph(fechasVac[j]));
                 tablaVacunas.addCell(celda);
            }
            Iterator<Vacuna> iter= this.listVacu.iterator();
            while(iter.hasNext()){
                Vacuna v= iter.next();
                celda = new PdfPCell (new Paragraph(v.getNombre()));
                tablaVacunas.addCell(celda);
                boolean[] posiblesDosis= v.getMeses();
                for(int i=0;i<posiblesDosis.length;i++){
                 celda = new PdfPCell (new Paragraph(" "));
                if(!posiblesDosis[i]){
                    celda.setBackgroundColor(BaseColor.GRAY);
                }
                tablaVacunas.addCell(celda);
                }
            }
           reporte.add(tablaFechas);
           reporte.add(tablaVacunas);
    }
    catch(Exception e){
        e.printStackTrace();
    }

}
*/
}


