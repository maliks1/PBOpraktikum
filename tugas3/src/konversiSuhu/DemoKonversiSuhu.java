/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversiSuhu;

/**
 *
 * @author Malik
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KonversiSuhu konf1 = new KonversiSuhu();
        KonversiSuhu2 konf2 = new KonversiSuhu2();
        
        konf1.celciusToFahrenheit(100);
        konf1.celciusToReamur(100);
        konf2.fahrenheitToReamur(100);
        
        System.out.println("hasil "+konf1.celcToFahr());
        System.out.println("hasil "+konf1.celcToReam());
        System.out.println("hasil "+konf2.fahrToReam());
    }
    
}
