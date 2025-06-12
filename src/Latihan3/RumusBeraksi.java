package Latihan3;

// Nama : Muhammad Rafiandra Darsyaf, NPM: 2310010217, Kelas: 4C

public class RumusBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class Rumus
        Rumus rafi;
        rafi = new Rumus(5, 7, 4, 0); // sisi = 5, panjang = 7, lebar = 4

        // Memanggil method untuk menghitung luas persegi
        rafi.hitungLuasPersegi();

        // Memanggil method untuk menghitung luas persegi panjang
        rafi.hitungLuasPersegiPanjang();
    }
}


