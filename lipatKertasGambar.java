import java.util.Scanner;

public class lipatKertasGambar {

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int n = input.nextInt();
      int[][] matrix = new int[n][n];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          matrix[i][j] = input.nextInt();
        }
      }
      int count = 0;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (i != j) {
            if (matrix[i][j] == 1) {
              count++;
              break;
            }
          }
        }
      }
      System.out.println("Jumlah gambar yang dapat dilipat : " + count);
    }
  }

}
