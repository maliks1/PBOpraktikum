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
public class No3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();

        // Menghitung IMT
        double imt = beratBadan / (tinggiBadan * tinggiBadan);

        // Menentukan kriteria kegemukan
        String kriteria;
        if (imt < 18.5) {
            kriteria = "Kurus";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        // Output
        System.out.println("IMT: " + String.format("%.2f", imt));
        System.out.println("Kriteria Kegemukan: " + kriteria);

        input.close();
    }
}