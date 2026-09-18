import java.util.Scanner;

public class KartuMahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK : ");
        long nik = input.nextLong();

        // Percobaan dengan int akan menghasilkan error karena NIK 16 digit melebihi batas maksimal int (2.147.483.647).
        // int nik = input.nextInt();

        System.out.print("Masukkan Umur : ");
        int umur = input.nextInt();

        System.out.print("Masukkan Tinggi Badan : ");
        double tinggiBadan = input.nextDouble();

        System.out.print("Masukkan Golongan Darah : ");
        char golonganDarah = input.next().charAt(0);

        System.out.print("Masukkan Status Pernikahan : ");
        boolean sudahMenikah = input.nextBoolean();

        // nextLine() diperlukan untuk membersihkan karakter Enter yang masih tersisa setelah nextBoolean().
        input.nextLine();

        System.out.print("Masukkan Nama lengkap : ");
        String namaLengkap = input.nextLine();

        System.out.println();
        System.out.println("===== KARTU MAHASISWA =====");
        System.out.println("Nama        : " + namaLengkap);
        System.out.println("NIK         : " + nik);
        System.out.println("Umur        : " + umur + " tahun");
        System.out.println("Tinggi      : " + tinggiBadan + " cm");
        System.out.println("Gol darah   : " + golonganDarah);
        System.out.println("Menikah     : " + sudahMenikah);

        input.close();
    }
}