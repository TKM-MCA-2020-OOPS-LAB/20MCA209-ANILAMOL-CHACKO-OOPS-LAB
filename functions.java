package myproject;

public class Functions {
	public static void main(String[] args) {
		String s = "Java Programming";
		String s1= "JAVA";
		String s2= "Java";
		String s3 = "  Welcome to Java  ";
		
		System.out.println("STRING FUNCTIONS");
		System.out.println("");
		System.out.println("Char at index 5: " + s.charAt(5));
		System.out.println("After Concation: "+ s.concat(" tutorial"));
		System.out.println("Checking equals ignoring case: " +s2.equalsIgnoreCase(s1));
		System.out.println("Checking equals with case: " +s2.equals(s1));
		System.out.println("Checking Length: "+ s.length());
		System.out.println("Replace function: "+ s.replace("Programming", "functions"));
		
		System.out.println("SubString of s: "+ s.substring(5));
		System.out.println("SubString of s: "+ s.substring(5, 12));
		
		System.out.println("Lower case: "+ s.toLowerCase());
		System.out.println("Upper case: "+ s.toUpperCase());
		System.out.println("Triming string: " + s3.trim());
		
		System.out.println("searching s1 in s: " + s.contains(s1));
		System.out.println("searching s2 in s: " + s.contains(s2));

		char [] charArray = s2.toCharArray();
		System.out.println("Size of char array: " + charArray.length);
		System.out.println("Printing last element of array: " + charArray[3]);

	}

}
