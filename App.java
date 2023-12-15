import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi piramida: ");
        int tinggi = scanner.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            // Spasi
            for (int j = tinggi - i; j > 0; j--) {
                System.out.print(" ");
            }

            // untuk Bintang
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // untuk Pindah baris
            System.out.println();
        }
    }
}