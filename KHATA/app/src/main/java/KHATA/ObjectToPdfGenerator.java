/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KHATA;

/**
 *
 * @author Suyash
 */
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ObjectToPdfGenerator {
    public static void generatePdfForObject(Object object, String filename) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filename));
            document.open();
            item i = (item)object;
            
            document.add(new Paragraph("PLACED BY :  "+i.placed_by)); 
            document.close();
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
