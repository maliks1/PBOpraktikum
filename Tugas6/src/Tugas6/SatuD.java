/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Malik
 */
import java.util.Scanner;

public class SatuD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah anak ayam: ");
        int jumlahAnakAyam = scanner.nextInt();

        int iterasi = 0;

        while (iterasi < jumlahAnakAyam) {
            System.out.println("Anak ayam turunlah " + (jumlahAnakAyam - iterasi));
            if (iterasi < jumlahAnakAyam - 1) {
                System.out.println("Pergi satu, tinggallah " + (jumlahAnakAyam - iterasi - 1));
            } else {
                System.out.println("Habis sudah anak ayam");
            }
            iterasi++;
        }

    }
}
