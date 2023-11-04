
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author malik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();
        
        
        System.out.print("Masukkan prodi Anda: ");
        String prodi = scanner.nextLine();
        
        
        System.out.print("Masukkan semester Anda: ");
        String semester = scanner.nextLine();
        
        
        System.out.print("Masukkan ipk Anda: ");
        String ipk = scanner.nextLine();

        System.out.println("Nama saya, " + nama);
        System.out.println("Prodi, " + prodi);
        System.out.println("Semester, " + semester);
        System.out.println("Target IPK, " + ipk);
        
        scanner.close();
    }
}
