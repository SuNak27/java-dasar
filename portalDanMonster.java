import java.util.Scanner;

public class portalDanMonster {

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int n = input.nextInt();
      int k = input.nextInt();
      int[] monster = new int[n];
      for (int i = 0; i < n; i++) {
        monster[i] = input.nextInt();
      }
      int[][] terowongan = new int[k][2];
      for (int i = 0; i < k; i++) {
        for (int j = 0; j < 2; j++) {
          terowongan[i][j] = input.nextInt();
        }
      }
      int total = 0;
      for (int i = 0; i < k; i++) {
        int j = i + 1;
        if (j < k) {
          if (terowongan[i][0] < terowongan[j][0]) {
            total += terowongan[j][0] - terowongan[i][0];
          }
        }
      }
      System.out.println("Total : " + total);
    }
  }
}
