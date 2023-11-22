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

public class Dua {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n (>=10): ");
        int n = scanner.nextInt();

        if (n <= 10) {
            // Membuat tabel perkalian n x n
            System.out.println("Tabel Perkalian " + n + " x " + n + ":");

            // Mencetak baris pertama dengan angka 1 hingga n
            System.out.print("    ");
            for (int i = 1; i <= n; i++) {
                System.out.printf("%-4d", i);
            }
            System.out.println();

            // Mencetak sisa baris dengan hasil perkalian
            for (int i = 1; i <= n; i++) {
                System.out.printf("%-4d", i);
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%-4d", i * j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Masukkan nilai n kurang dari atau sama dengan 10.");
        }
    }
}
