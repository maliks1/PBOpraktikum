/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas7;

/**
 *
 * @author Malik
 */
import java.util.Scanner;

public class Tugas7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pesan untuk memasukkan jumlah jenis barang
        System.out.print("TOKO SERBA ADA\n");
        System.out.print("**************\n");
        System.out.print("Masukkan Item Barang\t: ");
        int jumlahJenisBarang = scanner.nextInt();

        // Mendefinisikan array untuk menyimpan data setiap barang
        String[] kodeBarangArray = new String[jumlahJenisBarang];
        int[] hargaBarangArray = new int[jumlahJenisBarang];
        int[] jumlahBeliArray = new int[jumlahJenisBarang];
        int[] jumlahBayarArray = new int[jumlahJenisBarang];

        // Loop untuk mengisi array dengan data setiap barang
        for (int i = 0; i < jumlahJenisBarang; i++) {
            // Menampilkan pesan untuk memasukkan kode barang
            System.out.print("Data ke " + (i + 1) + "\nMasukkan Kode\t\t: ");
            kodeBarangArray[i] = scanner.next();

            // Menampilkan pesan untuk memasukkan jumlah beli
            System.out.print("Masukkan jumlah Beli\t: ");
            jumlahBeliArray[i] = scanner.nextInt();

            // Menetapkan harga barang berdasarkan kode
            if (kodeBarangArray[i].equals("a001")) {
                hargaBarangArray[i] = 3000;
            } else if (kodeBarangArray[i].equals("a002")) {
                hargaBarangArray[i] = 4000;
            } else if (kodeBarangArray[i].equals("a003")) {
                hargaBarangArray[i] = 5000;
            } else {
                System.out.println("Kode barang tidak dikenali.");
                // Menutup objek Scanner
                scanner.close();
                return; // Keluar dari program jika kode tidak dikenali
            }

            // Menghitung jumlah bayar untuk setiap barang
            jumlahBayarArray[i] = jumlahBeliArray[i] * hargaBarangArray[i];
        }

        // Menampilkan header
        System.out.print("\n\n\nTOKO SERBA ADA\n");
        System.out.print("**************\n");
        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("=============================================================================");

        // Loop untuk menampilkan informasi setiap barang
        for (int i = 0; i < jumlahJenisBarang; i++) {
            System.out.println((i + 1) + "\t" + kodeBarangArray[i] + "\t\t"
                    + getNamaBarang(kodeBarangArray[i]) + "\t\t" + hargaBarangArray[i] + "\t"
                    + jumlahBeliArray[i] + "\t\t" + jumlahBayarArray[i]);
        }

        // Menghitung total bayar
        int totalBayar = 0;
        for (int i = 0; i < jumlahJenisBarang; i++) {
            totalBayar += jumlahBayarArray[i];
        }

        // Menampilkan total bayar
        System.out.println("=============================================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t\t" + totalBayar);
        System.out.println("=============================================================================");
        // Menutup objek Scanner
        scanner.close();
    }

    // Metode untuk mendapatkan nama barang berdasarkan kode
    private static String getNamaBarang(String kodeBarang) {
        switch (kodeBarang) {
            case "a001":
                return "Buku";
            case "a002":
                return "Pensil";
            case "a003":
                return "Pulpen";
            default:
                return "Tidak Diketahui";
        }
    }
}
