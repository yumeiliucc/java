class ArrayPr{
    public static void main(String args[]){

		String[] sentence = {"Learn", "Java", "and", "CPP"};
		for(int i = 0; i < sentence.length; i++){
			System.out.println(sentence[i]);			
		}
		
		for(String str : sentence){
			System.out.println(str);
			}

		System.out.println();
		
		String[][] matrix = {{"Learn", "Java", "and", "CPP"}, {"They", "are", "both", "useful"}};
		for(String[] i : matrix){                   //no auto, C++ has powerful "auto"
			for(String str : i){
				System.out.println(str);
			}
		}
    }		
}

