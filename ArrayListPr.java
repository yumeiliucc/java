import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPr {
  public static void main(String[] args) {
    ArrayList<String> languages = new ArrayList<String>();
    languages.add("Java");
    languages.add("C++");
    languages.add("Python");
    languages.add("Go");
    for (String i : languages) {
      System.out.println(i);
    }

	languages.remove(0);
	System.out.println(languages.get(0));
	languages.set(0, "newJava");
	System.out.println(languages.get(0));
	for (String i : languages) {
      System.out.println(i);
    }

	Collections.sort(languages);
	for (String i : languages) {
      System.out.println(i);
    }
	System.out.println("size : " + languages.size());
	languages.clear();
	System.out.println("size after clearing: " + languages.size());
  }
}

