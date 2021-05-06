package string;

public class StringEx
{
public static void main(String args [])
{
	String s1 = "Tiger ";
	String s2 = "Jaguar";
	String s3= "India";
	System.out.println(s1.replace("T", "V"));
	System.out.println(s1.isEmpty());
	System.out.println(s1.concat(s2));
	System.out.println(s2.substring(0,2));
	System.out.println("Ends with J "+s2.startsWith("J"));
	System.out.println(s2.endsWith("r"));
	System.out.println(s2.indexOf("g"));
	System.out.println(s2.charAt(3));
	System.out.println(s2.equals(s1));
	System.out.println(s2.equalsIgnoreCase(s1));
	System.out.println(s2.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s3.substring(0, 3));
	System.out.println(s3.contains("z"));
	   
}
}