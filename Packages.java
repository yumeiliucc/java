import java.util.Scanner;

class Packages {
  public static void main(String[] args) {
    Scanner scannerObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = scannerObj.nextLine();   // Read user input
    System.out.println("Username is: " + userName);    // Output user input

	int num = scannerObj.nextInt();
	double dnum = scannerObj.nextDouble();        //get input "num, dnum"; then output "num, dnum"
	System.out.println("num : " + num);
	System.out.println("dnum : " + dnum);

	
  }
}



