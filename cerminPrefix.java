import java.util.Scanner;

public class cerminPrefix {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int n = input.nextInt();
      String[] arr = new String[n];
      for (int i = 0; i < n; i++) {
        arr[i] = input.next();
      }
      int count = 0;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (i != j) {
            if (arr[i].startsWith(arr[j])) {
              count++;
              break;
            }
          }
        }
      }
      System.out.println("Jumlah kata yang merupakan prefix dari kata lain : " + count);
    }
  }
}
