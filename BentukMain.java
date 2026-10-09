import java.util.Scanner;

public class BentukMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //buat objek bentuk
        System.out.print("\nMasukkan warna Bentuk: ");
        String warnaBentuk = scanner.nextLine();
        Bentuk b = new Bentuk(warnaBentuk);
        b.printInfo();
        
        //buat objek lingkaran
        System.out.print("\nMasukkan warna Lingkaran: ");
        String warnaLingkaran = scanner.nextLine();
        System.out.print("Masukkan radius Lingkaran: ");
        double radiusLingkaran = scanner.nextDouble();
        Lingkaran l = new Lingkaran(radiusLingkaran, warnaLingkaran);
        l.printInfo();
        scanner.nextLine();
        
        //buat objek silinder
        System.out.print("\nMasukkan warna Silindwr: ");
        String warnaLSilinder = scanner.nextLine();
        System.out.print("Masukkan radius Silidner: ");
        double radiusSilinder = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Masukkan tinggi Silidner: ");
        double tinggiSilinder = scanner.nextDouble();
        Silinder s = new Silinder(tinggiSilinder, radiusSilinder, warnaLSilinder);
        s.printInfo();
    }
}