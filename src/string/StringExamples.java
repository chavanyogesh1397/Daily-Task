package string;

public class StringExamples
{
	
	public static void main(String[] args) 
	{
		String s1 = "welcome ";
		String s2 = "To ";
		String s3 = "pune";
		
		System.out.println(s1.length());//Length = 7
		System.out.println(s1.toUpperCase());//String Converts into Upper case = WELCOME
		System.out.println(s3.toLowerCase());//String Converts into Lower case = pune
		System.out.println(s1.equals(s2));//Check weather the 2 strings are sane or not with case = false
		System.out.println(s1.equalsIgnoreCase(s2));//Check weather the 2 strings are sane or not with ignorecase = false
		System.out.println(s1.charAt(3));// Returns the value of index no 3 = c
		System.out.println("Last Index of o "+ s1.lastIndexOf("o"));//Returns the index no of char o from welcome string from last = 4
		System.out.println(s1.indexOf("e"));// Returns the index no of char e from welcome string = 1
		System.out.println(s1.startsWith("w"));// Returns the String start with w or not= true
		System.out.println(s1.endsWith("tr"));//Returns the String end with tr or not= false
		System.out.println(s1.substring(3,7));//Returns the values from given range of index no = come
		System.out.println(s1.concat(s2).concat(s3)); //Concat all string = welcome To PUNE
		System.out.println(s3.isEmpty());//Returning the true false of is empty or not = false
		System.out.println(s1.replace("w", "T"));//Replace word from w to T = Telcome
		
	}
}
