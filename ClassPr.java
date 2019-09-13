
class ClassPr{                                         //ClassPr includ "main"
	String sentence = "Java and CPP";
	final String word1 = "java";
	
	int val;
	public ClassPr(){
		val = 100;
	}

	//static method
    static void myfunction1(){
		String str = "I can use Java now 1";
		System.out.println(str);
    	}

	public void myfunction2(){         //if no "public", it will be private?
		String str = "I can use Java now 2";
		System.out.println(str);
    	}
	
    public static void main(String args[]){             //main() is ahead of the Shape

		myfunction1();                     //myfunction1 is static, can be accessed without creating an object of the class
	    ClassPr javaClass = new ClassPr();
		javaClass.myfunction2();           //myfunction2 must be accessed after creating an object of the class
		  
		System.out.println(javaClass.sentence);
		javaClass.sentence = "They are both useful";
		System.out.println(javaClass.sentence);	
		
		
		System.out.println(javaClass.val);
		//javaClass.word1 = "try1";             //word1 can't be override
		System.out.println(javaClass.word1);

		//
		Rectangle rect = new Rectangle(100, 200);
		System.out.println(rect.area());

		
		
    }		

}

abstract class Shape{   //Shape is ahead of Rectangle
	 
	public abstract int area(); // abstract methods cannot have a body
}

class Rectangle extends Shape{
int length;
int width;

public Rectangle(int x, int y){
	length = x;
	width = y;
	}
	public int area(){
		return length*width;
		}

	}

