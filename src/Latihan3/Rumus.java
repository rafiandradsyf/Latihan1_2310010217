package Latihan3;
//Nama : Muhammad Rafiandra Darsyaf, NPM : 2310010217,

public class Rumus {
    // Atribut bertipe bilangan bulat
    int sisi;
    int panjang;
    int lebar;
    int hasil;
    
   public void hitungLuasPersegi() {
        hasil = sisi * sisi;
        
        System.out.println("Luas Persegi =" +hasil);
    }
     public void hitungLuasPersegiPanjang() {
        hasil = panjang * lebar;
        
        System.out.println("Luas Persegi Panjang =" +hasil);
     }
     public int getHasil() {
        return hasil;
    }

    public Rumus(int sisi, int panjang, int lebar, int hasil) {
        this.sisi = sisi;
        this.panjang = panjang;
        this.lebar = lebar;
        this.hasil = hasil;
    }
     
     
}

