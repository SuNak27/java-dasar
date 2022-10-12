import java.util.Scanner;

public class bolpoin {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Masukkan jumlah bolpoin : ");
      int jumlah = input.nextInt();
      System.out.print("Masukkan Jumlah Bulan : ");
      int bulan = input.nextInt();
      System.out.print("Jumlah Produksi Tiap Bulan : ");
      int produksi = input.nextInt();
      int total = 0;
      for (int i = 0; i < bulan; i++) {
        int j = i + 1;
        System.out.println("Bulan Ke " + j + " : " + jumlah);
        total = total + jumlah;
        jumlah = jumlah + produksi;
      }

      System.out.println("Total Produksi : " + total);
    } catch (Exception e) {
      System.out.println("Terjadi kesalahan, silahkan coba lagi");
    } finally {
      System.out.println("Terima Kasih");
    }
  }
}
