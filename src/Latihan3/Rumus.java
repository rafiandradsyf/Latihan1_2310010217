package Latihan3;
//Nama : Muhammad Rafiandra Darsyaf, NPM : 2310010217,

public class Rumus {
    // Atribut bertipe bilangan bulat
    int sisi;
    int panjang;
    int lebar;
    int hasil;
    
   // Method untuk menghitung luas persegi
    public void hitungLuasPersegi() {
        hasil = sisi * sisi;
        System.out.println("Luas Persegi = " + hasil);
    }

    // Method untuk menghitung luas persegi panjang
    public void hitungLuasPersegiPanjang() {
        hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + hasil);
    }

}