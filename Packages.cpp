import java.util.Scanner;   //import a single class
import java.util.*    //import the whole package



class Packages {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}



