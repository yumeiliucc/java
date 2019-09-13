import java.util.HashMap;  //import the HashMap class

class HashMapPr{
	public static void main(String args[]){
		HashMap<String, String> languagesHM = new HashMap<String, String>();
		languagesHM.put("C++", "1");
		languagesHM.put("Java", "2");
		languagesHM.put("Python", "3");
		System.out.println(languagesHM);          //{Java=2, C++=1, Python=3}
		System.out.println(languagesHM.get("C++"));
		languagesHM.remove("C++");                // 1
		System.out.println(languagesHM.get("C++"));  // null
		languagesHM.clear();
		System.out.println(languagesHM);        //{}
		



		
		}
		
}

