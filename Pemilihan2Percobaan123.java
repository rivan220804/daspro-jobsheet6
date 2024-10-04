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
            // Tahun dapat dibagi 4
            if ((tahun % 100) == 0) {
                // Tahun dapat dibagi 100
                if ((tahun % 400) == 0) {
                    // Tahun dapat dibagi 400
                    System.out.println("Tahun Kabisat");
                }
                // Jika tidak dapat dibagi 400
                if ((tahun % 400) != 0) {
                    System.out.println("Bukan Tahun Kabisat");
                }
            }
            // Jika tidak dapat dibagi 100, berarti kabisat
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
            }
        }
        // Jika tidak dapat dibagi 4
        if ((tahun % 4) != 0) {
            System.out.println("Bukan Tahun Kabisat");
        }

    }
}