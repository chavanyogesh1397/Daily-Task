package packageAccessspecifier;
//access public class from different package
import accessSpecifier.PublicEx;

public class ForPublic 
{
	public static void main(String[] args) 
	{
		PublicEx r = new PublicEx();
		r.color();
	}
}
