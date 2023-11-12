package soalDua;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Malik
 */
// Kelas turunan untuk merepresentasikan pengguna tipe user
class User extends Pengguna {

    public User(String nama) {
        super(nama);
    }

    public void lihatBuku(Buku buku) {
        System.out.println("User " + super.getNama() + " melihat buku: " + buku.getJudul());
    }
}
