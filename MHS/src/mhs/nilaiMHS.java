/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mhs;

/**
 *
 * @author Malik
 */
public class nilaiMHS {
    String NIM = "2210631170029";
    String Nama = "Malik Syafi'i";
    short NilaiAbsen = 90;
    short NilaiTugas = 80;
    short NilaiUTS = 85;
    short NilaiUAS = 85;

    void CetakNilai() {
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + Nama);
        System.out.println("Nilai Absen[10%] : " + NilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + NilaiTugas);
        System.out.println("Nilai UTS [30%] : " + NilaiUTS);
        System.out.println("Nilai UAS [40%] : " + NilaiUAS);
        double nilaiAkhir = (NilaiAbsen * 0.10) + (NilaiTugas * 0.20) + (NilaiUTS * 0.30) + (NilaiUAS * 0.40);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
}
}
