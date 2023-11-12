package soalDua;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Malik
 */
// Kelas turunan untuk merepresentasikan pengguna tipe admin
class Admin extends Pengguna {

    public Admin(String nama) {
        super(nama);
    }

    public void tambahBuku(Buku buku) {
        System.out.println("Admin " + super.getNama() + " menambahkan buku: " + buku.getJudul());
    }

    public void lihatBuku(Buku buku) {
        System.out.println("Admin " + super.getNama() + " melihat buku: " + buku.getJudul());
    }

    public void hapusBuku(Buku buku) {
        System.out.println("Admin " + super.getNama() + " menghapus buku: " + buku.getJudul());
    }
}
