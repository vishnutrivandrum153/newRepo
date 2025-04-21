package helloWorld;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//for string buffer
		StringBuffer str1 = new StringBuffer("Hello");
		
		//for string Builder
		StringBuilder str2 = new StringBuilder("world");
		
		System.out.println(str1);
		System.out.println(str2);
		
		//append method. used to concat 2 strings. it can be used with stringBuffer and stringBuilder
		System.out.println(str1.append(str2)); //here str1 will change & str2 remains same
		
		//insert method. used to insert value. inserting value based on index
		System.out.println(str1.insert(5, "123")); //here str1 will change
	
		
		//Replace. One value change and replace with another
		
		System.out.println(str1.replace(5, 7, "4567")); //str1 will change
		
		
		// delete method
		System.out.println(str1.delete(5, 7));
	

	}

}
