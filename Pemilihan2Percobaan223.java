import java.util.Scanner;
/**
 * Pemilihan2Percobaan223
 */
public class Pemilihan2Percobaan223 {

    public static void main(String[] args) {
        Scanner absen = new Scanner(System.in);
        
        double diskon = 0.10 / 100;
        double harga = 0;
        double totalBayar;
        int pilihanMenu;
        String member;
        
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------------");

        System.out.println("masukkan angka dari menu yang dipilih = ");
        int pilihan_menu = absen.nextInt();
        absen.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = absen.nextLine();
        System.out.println("Jenis pembayaran (Qris/nonQris) ? = ");
        pembayaran = absen.nextLine();
        System.out.println("-------------------------");
        
        if (member.equalsIgnoreCase("y")) {// menggunakan equalsIgnoreCase untuk menggunakan string 
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
           
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
        
            //Menghitung total bayar setelah diskon
            totalBayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + totalBayar ); 
        }

            else if (member.equalsIgnoreCase("n")) {//Menggunakan equalsIgnoreCase untuk membandingkan string
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga Ricebowl = " + harga);
                    
                } else if (pilihan_menu == 2) {
                    harga = 3000;
                    System.out.println("Harga Ice Tea = " + harga);

                } else if (pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga Bundling = " + harga);

                } else {
                    System.out.println("Masukkan pilihan menu dengan benar");
                    return; // Mengentikan eksekusi lebih lanjut jika pilihan salah
                }
                    // Potongan harga untuk pembayaran QRIS
                    if (pembayaran.equalsIgnoreCase("QRIS")) {
                    totalBayar -= 1000; // Potongan Rp. 1.000
                    System.out.println("Potongan Rp. 1.000 untuk pembayaran QRIS diterapkan.");

                //menghitung total bayar
                System.out.println("Total bayar = " + harga);

            } else {
                System.out.println("Member tidak valid");
            }
            
    }   
}