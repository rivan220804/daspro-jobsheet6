import java.util.Scanner;
/**
 * latihan1
 */
public class latihan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = sc.nextInt();
        System.out.println("Masukkan bilangan ketiga: ");
        int bil3 = sc.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan terbesar adalah: " + bil1);
            } else {
                System.out.println("Bilangan terbesar adalah: " + bil3);
            }
        } else {
            if (bil2 > bil3) {
                System.out.println("Bilangan terbesar adalah: " + bil2);
            } else {
                System.out.println("Bilangan terbesar adalah: " + bil3);
            }
        }
    }
}
