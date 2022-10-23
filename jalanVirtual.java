import java.util.Scanner;

public class jalanVirtual {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      // Deklarasi variabel
      int n = input.nextInt();
      int m = input.nextInt();

      // Koordinat awal
      int x = input.nextInt();
      int y = input.nextInt();

      // jumlah langkah
      int langkah = input.nextInt();

      // Array of langkah
      String[] arr = new String[langkah];
      for (int i = 0; i < langkah; i++) {
        arr[i] = input.next();
      }

      // Output

      // Jumlah langkah yang bisa dilakukan
      int count = 0;

      // Jumlah langkah yang bisa dilakukan
      for (int i = 0; i < langkah; i++) {
        if (arr[i].equals("U")) {
          if (y < m) {
            y++;
            count++;
          }
        } else if (arr[i].equals("D")) {
          if (y > 0) {
            y--;
            count++;
          }
        } else if (arr[i].equals("R")) {
          if (x < n) {
            x++;
            count++;
          }
        } else if (arr[i].equals("L")) {
          if (x > 0) {
            x--;
            count++;
          }
        }
      }

      System.out.println("Jumlah langkah yang bisa dilakukan : " + count);

    }
  }
}
