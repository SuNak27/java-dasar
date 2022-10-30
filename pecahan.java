import java.util.Scanner;

public class pecahan {
  public static void main(String[] args) {
    try (// input bilangan pecahan
        Scanner input = new Scanner(System.in)) {
      System.out.print("Masukkan bilangan pecahan: ");
      // pecahan 1
      int p1 = input.nextInt();
      int q1 = input.nextInt();
      // pecahan 2
      int p2 = input.nextInt();
      int q2 = input.nextInt();

      // convert ke desimal
      double desimal1 = (double) p1 / q1;
      double desimal2 = (double) p2 / q2;

      // cek lebih besar dan cek apakah bernilai sama
      if (desimal1 > desimal2) {
        System.out.println("Pecahan " + p1 + "/" + q1 + " lebih besar dari " + p2 + "/" + q2);
      } else if (desimal1 < desimal2) {
        System.out.println("Pecahan " + p1 + "/" + q1 + " lebih kecil dari " + p2 + "/" + q2);
      } else {
        System.out.println("Pecahan " + p1 + "/" + q1 + " sama dengan " + p2 + "/" + q2);
      }
    }
  }
}