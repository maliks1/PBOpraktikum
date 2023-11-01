/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Malik
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kbs = new Kubus(3);
        Balok blk = new Balok(3,4,6);

        System.out.println("Luas Kubus : " + kbs.luas());
        System.out.println("Volume Kubus : " + kbs.volume());
        
        
        System.out.println("Luas Balok : " + blk.luas());
        System.out.println("Volume Balok : " + blk.volume());
    }

}
