package Sheila07180_View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Sheila07180_Catering {
    
    JFrame LogReg = new JFrame();
    JLabel top,input,delete,labelpassword,labelnama,labelnamapelanggan,labelalamatpelanggan,labelnotelppelanggan,labeljumpespelanggan,
            labelmenu1,labelmenu2,labelharga,labelindex,text,text1;
    JTextField textpassword,textnama,textnamapelanggan,textnamaubah,textalamatpelanggan,textalamatubah,textnotelppelanggan,textnotelpubah,textjumpespelangganubah,textmenu1ubah,
            textmenu2ubah,textmenu2,textharga,texthargaubah,textindex,textjumpespelanggan,textmenu1;
    JButton login,save,hapus,update;
    JTextArea area = new JTextArea();
    JScrollPane scrollarea = new JScrollPane(area);
    private String datapelanggan = "";
    
    public Sheila07180_Catering(){
    
    LogReg.setSize(1200,730);
    LogReg.setLayout(null);
    LogReg.getContentPane().setBackground(Color.pink);
    top = new JLabel("Login Admin");
    top.setBounds(50, 10, 300, 50);
    top.setFont(new Font("Sunday Morning",Font.PLAIN,12));
    LogReg.add(top);
    
    labelnama = new JLabel("Username Admin");
    labelnama.setFont(new Font("Times New Roman",Font.BOLD,15));
    labelnama.setBounds(50, 50, 150, 30);
    LogReg.add(labelnama);
    textnama = new JTextField();
    textnama.setBounds(200, 50, 100, 30);
    LogReg.add(textnama);
    
    labelpassword = new JLabel("Password Admin");
    labelpassword.setFont(new Font("Times New Roman",Font.BOLD,15));
    labelpassword.setBounds(50, 90, 150, 30);
    LogReg.add(labelpassword);
    textpassword = new JPasswordField();
    textpassword.setBounds(200, 90, 100, 30);
    LogReg.add(textpassword);
    
    login = new JButton("LOGIN");
    login.setBounds(200, 130, 100, 30);
    login.setBackground(Color.CYAN);
    LogReg.add(login);
    
    
    input = new JLabel("Input Data Pelanggan");
    input.setBounds(50, 160, 300, 50);
    input.setFont(new Font("Sunday Morning",Font.PLAIN,12));
    LogReg.add(input);    
    
    
    labelnamapelanggan = new JLabel("Nama Pelanggan");
    labelnamapelanggan.setFont(new Font("Times New Roman",Font.BOLD,15));
    labelnamapelanggan.setBounds(50, 210, 150, 30);
    LogReg.add(labelnamapelanggan);
    textnamapelanggan = new JTextField();
    textnamapelanggan.setBounds(200, 210, 100, 30);
    textnamapelanggan.setEditable(false);
    LogReg.add(textnamapelanggan);
    
    labelalamatpelanggan = new JLabel("Alamat Pelanggan");
    labelalamatpelanggan.setFont(new Font("Times New Roman",Font.BOLD,15));
    labelalamatpelanggan.setBounds(50, 250, 150, 30);
    LogReg.add(labelalamatpelanggan);
    textalamatpelanggan = new JTextField();
    textalamatpelanggan.setBounds(200, 250, 100, 30);
    textalamatpelanggan.setEditable(false);
    LogReg.add(textalamatpelanggan);
    
    labelnotelppelanggan = new JLabel("No Telp Pelanggan");
    labelnotelppelanggan.setFont(new Font("Times New Roman",Font.BOLD,15));
    labelnotelppelanggan.setBounds(50, 290, 150, 30);
    LogReg.add(labelnotelppelanggan);
    textnotelppelanggan = new JTextField();
    textnotelppelanggan.setBounds(200, 290, 100, 30);
    textnotelppelanggan.setEditable(false);
    LogReg.add(textnotelppelanggan);
    
    labeljumpespelanggan = new JLabel("Jumlah Pesanan");
    labeljumpespelanggan.setFont(new Font("Times New Roman",Font.BOLD,15));
    labeljumpespelanggan.setBounds(50, 330, 150, 30);
    LogReg.add(labeljumpespelanggan);
    textjumpespelanggan = new JTextField();
    textjumpespelanggan.setBounds(200, 330, 100, 30);
    textjumpespelanggan.setEditable(false);
    LogReg.add(textjumpespelanggan);
    
    labelmenu1 = new JLabel("Menu 1");
    labelmenu1.setFont(new Font("Times New Roman",Font.BOLD,15));
    labelmenu1.setBounds(50, 370, 150, 30);
    LogReg.add(labelmenu1);
    textmenu1 = new JTextField();
    textmenu1.setBounds(200, 370, 100, 30);
    textmenu1.setEditable(false);
    LogReg.add(textmenu1);
    
    labelmenu2 = new JLabel("Menu 2");
    labelmenu2.setFont(new Font("Times New Roman",Font.BOLD,15));
    labelmenu2.setBounds(50, 410, 150, 30);
    LogReg.add(labelmenu2);
    textmenu2 = new JTextField();
    textmenu2.setBounds(200, 410, 100, 30);
    textmenu2.setEditable(false);
    LogReg.add(textmenu2);
    
    labelharga = new JLabel("Harga");
    labelharga.setFont(new Font("Times New Roman",Font.BOLD,15));
    labelharga.setBounds(50, 450, 150, 30);
    LogReg.add(labelharga);
    textharga = new JTextField();
    textharga.setBounds(200, 450, 100, 30);
    textharga.setEditable(false);
    LogReg.add(textharga);

    
    save = new JButton("Simpan");
    save.setBounds(200, 500, 100, 30);
    save.setBackground(Color.CYAN);
    save.setEnabled(false);
    LogReg.add(save);
    
    top = new JLabel("Data Pelanggan");
    top.setBounds(350, 10, 300, 50);
    top.setFont(new Font("Sunday Morning",Font.PLAIN,12));
    LogReg.add(top);

    scrollarea.setBounds(350,50,450,300);
    area.setFont(new Font("Times New Roman",Font.PLAIN,15));
    area.setEditable(false);
    LogReg.add(scrollarea);

    delete = new JLabel("Hapus Data Pelanggan");
    delete.setBounds(350, 370, 300, 50);
    delete.setFont(new Font("Sunday Morning",Font.PLAIN,12));
    LogReg.add(delete);   
    
    labelindex = new JLabel("Index Pelanggan");
    labelindex.setFont(new Font("Times New Roman",Font.BOLD,15));
    labelindex.setBounds(350, 420, 150, 30);
    LogReg.add(labelindex);
    textindex = new JTextField();
    textindex.setBounds(500, 420, 100, 30);
    textindex.setEditable(false);
    LogReg.add(textindex);
    
    hapus = new JButton("Hapus Data");
    hapus.setBounds(500, 470, 130, 30);
    hapus.setBackground(Color.CYAN);
    hapus.setEnabled(false);
    LogReg.add(hapus);
    
    
    input = new JLabel("Update Data Pelanggan");
    input.setBounds(890, 10, 300, 50);
    input.setFont(new Font("Sunday Morning",Font.PLAIN,12));
    LogReg.add(input);    
    
    
    labelnamapelanggan = new JLabel("Nama Pelanggan Yang Ingin Di Update");
    labelnamapelanggan.setFont(new Font("Times New Roman",Font.BOLD,15));
    labelnamapelanggan.setBounds(887, 50, 300, 30);
    LogReg.add(labelnamapelanggan);
    textnamaubah = new JTextField();
    textnamaubah.setBounds(900, 90, 220, 30);
    textnamaubah.setEditable(false);
    LogReg.add(textnamaubah);
    
    labelalamatpelanggan = new JLabel("Alamat Pelanggan");
    labelalamatpelanggan.setFont(new Font("Times New Roman",Font.BOLD,15));
    labelalamatpelanggan.setBounds(887, 140, 150, 30);
    LogReg.add(labelalamatpelanggan);
    textalamatubah = new JTextField();
    textalamatubah.setBounds(1015, 140, 100, 30);
    textalamatubah.setEditable(false);
    LogReg.add(textalamatubah);
    
    labelnotelppelanggan = new JLabel("No Telp Pelanggan");
    labelnotelppelanggan.setFont(new Font("Times New Roman",Font.BOLD,15));
    labelnotelppelanggan.setBounds(887, 180, 150, 30);
    LogReg.add(labelnotelppelanggan);
    textnotelpubah = new JTextField();
    textnotelpubah.setBounds(1015, 180, 100, 30);
    textnotelpubah.setEditable(false);
    LogReg.add(textnotelpubah);
    
    labeljumpespelanggan = new JLabel("Jumlah Pesanan");
    labeljumpespelanggan.setFont(new Font("Times New Roman",Font.BOLD,15));
    labeljumpespelanggan.setBounds(887, 230, 150, 30);
    LogReg.add(labeljumpespelanggan);
    textjumpespelangganubah = new JTextField();
    textjumpespelangganubah.setBounds(1015, 230, 100, 30);
    textjumpespelangganubah.setEditable(false);
    LogReg.add(textjumpespelangganubah);
    
    labelmenu1 = new JLabel("Menu 1");
    labelmenu1.setFont(new Font("Times New Roman",Font.BOLD,15));
    labelmenu1.setBounds(887, 280, 150, 30);
    LogReg.add(labelmenu1);
    textmenu1ubah = new JTextField();
    textmenu1ubah.setBounds(1015, 280, 100, 30);
    textmenu1ubah.setEditable(false);
    LogReg.add(textmenu1ubah);
    
    labelmenu2 = new JLabel("Menu 2");
    labelmenu2.setFont(new Font("Times New Roman",Font.BOLD,15));
    labelmenu2.setBounds(887, 330, 150, 30);
    LogReg.add(labelmenu2);
    textmenu2ubah = new JTextField();
    textmenu2ubah.setBounds(1015, 330, 100, 30);
    textmenu2ubah.setEditable(false);
    LogReg.add(textmenu2ubah);
    
    labelharga = new JLabel("Harga");
    labelharga.setFont(new Font("Times New Roman",Font.BOLD,15));
    labelharga.setBounds(887, 380, 150, 30);
    LogReg.add(labelharga);
    texthargaubah = new JTextField();
    texthargaubah.setBounds(1015, 380, 100, 30);
    texthargaubah.setEditable(false);
    LogReg.add(texthargaubah);
    
    update = new JButton("Ubah");
    update.setBounds(1016, 430, 100, 30);
    update.setBackground(Color.CYAN);
    update.setEnabled(false);
    LogReg.add(update);
    
    text = new JLabel(" CATERING SARAH !");
    text.setBounds(450, 550, 700, 90);
    text.setFont(new Font("Sunday Morning",Font.PLAIN,50));
    LogReg.add(text);
    
    text1 = new JLabel(" Jalan Khairil Anwar No 43, Trenggalek");
    text1.setBounds(460, 620, 700, 50);
    text1.setFont(new Font("Arial",Font.PLAIN,20));
    LogReg.add(text1);
    
    
    LogReg.setVisible(true);
    LogReg.setLocationRelativeTo(null);
    LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    login.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            try{
                Sheila07180_AllObjctrl.admin.dataAdmin();
                Sheila07180_AllObjctrl.admin.login(textnama.getText(), textpassword.getText());
                save.setEnabled(true);                    
                JOptionPane.showMessageDialog(null, "Selamat datang "+Sheila07180_AllObjctrl.admin.getAdminEntityArrayList().get(Sheila07180_AllObjctrl.admin.getIndexLogin()).getNama(),"information", JOptionPane.INFORMATION_MESSAGE);
                login.setEnabled(false);
                textnama.setEditable(false);
                textpassword.setEditable(false);
                textnamapelanggan.setEditable(true);
                textalamatpelanggan.setEditable(true);
                textnotelppelanggan.setEditable(true);
                textjumpespelanggan.setEditable(true);
                textmenu1.setEditable(true);
                textmenu2.setEditable(true);
                textharga.setEditable(true);        
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Username atau Password salah", " PERINGATAN!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    });
    
    save.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            String nama = textnamapelanggan.getText();
            String alamat = textalamatpelanggan.getText();
            String notelp = textnotelppelanggan.getText();
            int jumlahpes = Integer.parseInt(textjumpespelanggan.getText());
            String menu1 = textmenu1.getText();
            String menu2 = textmenu2.getText();
            int harga = Integer.parseInt(textharga.getText());
            int totalharga = harga*jumlahpes;
            Sheila07180_AllObjctrl.pelanggan.insert(nama, alamat, notelp, jumlahpes,totalharga);
            Sheila07180_AllObjctrl.menumakanan.insert(menu1, menu2, harga);
            textnamaubah.setEditable(true);  
            textalamatubah.setEditable(true);  
            textnotelpubah.setEditable(true);  
            textjumpespelangganubah.setEditable(true);  
            textmenu1ubah.setEditable(true);  
            textmenu2ubah.setEditable(true);  
            texthargaubah.setEditable(true);  
            textindex.setEditable(true);  
            hapus.setEnabled(true);
            update.setEnabled(true);
            JOptionPane.showMessageDialog(null,"Data "+nama+" telah Ditambahkan ","INFORMATION", JOptionPane. INFORMATION_MESSAGE);     
            area.setText("");
            datapelanggan="";
            view();
            area.setText(datapelanggan);
            pesanankosong();
            }
        });
    
        hapus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                    int index = Integer.parseInt(textindex.getText());
                    Sheila07180_AllObjctrl.pelanggan.delete(index);
                    JOptionPane.showMessageDialog(null,"Data berhasil dihapus","INFORMATION", JOptionPane. INFORMATION_MESSAGE);
                    area.setText("");
                    datapelanggan="";
                    view();
                    area.setText(datapelanggan);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "index tidak ada", " PERINGATAN!", JOptionPane.INFORMATION_MESSAGE);
                }
                textindex.setText(null);
                if(Sheila07180_AllObjctrl.pelanggan.looping()==0){
                    JOptionPane.showMessageDialog(null,"Data sudah kosong","INFORMATION", JOptionPane. INFORMATION_MESSAGE);
                    textindex.setEditable(false);
                    textnamaubah.setEditable(false);
                    textalamatubah.setEditable(false);
                    textnotelpubah.setEditable(false);
                    textjumpespelangganubah.setEditable(false);
                    textmenu1ubah.setEditable(false);
                    textmenu2ubah.setEditable(false);
                    texthargaubah.setEditable(false);
                    hapus.setEnabled(false);
                }
            }
        });  
        
        
        update.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                    String nama = textnamaubah.getText();
                    int cekdata = Sheila07180_AllObjctrl.pelanggan.cekDataPelanggan(nama);
                    String Newalamat = textalamatubah.getText();
                    String Newnotelp = textnotelpubah.getText();
                    int Newjumlahpes = Integer.parseInt(textjumpespelangganubah.getText());
                    String Newmenu1 = textmenu1ubah.getText();
                    String Newmenu2 = textmenu2ubah.getText();
                    int Newharga = Integer.parseInt(texthargaubah.getText());
                    int Newtotalharga = Newharga*Newjumlahpes;
                    Sheila07180_AllObjctrl.pelanggan.getData(cekdata).setAlamat(Newalamat);
                    Sheila07180_AllObjctrl.pelanggan.getData(cekdata).setNotelp(Newnotelp); 
                    Sheila07180_AllObjctrl.pelanggan.getData(cekdata).setJumlahpes(Newjumlahpes);
                    Sheila07180_AllObjctrl.menumakanan.getData(cekdata).setIsi1(Newmenu1);
                    Sheila07180_AllObjctrl.menumakanan.getData(cekdata).setIsi2(Newmenu2);
                    Sheila07180_AllObjctrl.menumakanan.getData(cekdata).setHarga(Newharga);
                    JOptionPane.showMessageDialog(null, "Berhasil Update", " INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                    area.setText("");
                    datapelanggan="";
                    view();
                    area.setText(datapelanggan);
                    pesanankosong();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Gagal Update", " PERINGATAN!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
    
    void pesanankosong(){
        textnamapelanggan.setText(null);
        textalamatpelanggan.setText(null);
        textnotelppelanggan.setText(null);
        textjumpespelanggan.setText(null);
        textmenu1.setText(null);
        textmenu2.setText(null);
        textharga.setText(null);
        textjumpespelangganubah.setText(null);
        textnamaubah.setText(null);
        textalamatubah.setText(null);
        textnotelpubah.setText(null);
        textmenu1ubah.setText(null);
        textmenu2ubah.setText(null);
        texthargaubah.setText(null);
        
        
        
    }
    
    public void view(){
        for(int i=0;i<Sheila07180_AllObjctrl.pelanggan.looping();i++){
         datapelanggan+= "\n"+
                 "\n\t\tindex : "+i+"\n\t\tNama : "+Sheila07180_AllObjctrl.pelanggan.getData(i).getNama()+
                 "\n\t\tAlamat : "+Sheila07180_AllObjctrl.pelanggan.getData(i).getAlamat()+
                 "\n\t\tNo Telpon : "+Sheila07180_AllObjctrl.pelanggan.getData(i).getNotelp()+
                 "\n\t\tJumlah Pesanan : "+Sheila07180_AllObjctrl.pelanggan.getData(i).getJumlahpes()+
                 "\n\t\tMenu Isian 1 : "+Sheila07180_AllObjctrl.menumakanan.getData(i).getIsi1()+
                 "\n\t\tMenu Isian 2 : "+Sheila07180_AllObjctrl.menumakanan.getData(i).getIsi2()+
                 "\n\t\tHarga Pesanan : "+Sheila07180_AllObjctrl.menumakanan.getData(i).getHarga()+
                 "\n\t\tTotal Harga : "+Sheila07180_AllObjctrl.pelanggan.getData(i).getTotalharga()+"\n";
        }
    }
}
