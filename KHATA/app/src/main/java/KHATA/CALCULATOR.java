/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KHATA;

import static KHATA.view_item.j;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Suyash
 */
public class CALCULATOR {
   static int val;
   static float rate;
//  static int d_in,m_in,y_in;
  static int d_out,m_out,y_out;
  static float intrest;
    static long diff;
  
  public static float CALC(item i,int d,int m,int y){
      d_out = d;
      m_out =m;
      y_out =y;
      val = i.value;
      rate = (float)i.rate;
//      SimpleDateFormat myFormat = new SimpleDateFormat("dd mm yyyy");
//      String in,out;
      
//              String in = String.valueOf(i.in_dd)+" "+String.valueOf(i.in_mm)+" "+String.valueOf(i.in_yyyy);
//              String out = String.valueOf(d_out)+" "+String.valueOf(m_out)+" "+String.valueOf(y_out);

     
      Date date1= new Date(i.in_yyyy,i.in_mm,i.in_dd);
      Date date2= new Date(y_out,m_out,d_out);
     
       diff= date2.getTime()-date1.getTime();
     

      float days = (diff/(1000*60*60*24));
      System.out.println(days);
        intrest =   ((val*rate*(days/30))/100);
      
      return intrest;
  }
  
  
}
