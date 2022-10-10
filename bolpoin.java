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
      for (int i = 0; i < bulan;) {
        int j = i + 1;
        System.out.println("Bulan Ke " + j + " : " + jumlah);
        jumlah = jumlah + produksi;
      }
    } catch (Exception e) {
      System.out.println("Terjadi kesalahan, silahkan coba lagi");
    } finally {
      System.out.println("Terima Kasih");
    }
  }
}
