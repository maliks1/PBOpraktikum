/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversiSuhu;

/**
 *
 * @author Malik
 */
public class KonversiSuhu {

    private float fahr, ream;

    void celciusToFahrenheit(float a) {
        fahr = (float) ((9.0 / 5.0 * a) + 32);
    }

    float celcToFahr() {
        return fahr;
    }

    void celciusToReamur(float a) {
        ream = (float) (a * (4.0 / 5.0));
    }

    float celcToReam() {
        return ream;
    }
}
