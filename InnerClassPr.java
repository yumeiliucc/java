public class InnerClassPr {
  public static void main(String[] args) {
  	ProgrammLanClass pLan = new ProgrammLanClass();
    ProgrammLanClass.OutLanguagesClass outL = pLan.new OutLanguagesClass();
    ProgrammLanClass.OutLanguagesClass.InnerLanguagesClass innerL = outL.new InnerLanguagesClass();
    System.out.println(pLan.progmLan + outL.cLan + innerL.newEdition);
  }
}

class ProgrammLanClass{
	String progmLan = "Programm Language : ";
		
	class OutLanguagesClass {
		  String cLan = "C++";

		  class InnerLanguagesClass {
		    String newEdition = "11";
		  }
		}
	}





