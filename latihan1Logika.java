import java.util.Scanner;
/**
 * latiahan1Logika
 */
public class latihan1Logika {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = sc.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = sc.nextInt();

        // Menggunakan operator logika untuk menentukan bilangan terbesar
        if (bil1 >= bil2 && bil1 >= bil3) {
            System.out.println("Bilangan terbesar adalah: " + bil1);
        } else if (bil2 >= bil3) {
            System.out.println("Bilangan terbesar adalah: " + bil2);
        } else {
            System.out.println("Bilangan terbesar adalah: " + bil3);
        }
        
    }
}
