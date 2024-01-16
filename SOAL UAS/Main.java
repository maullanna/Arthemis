import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan sebuah angka: ");
            int angka = scanner.nextInt();
            System.out.println("Angka yang dimasukkan: " + angka);
        } catch (InputMismatchException e) {
            System.out.println("Input yang dimasukkan bukan angka.");
            // Lakukan penanganan kesalahan di sini, misalnya memberi pesan kepada pengguna atau operasi lain yang sesuai.
        } finally {
            // Blok finally dapat digunakan untuk kode yang harus dijalankan, terlepas dari apakah terjadi pengecualian atau tidak.
            System.out.println("Program selesai.");
            scanner.close();
        }
    }
}
