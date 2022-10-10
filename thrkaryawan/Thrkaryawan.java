package thrkaryawan;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Thrkaryawan {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String pilihan = "y";
            do {
                System.out.println("Masukkan Nama Karyawan : ");
                String nama = input.next();
                System.out.println("Lama bekerja (Bulan) : ");
                float lama = input.nextInt();
                System.out.println("Gaji Karyawan : ");
                float gaji = input.nextFloat();

                float MenghitungTHRKaryawan;
                if (lama >= 12) {
                    MenghitungTHRKaryawan = gaji;
                } else {
                    MenghitungTHRKaryawan = gaji * lama / 12;
                }

                DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
                DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

                formatRp.setCurrencySymbol("Rp. ");
                formatRp.setMonetaryDecimalSeparator(',');
                formatRp.setGroupingSeparator('.');
                formatRp.setDecimalSeparator(',');
                kursIndonesia.setDecimalFormatSymbols(formatRp);
                kursIndonesia.setMaximumFractionDigits(0);
                DecimalFormat tahun = new DecimalFormat("0.00");
                tahun.setMaximumFractionDigits(0);

                System.out.println("Nama Karyawan : " + nama);
                System.out.println("Lama bekerja : " + lama + " Bulan" + " (" + tahun.format(lama / 12) + " Tahun)");
                System.out.println("Gaji Karyawan : " + kursIndonesia.format(gaji));
                System.out.println("THR Karyawan : " + kursIndonesia.format(MenghitungTHRKaryawan));
                int total = (int) (MenghitungTHRKaryawan + gaji);
                System.out.println("Total Gaji Karyawan : " + kursIndonesia.format(total));

                System.out.println("Apakah anda ingin mengulang? (y/n)");
                pilihan = input.next();
            } while (pilihan.equalsIgnoreCase("y"));
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan, silahkan coba lagi");
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("Terima Kasih");
        }

        while (true) {
            System.out.println("Program Selesai");
            break;
        }
    }
}