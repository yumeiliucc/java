class StringPr{
    public static void main(String args[]){

		String str = "Learn";     // String
   		System.out.println("The length of strType : "+ str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		String sentence = "Java and CPP";
		System.out.println(sentence.indexOf("CPP"));
		
		System.out.println(str + " " + sentence);
		System.out.println(str.concat(" ").concat(sentence));

		String s1 = "5";
		String s2 = "6";
		int i = 6;
		System.out.println(s1 + s2);
		System.out.println(s1 + i);
		System.out.println(i + s1);
    }		
}

