import java.util.Scanner;

public class babakPenyisihan {
  public static void main(String[] args) {
    // input
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    int M = input.nextInt();
    int[] H = new int[N];
    for (int i = 0; i < N; i++) {
      H[i] = input.nextInt();
    }
    int[][] jalur = new int[M][2];
    for (int i = 0; i < M; i++) {
      jalur[i][0] = input.nextInt();
      jalur[i][1] = input.nextInt();
    }
    input.close();

    // proses
    // cari jalur yang tidak aman
    int[] jalurTidakAman = new int[M];
    int jumlahJalurTidakAman = 0;
    for (int i = 0; i < M; i++) {
      if (H[jalur[i][0] - 1] <= H[jalur[i][1] - 1]) {
        jalurTidakAman[jumlahJalurTidakAman] = i;
        jumlahJalurTidakAman++;
      }
    }
    // cari jalur yang aman
    int[] jalurAman = new int[M - jumlahJalurTidakAman];
    int jumlahJalurAman = 0;
    for (int i = 0; i < M; i++) {
      boolean aman = true;
      for (int j = 0; j < jumlahJalurTidakAman; j++) {
        if (i == jalurTidakAman[j]) {
          aman = false;
          break;
        }
      }
      if (aman) {
        jalurAman[jumlahJalurAman] = i;
        jumlahJalurAman++;
      }
    }
    // cari jalur yang tidak aman yang menghubungkan titik pendakian yang aman
    int[] jalurTidakAmanYangMenghubungkanTitikPendakianAman = new int[jumlahJalurTidakAman];
    int jumlahJalurTidakAmanYangMenghubungkanTitikPendakianAman = 0;
    for (int i = 0; i < jumlahJalurTidakAman; i++) {
      boolean menghubungkanTitikPendakianAman = false;
      for (int j = 0; j < jumlahJalurAman; j++) {
        if (jalur[jalurTidakAman[i]][0] == jalur[jalurAman[j]][0]
            || jalur[jalurTidakAman[i]][0] == jalur[jalurAman[j]][1]
            || jalur[jalurTidakAman[i]][1] == jalur[jalurAman[j]][0]
            || jalur[jalurTidakAman[i]][1] == jalur[jalurAman[j]][1]) {
          menghubungkanTitikPendakianAman = true;
          break;
        }
      }
      if (menghubungkanTitikPendakianAman) {
        jalurTidakAmanYangMenghubungkanTitikPendakianAman[jumlahJalurTidakAmanYangMenghubungkanTitikPendakianAman] = jalurTidakAman[i];
        jumlahJalurTidakAmanYangMenghubungkanTitikPendakianAman++;
      }
    }

    // output
    System.out.println(jumlahJalurTidakAmanYangMenghubungkanTitikPendakianAman);
    for (int i = 0; i < jumlahJalurTidakAmanYangMenghubungkanTitikPendakianAman; i++) {
      System.out.println(jalurTidakAmanYangMenghubungkanTitikPendakianAman[i] + 1);
    }
  }
}
