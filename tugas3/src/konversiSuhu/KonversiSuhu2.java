/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversiSuhu;

/**
 *
 * @author Malik
 */
public class KonversiSuhu2 extends KonversiSuhu {
    private float ream;
    void fahrenheitToReamur(float a) {
        ream = (float) ((a - 32)*4/9);
    }
    float fahrToReam() {
        return ream;
    }
}
