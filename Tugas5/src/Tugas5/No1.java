/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5;
import java.util.Scanner;
/**
 *
 * @author Malik
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("NPM : ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa : ");
        String namaMahasiswa = input.nextLine();
        System.out.print("Nilai Kehadiran : ");
        double nilaiKehadiran = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS : ");
        double nilaiUts = input.nextDouble();
        System.out.print("Nilai UAS : ");
        double nilaiUas = input.nextDouble();

        // Menghitung Nilai Akhir
        double nilaiAkhir = (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUts) + (0.40 * nilaiUas);

        // Menghitung Grade dan Keterangan
        String grade, keterangan;
        if (nilaiAkhir >= 76) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46) {
            grade = "D";
            keterangan = "KURANG";
        } else {
            grade = "E";
            keterangan = "KURANG SEKALI";
        }

        // Output
        System.out.println("NPMMahasiswa : " + npm);
        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.println("Nilai Rata-rata : " + String.format("%.2f", nilaiAkhir));
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);

        input.close();
    }
}