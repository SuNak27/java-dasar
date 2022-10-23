import java.util.Scanner;

public class bitcoin {

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int prediksi = 0;
      int total = 0;

      prediksi = input.nextInt();

      // Array of number
      int[] number = new int[prediksi];

      // Input number
      for (int i = 0; i < prediksi; i++) {
        number[i] = input.nextInt();
      }

      // Output
      for (int i = 0; i < prediksi; i++) {
        int j = i + 1;
        if (j < prediksi) {
          if (number[i] < number[j]) {
            total += number[j] - number[i];
          }
        }
      }

      System.out.println("Total : " + total);
    }

  }

}
