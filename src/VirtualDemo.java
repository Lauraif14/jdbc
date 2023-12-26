import java.util.*;
import java.util.Date;
import java.text.*;
import java.sql.*;

public class VirtualDemo {
    public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/transaksi"; // Replace with your database URL
    String username = "lauraiffa"; // Replace with your database username
    String password = "bismillah1"; // Replace with your database password
        Scanner scanner = new Scanner(System.in);
        boolean inputValid = false;
        Date hariSekarang = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("E, dd/MM/yyyy");
        SimpleDateFormat waktu = new SimpleDateFormat("HH:mm:ss a zzz");
        do {
            try {
                System.out.print("kode barang\t\t: ");
                String noFaktur = scanner.next();

                System.out.print("nama pelanggan\t\t: ");
                String namaPelanggan = scanner.next();

                System.out.print("nomor HP pelanggan\t: ");
                String nomorHP = scanner.nextLine();

                System.out.print("alamat pelanggan\t: ");
                String alamatPelanggan = scanner.nextLine();

                System.out.print("nama barang\t\t: ");
                String namaBarang = scanner.nextLine();

                System.out.print("harga barang\t\t: ");
                double hargaBarang = scanner.nextDouble();

                System.out.print("jumlah barang\t\t: ");
                int jumlahBarang = scanner.nextInt();

                // Membuat objek Pembali
                Pembelian pembelian = new Pembelian (noFaktur, namaPelanggan, nomorHP, alamatPelanggan, namaBarang, hargaBarang, jumlahBarang);

                // Menampilkan detail Invoice dan total bayar
                System.out.println("==============================================");
                System.out.println("\t\tMINIMART");
                System.out.println("----------------------------------------------");
                System.out.println("Tanggal\t: " + tanggal.format(hariSekarang));
                System.out.println("Waktu\t: " + waktu.format(hariSekarang));
                System.out.println("==============================================");
                System.out.println("\t\tDATA PELANGGAN\t");
                System.out.println("----------------------------------------------");
                pembelian.tampilaninfo();
                System.out.println("TOTAL BAYAR\t: " + pembelian.hitungTotalBayar());
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Kasir\t: Laura");
            
                Connection connection = DriverManager.getConnection(url, username, password);
                System.out.println("Connected to database successfully!");

                inputValid = true; // Jika tidak terjadi exception, keluar dari perulangan

            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input Data \n");
                System.out.println("========== Masukan Ulang ==========\n");
                scanner.nextLine(); 
            }
        } while (!inputValid);

        scanner.close();
    }

}