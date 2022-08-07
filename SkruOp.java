import java.util.Scanner;

public class SkruOp {
  public static void main(String[] args) {
    int start = 7;

    Scanner s = new Scanner(System.in);
    int n = Integer.parseInt(s.nextLine());

    for(int i = 0; i < n; i++) {
      String order = s.nextLine();
      if(order.equals("Skru op!") && start < 10) {
        start += 1;
      }
      else if (order.equals("Skru ned!") && start > 0) {
        start -=1;
      }
    }
    System.out.println(start);
  }
}
