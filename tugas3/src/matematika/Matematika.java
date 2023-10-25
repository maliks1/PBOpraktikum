/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author Malik
 */
public class Matematika {

    private int c1, c2, c3;
    private float c4;

    void pertambahan(int a, int b) {
        c1 = a + b;
    }

    void pengurangan(int a, int b) {
        c2 = a - b;
    }

    void perkalian(int a, int b) {
        c3 = a * b;
    }

    void pembagian(float a, float b) {
        if (b == 0) {
            System.out.println("Tidak dapat membagi dengan nol.");
            c4 = 0; // Anda dapat mengganti nilai pengembalian sesuai kebutuhan.
        }
        c4 = a / b;
    }

    int hasilTambah() {
        return c1;
    }

    int hasilKurang() {
        return c2;
    }

    int hasilKali() {
        return c3;
    }

    float hasilBagi() {
        return c4;
    }
}
