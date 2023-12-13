/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas9;

/**
 *
 * @author Malik
 */
public class HitungHari {

    public int hitung(int tahun, int bulan) {
        // Array untuk menyimpan jumlah hari dalam setiap bulan
        int jumlahHari;
        switch (bulan) {
            case 1:  // Januari
            case 3:  // Maret
            case 5:  // Mei
            case 7:  // Juli
            case 8:  // Agustus
            case 10: // Oktober
            case 12: // Desember
                jumlahHari = 31;
                break;
            case 4:  // April
            case 6:  // Juni
            case 9:  // September
            case 11: // November
                jumlahHari = 30;
                break;
            case 2:  // Februari
                jumlahHari = 28;
                break;
            default:
                jumlahHari = -1;  // Nilai default jika bulan tidak valid
                break;
        }
        // Penanganan khusus untuk tahun kabisat (Februari memiliki 29 hari)
        if ((bulan == 2) && ((tahun % 4) == 0)) {
            return 29;
        } else {
            return jumlahHari;
        }
    }
}
