/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mhs;

/**
 *
 * @author Malik
 */
public class MHS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek Mahasiswa
        dataMHS data = new dataMHS();
        nilaiMHS nilai = new nilaiMHS();

        // Memanggil method membaca()
        data.membaca();

        // Memanggil method nyontek()
        data.nyontek();

        // Memanggil method modifikasi()
        data.modifikasi();

        // Memanggil method CetakNilai()
        nilai.CetakNilai();
    }
    
}
