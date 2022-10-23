import java.util.Scanner;

public class laserIronMan {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      // banyak robot ultron
      int n = input.nextInt();

      // array of robot ultron
      int[][] robot = new int[n][2];

      // input robot ultron
      for (int i = 0; i < n; i++) {
        robot[i][0] = input.nextInt();
        robot[i][1] = input.nextInt();
      }

      // array of laser
      int[][] laser = new int[n][2];

      // input laser
      for (int i = 0; i < n; i++) {
        laser[i][0] = input.nextInt();
        laser[i][1] = input.nextInt();
      }

      // array of robot yang terkena laser
      int[] robotTerkenaLaser = new int[n];

      // cek robot yang terkena laser
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (robot[i][0] == laser[j][0] || robot[i][1] == laser[j][1]) {
            robotTerkenaLaser[i] = 1;
          }
        }
      }

      // jumlah robot yang terkena laser
      int jumlahRobotTerkenaLaser = 0;
      for (int i = 0; i < n; i++) {
        if (robotTerkenaLaser[i] == 1) {
          jumlahRobotTerkenaLaser++;
        }
      }

      System.out.println("Jumlah robot yang terkena laser : " + jumlahRobotTerkenaLaser);

    }
  }
}
