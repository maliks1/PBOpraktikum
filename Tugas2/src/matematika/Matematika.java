
package matematika;

public class Matematika implements OperasiMatematika {
    @Override
    public int pertambahan(int a, int b) {
        return a + b;
    }
    @Override
    public int pengurangan(int a, int b) {
        return a - b;
    }
    @Override
    public int perkalian(int a, int b) {
        return a * b;
    }
    @Override
    public int pembagian(int a, int b) {
        if (b == 0) {
            System.out.println("Tidak dapat membagi dengan nol.");
            return 0; // Anda dapat mengganti nilai pengembalian sesuai kebutuhan.
        }
        return a / b;
    }
    
    void tambah(int a, int b){
        System.out.println("Pertambahan : " + a + " + " + b + " = " + pertambahan(a, b));
    }
    void kurang(int a, int b){
        System.out.println("Pengurangan : " + a + " - " + b + " = " + pengurangan(a, b));
    }
    void kali(int a, int b){
        System.out.println("Perkalian : " + a + " x " + b + " = " + perkalian(a, b));
    }
    void bagi(int a, int b){
        System.out.println("Pembagian : " + a + " / " + b + " = " + pembagian(a, b));
    }
}

   
   