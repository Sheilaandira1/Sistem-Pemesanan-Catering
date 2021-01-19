package Sheila07180_Model;

import Sheila07180_Entity.Sheila07180_AdminEntity;
import Sheila07180_Entity.Sheila07180_PelangganEntity;
import java.util.ArrayList;

public class Sheila07180_PelangganModel{
    private ArrayList <Sheila07180_PelangganEntity> pelangganEntityArrayList; 
    
    public Sheila07180_PelangganModel(){
        pelangganEntityArrayList = new ArrayList<Sheila07180_PelangganEntity>();
    }
    public void insertPelanggan(Sheila07180_PelangganEntity pelanggan){
        pelangganEntityArrayList.add(pelanggan);
    }  
    public Sheila07180_PelangganEntity getPelangganEntityArrayList(int index){
        return pelangganEntityArrayList.get(index);
    }

    public int cekData(String nama){
        int loop = 0;
        while ( !pelangganEntityArrayList.get(loop).getNama().equals(nama)){
            loop++;
        }
        return loop;
    }
    public void delete(int index){
        pelangganEntityArrayList.remove(index);
    }
    
    public int looping(int index){
        int size = pelangganEntityArrayList.size();
        return size;
    }
  
}
