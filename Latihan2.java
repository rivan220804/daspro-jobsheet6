import java.util.Scanner;
/**
 * Latihan2
 */
public class Latihan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double diskon = 0;
        
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya selain kamus dan novel): ");
        String jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = sc.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.10;
            if (jumlahBuku > 2) {
                diskon += 0.02; // Tambahan diskon 2% jika buku yang dibeli lebih dari 2
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon += 0.02; // Tambahan diskon 2% jika buku yang dibeli lebih dari 3
            } else {
                diskon += 0.01; // Tambahan diskon 1% jika buku yang dibeli kurang dari atau sama dengan 3
            }
        } else { 
            if (jumlahBuku > 3) {
                diskon = 5; // Jika pembelian  selain kamus dan novel lebih dari 3 mendapat Diskon 5%
            }
        }
        System.out.println("Total diskon: " + diskon + "%");

    }
}

