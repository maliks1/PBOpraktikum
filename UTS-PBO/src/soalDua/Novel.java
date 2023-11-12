package soalDua;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Malik
 */
public class Novel implements Buku {
    private String judul;
    private String penulis;
    private String genre;

    public Novel(String judul, String penulis, String genre) {
        this.judul = judul;
        this.penulis = penulis;
        this.genre = genre;
    }

    public void informasiBuku() {
        System.out.println("Ensiklopedia: " + getJudul() + " oleh " + getPenulis() + ", Genre: " + getGenre());
    }

    // Getter (Encapsulation)
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getGenre() {
        return genre;
    }
}

