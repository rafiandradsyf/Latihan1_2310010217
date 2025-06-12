package Latihan2;

public class DataDiri {
    String Nama;
    String NPM;
    String Kelas;

    // Konstruktor
    public DataDiri(String nama, String npm, String kelas) {
        this.Nama = nama;
        this.NPM = npm;
        this.Kelas = kelas;
    }

    // Metode untuk menampilkan data
    public void tampilkan() {
        System.out.println("=== Data Diri ===");
        System.out.println("Nama  : " + Nama);
        System.out.println("NPM   : " + NPM);
        System.out.println("Kelas : " + Kelas);
    }
}
