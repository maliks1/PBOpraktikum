/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Malik
 */
public class Kubus{
    double x;
    public Kubus(double x) {
        this.x= x;
    }

    public double luas() {
        return 6*(x*x);
    }

    public double volume() {
        return x*x*x;
    }
}
