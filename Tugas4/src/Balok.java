/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Malik
 */
public class Balok extends Kubus{
    private double y,z;
    
    public Balok(double x,double y,double z) {
        super(x);
        this.y = y;
        this.z = z;
    }

    public double luas() {
        return 2*((x*y)+(y*z)+(z*x));
    }

    public double volume() {
        return x*y*z;
    }
    
}
