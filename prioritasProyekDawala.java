import java.util.Scanner;

public class prioritasProyekDawala {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      int p = input.nextInt();
      String[] namaDesa = new String[p];
      int[] x = new int[p];
      int[] y = new int[p];
      int[] r = new int[p];
      int[] jarak = new int[p];
      for (int i = 0; i < p; i++) {
        namaDesa[i] = input.next();
        x[i] = input.nextInt();
        y[i] = input.nextInt();
        r[i] = input.nextInt();
        jarak[i] = (int) Math.sqrt(Math.pow(x[i], 2) + Math.pow(y[i], 2)) + r[i];
      }

      for (int i = 0; i < p; i++) {
        int max = jarak[i];
        int index = i;
        for (int j = i + 1; j < p; j++) {
          if (max < jarak[j]) {
            max = jarak[j];
            index = j;
          }
        }
        if (index != i) {
          int temp = jarak[i];
          jarak[i] = jarak[index];
          jarak[index] = temp;
          String tempNamaDesa = namaDesa[i];
          namaDesa[i] = namaDesa[index];
          namaDesa[index] = tempNamaDesa;
        }
      }

      for (int i = 0; i < p; i++) {
        System.out.println(namaDesa[i]);
      }
    }
  }
}
