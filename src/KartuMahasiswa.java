import java.util.Scanner;

public class KartuMahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK : ");
        long nik = input.nextLong();

        System.out.print("Masukkan Umur : ");
        int umur = input.nextInt();

        System.out.print("Masukkan Tinggi Badan : ");
        double tinggiBadan = input.nextDouble();

        System.out.print("Masukkan Golongan Darah : ");
        char golonganDarah = input.next().charAt(0);

        System.out.print("Masukkan Status Pernikahan : ");
        boolean sudahMenikah = input.nextBoolean();




        System.out.println();
        System.out.println("===== KARTU MAHASISWA =====");

        System.out.println("NIK         : " + nik);
        System.out.println("Umur        : " + umur + " tahun");
        System.out.println("Tinggi      : " + tinggiBadan + " cm");
        System.out.println("Gol darah   : " + golonganDarah);
        System.out.println("Menikah     : " + sudahMenikah);


        input.close();
    }
}