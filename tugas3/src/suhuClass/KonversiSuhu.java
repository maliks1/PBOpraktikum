/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suhuClass;

/**
 *
 * @author Malik
 */
public class KonversiSuhu {

    private float fahr, ream;

    public void celciusToFahrenheit(float a) {
        fahr = (float) ((9.0 / 5.0 * a) + 32);
    }

    public float celcToFahr() {
        return fahr;
    }

    public void celciusToReamur(float a) {
        ream = (float) (a * (4.0 / 5.0));
    }

    public float celcToReam() {
        return ream;
    }
}
