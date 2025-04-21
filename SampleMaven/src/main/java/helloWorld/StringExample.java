package helloWorld;

public class StringExample {

	public static void main(String[] args) {
		
		String str1= "Hello"; // declared using string literal method
		System.out.println(str1);
		
		String str2 = new String("Hello 2"); //declared using new keyword
		System.out.println(str2);
		
		
		//Characacter array conversion to string using new keyword
		char ch[] = {'A', 'B', 'C'};
		String str3 = new String(ch);
		System.out.println(str3);				

		//Method to find length of string
		System.out.println("String 1 length :"+str1.length());
		System.out.println("String 2 length :"+str2.length());
		System.out.println("String 3 length :"+str3.length());
		
		//method for string concatenetion. concat()
		System.out.println(str1.concat(str3));
		
		//method for converting to upper case
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		//Equals
		String s1 = "java";
		String s2 = "java";
		String s3 = "Java"; //1st letter capital
		String s4 = "selenium";
		
		//method for checking 2 string equal or not
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3)); //will return false, because case sensitive
		System.out.println(s3.equals(s4)); // will return false
		
		//Equals Ignore case //if  case sensitive doesn't matter we can use this method
		System.out.println(s1.equalsIgnoreCase(s3));
		
		//Checking a string empty or not
		String s5 = "";
		System.out.println(s1.isEmpty()); //will return false, bcoz the string is not empty;
		System.out.println(s5.isEmpty()); //will return true, bcoz the string is empty;
		
		//Typecasting. Converting 1 data type to another
		int a =10;
		String s6 = "";
		String s7 = s6.valueOf(a);
		//or
		String s8 = String.valueOf(a);
		System.out.println(s7);
		System.out.println(s8);
	
		
		//Contains. To check whether a character or a word present in string
		String str4 = "This is a hello world program";
		System.out.println(str4.contains("hello")); //will return true, bcoz "hello is present in string"
		System.out.println(str4.contains("india"));  //will return flase, bcoz "india is not present in string"
		
		
		String str5 = new String ("java");
		System.out.println(s1==s2); //here reference are compared, thats why return true
		System.out.println(s1==str5); //here objects are compared, thats why return false. bcoz str5 is declared using new keyword
		System.out.println(s1.equals(str5));//here reference are compared, thats why return true
		
		
		
		
	
		
		
	}

}
