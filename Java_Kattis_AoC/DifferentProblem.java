import java.util.Scanner;
import java.lang.*;


public class DifferentProblem {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    

    while (s.hasNextLine()) {
        String numbers = s.nextLine();
        String[] twoNum = numbers.split(" ");
        long n1 = Long.parseLong(twoNum[0]);
        long n2 = Long.parseLong(twoNum[1]);
        System.out.println(Math.abs(n1-n2));



   }
  }
}