import java.util.Scanner;

public class HargaSepatu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan merek sepatu: ");
        String merek = scanner.nextLine();
        System.out.print("Masukkan kategori sepatu: ");
        String kategori = scanner.nextLine();
        System.out.print("Masukkan ukuran sepatu: ");
        String ukuran = scanner.nextLine();

        int harga = 0;

        // Cek harga berdasarkan merek, kategori, dan ukuran
        if (merek.equalsIgnoreCase("Specs")) {
            if (kategori.equalsIgnoreCase("Slip On")) {
                if (ukuran.equals("36-40")) {
                    harga = 800000;
                } else {
                    if (ukuran.equals("40-44")) {
                        harga = 1200000;
                    }
                }
            }
        } else if (merek.equalsIgnoreCase("910")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran.equals("36-41")) {
                    harga = 1000000;
                } else {
                    if (ukuran.equals("41-44")) {
                        harga = 1800000;
                    }
                }
            }
        } else if (merek.equalsIgnoreCase("Ortus")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran.equals("36-40")) {
                    harga = 750000;
                } else {
                    if (ukuran.equals("40-44")) {
                        harga = 1500000;
                    }
                }
            }
        }

        // Output harga sepatu
        System.out.println("Harga sepatu: " + harga);
        
        
    }
}

