#include<iostream>
#include<string>

int main(){
	    std::int8_t byteNum= 100;         // cout "d" in c++
		short shortNum = 32767;    //short
		int num = 1;               // Integer (whole number)
		long longNum = 10000000000L; //long
		float floatNum = 1.99f;    // Floating point number
		double doubleNum = 1.99d;
		char ch = 'a';             // Character
		char ch2 = 65;
		bool boolType = true;       // Boolean
		std::string strType = "C++";     // String
	
        std::cout<<byteNum<<std::endl
			<<shortNum<<std::endl
			<<num<<std::endl
			<<longNum<<std::endl
			<<floatNum<<std::endl
			<<doubleNum<<std::endl
			<<ch<<std::endl
			<<ch2<<std::endl
			<<boolType<<std::endl
			<<strType<<std::endl;
}
