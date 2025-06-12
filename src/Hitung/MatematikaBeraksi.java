package Hitung;

public class MatematikaBeraksi {
    public static void main(String[] args){
        // membuat objek
        Matematika rafi = new Matematika(1,7);
        
        System.out.println("Hasil penjumlahan: "+rafi.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+rafi.setPengurangan());
        System.out.println("Hasil perkalian: "+rafi.setPerkalian());
        System.out.println("Hasil pembagian: "+rafi.setPembagian());
    }
            
            
    
}
