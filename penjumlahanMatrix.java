import java.util.Scanner;

public class penjumlahanMatrix {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int baris = input.nextInt();
      int kolom = input.nextInt();
      int[][] matrix1 = new int[baris][kolom];
      int[][] matrix2 = new int[baris][kolom];
      int[][] matrix3 = new int[baris][kolom];
      for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
          matrix1[i][j] = input.nextInt();
        }
      }
      for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
          matrix2[i][j] = input.nextInt();
        }
      }
      for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
          matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
        }
      }
      for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
          System.out.print(matrix3[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
}
