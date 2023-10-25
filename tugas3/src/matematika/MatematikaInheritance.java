/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematika;

/**
 *
 * @author Malik
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika mtk = new Matematika();
        Matematika2 mtk2 = new Matematika2();
        
        mtk.pertambahan(23, 8);
        mtk.pengurangan(23, 8);
        mtk.perkalian(23, 8);
        mtk.pembagian(23, 8);
        mtk2.modulus(23, 8);
        
        System.out.println("hasil tambah = " + mtk.hasilTambah());
        System.out.println("hasil kurang= " + mtk.hasilKurang());
        System.out.println("hasil kali = " + mtk.hasilKali());
        System.out.println("hasil bagi = " + mtk.hasilBagi());
        System.out.println("hasil modulus = " + mtk2.hasilModulus());
    }
}
