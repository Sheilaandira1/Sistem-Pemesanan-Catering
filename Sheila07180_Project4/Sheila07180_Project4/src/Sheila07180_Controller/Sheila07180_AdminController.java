package Sheila07180_Controller;

import Sheila07180_Entity.Sheila07180_AdminEntity;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Sheila07180_AdminController {
    private int indexlogin = 0;
    public Sheila07180_AdminController(){ 
    }
   
     public void dataAdmin(){
        String nama[] = {"sheila"};
        String password[] = {"1"};
        for(int i=0;i<nama.length;i++){
            Sheila07180_AllObjectModel.adminModel.insertAdmin(new Sheila07180_AdminEntity(nama[i], password[i]));
        }
    }
     
  public int cekdataAkun(String nama, String password) {
        int cekdata = Sheila07180_AllObjectModel.adminModel.cekdata(nama, password);
        return cekdata;
    }
  
    public void login(String nama,String password){
        indexlogin = Sheila07180_AllObjectModel.adminModel.cekdata(nama, password);
    }
    
   public Sheila07180_AdminEntity getData() {
        return Sheila07180_AllObjectModel.adminModel.getAdminEntityArrayList(indexlogin);
    }
      
   
   public int getIndexLogin(){
        return indexlogin;
    }
   
   public ArrayList <Sheila07180_AdminEntity> getAdminEntityArrayList() {
        return Sheila07180_AllObjectModel.adminModel.getCoba();
    }
}

