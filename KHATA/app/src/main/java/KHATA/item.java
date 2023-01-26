/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KHATA;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Suyash
 */
public class item implements Serializable{
    String owner_name;
    String item_id;
      String item_name;  
    int value;
//    Date d_in,d_out;
    int in_dd,in_mm,in_yyyy;
    int out_dd,out_mm,out_yyyy;
       float rate;
     String placed_by;
    String remark;
    boolean abhi_bhi_rakhi_h = true;
        float intrest_paid;
            public String status(boolean b){
              if(b = true){
return "RAKHI H";
}
else{
return "UTH GYI H (DETAILS ARE GIVEN BELOW)";
}
            
            }

    public item(String owner_name, String item_id, String item_name, int value, int in_dd, int in_mm, int in_yyyy, int out_dd, int out_mm, int out_yyyy, float rate, String placed_by, String remark, float intrest_paid) {
        this.owner_name = owner_name;
        this.item_id = item_id;
        this.item_name = item_name;
        this.value = value;
        this.in_dd = in_dd;
        this.in_mm = in_mm;
        this.in_yyyy = in_yyyy;
        this.out_dd = out_dd;
        this.out_mm = out_mm;
        this.out_yyyy = out_yyyy;
        this.rate = rate;
        this.placed_by = placed_by;
        this.remark = remark;
        this.intrest_paid = intrest_paid;
    }
        
        
        
   
    public boolean isAbhi_bhi_rakhi_h() {
        return abhi_bhi_rakhi_h;
    }

    public void setAbhi_bhi_rakhi_h(boolean abhi_bhi_rakhi_h) {
        this.abhi_bhi_rakhi_h = abhi_bhi_rakhi_h;
    }

    

   

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

  

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getPlaced_by() {
        return placed_by;
    }

    public void setPlaced_by(String placed_by) {
        this.placed_by = placed_by;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
   
 
  
    
   
}
