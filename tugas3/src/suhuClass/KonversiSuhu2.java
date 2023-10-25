/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suhuClass;

/**
 *
 * @author Malik
 */
public class KonversiSuhu2 extends KonversiSuhu {
    private float ream;
    public void fahrenheitToReamur(float a) {
        ream = (float) ((a - 32)*4/9);
    }
    public float fahrToReam() {
        return ream;
    }
}
