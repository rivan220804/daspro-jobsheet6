import java.util.Scanner;

/**
 * Pemilihan2Percobaan123
 */
public class Pemilihan2Percobaan123 {

    public static void main(String[] args) {
        Scanner absen = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = absen.nextInt();

        // Memeriksa tahun kabisat
        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            } else {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }

        
    }
}

