package soalSatu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Malik
 */
// Kelas dasar Hewan
public class Hewan {

    private String jenisSuara;

    protected Hewan(String jenisSuara) {
        this.jenisSuara = jenisSuara;
    }

    protected String bersuara() {
        return jenisSuara;
    }
}
