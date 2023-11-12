package soalSatu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Malik
 */
import java.util.Scanner;

public class HewanMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis hewan (Kucing/Anjing): ");
        String jenisHewan = scanner.nextLine();

        // Ketika user memasukkan jenis hewan, maka langsung membuat object sesuai jenis hewan kemudian output mamalia jika termasuk kucing atau anjing
        if (jenisHewan.equals("Kucing")) {
            Kucing kucing = new Kucing("Meong");
            System.out.println("Suara hewan: " + kucing.bersuara());
            System.out.println("Kucing merupakan mamalia");
        } else if (jenisHewan.equals("Anjing")) {
            Anjing anjing = new Anjing("Guk Guk");
            System.out.println("Suara hewan:" + anjing.bersuara());
            System.out.println("Anjing merupakan mamalia");
        } else {
            System.out.println("Hewan yang anda masukakan bukan (Kucing/Anjing)");
        }
    }
}
