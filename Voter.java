import java.util.Scanner;

class Voter{
  public static void main(String[]args){
      Scanner reader = new Scanner(System.in);
      System.out.println("Enter Your age: ");
      int a = reader.nextInt();
      reader.close();
      if (a >= 18){
        System.out.println("Eligible for Voting");
        }
        else {
          System.out.println("Not eligible for Voting");
        }
  }
}
