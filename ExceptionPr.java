class ExceptionPr{
	static void testFunction(){                          //static ??
		System.out.println("This is a function");
		}
    public static void main(String args[]){
        testFunction();

		try{
			String[] sentence = {"Learn", "Java", "and", "CPP"};
			System.out.println(sentence[10]);  // Index 10 out of bounds for length 4
		} catch(Exception e){
			System.out.println("runtime error");
		}
		
    }		
}

