class InterFacePr {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}


// Interface
interface Animal {                                //interface  like "abstract class"
  public void animalSound(); // interface method (does not have a body) , like abstract method
  
}

interface Bird {                                //interface  like "abstract class"
  public void sleep(); // interface method (does not have a body)
}


// Pig "implements" the Animal interface
class Pig implements Animal, Bird {                       //implement substuit extend
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("animal: The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("bird: Zzz");
  }
}



