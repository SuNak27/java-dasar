import java.util.Scanner;

public class ubin {
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
      // input
      int N = input.nextInt();

      // jumlah susunan dengan inputan N
      int jumlahSusunan = 0;

      // proses
      // cari jumlah kemingkinan susunan dengan inputan N
      for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= N; j++) {
          for (int k = 1; k <= N; k++) {
            if (i + j + k == N) {
              jumlahSusunan++;
            }
          }
        }
      }

      // output
      System.out.println(jumlahSusunan);

    }
  }
}
