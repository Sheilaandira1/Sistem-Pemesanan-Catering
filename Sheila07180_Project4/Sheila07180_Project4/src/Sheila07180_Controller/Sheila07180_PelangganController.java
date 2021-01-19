package Sheila07180_Controller;

import Sheila07180_Entity.Sheila07180_PelangganEntity;
import javax.swing.table.DefaultTableModel;

public class Sheila07180_PelangganController {
    private int index=0;

    public Sheila07180_PelangganController() {
    }
    
    public Sheila07180_PelangganEntity getData(int index){
        return Sheila07180_AllObjectModel.pelangganModel.getPelangganEntityArrayList(index);
    }
    
    public int cekDataPelanggan(String nama){
        int cek = Sheila07180_AllObjectModel.pelangganModel.cekData(nama);
        return cek;
    } 
    
    public int looping(){
        return Sheila07180_AllObjectModel.pelangganModel.looping(index);
    }

    
   public void insert(String nama,String alamat,String notelp,int jumlahpes,int totalharga) {
        Sheila07180_PelangganEntity pelanggan = new Sheila07180_PelangganEntity();
        pelanggan.setNama(nama);
        pelanggan.setAlamat(alamat);
        pelanggan.setNotelp(notelp);
        pelanggan.setJumlahpes(jumlahpes);
        pelanggan.setTotalharga(totalharga);
        Sheila07180_AllObjectModel.pelangganModel.insertPelanggan(pelanggan);
    }
   
   public void delete(int idx){
       Sheila07180_AllObjectModel.pelangganModel.delete(idx);
   }
   
}
