/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5;
import java.util.Scanner;
/**
 *
 * @author malik
 */
public class No2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total pembelian Rp. = ");
        double totalPembelian = scanner.nextDouble();

        double potongan = 0;

        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05;
        } else {
            potongan = totalPembelian * 0.20;
        }

        double jumlahDibayarkan = totalPembelian - potongan;

        System.out.println("Besarnya potongan Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + jumlahDibayarkan);
        
        scanner.close();
    }
}