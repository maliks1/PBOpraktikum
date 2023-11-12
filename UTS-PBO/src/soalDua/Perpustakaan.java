/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalDua;

/**
 *
 * @author Malik
 */
public class Perpustakaan {

    public static void main(String[] args) {
        Buku novelFantasy = new Novel("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        Buku novelMystery = new Novel("The Da Vinci Code", "Dan Brown", "Mystery");
        Buku novelScience = new Novel("The Martian", "Andy Weir", "Science");

        User user = new User("Balmond");
        Admin admin = new Admin("Malik");

        user.lihatBuku(novelFantasy);
        user.lihatBuku(novelMystery);
        user.lihatBuku(novelScience);

        admin.tambahBuku(new Novel("Pride and Prejudice", "Jane Austen", "Romance"));
        admin.lihatBuku(novelScience);
        admin.hapusBuku(novelMystery);
    }
}
