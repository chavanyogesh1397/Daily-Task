package accessSpecifier;

public class MainClass 
{
	public static void main(String[] args) 
	{
		PublicEx x = new PublicEx();
		//x.color();
		//x.xyz();
		DefaultClass d = new DefaultClass();
		d.Sport();
		PrivateClass p = new PrivateClass();
		p.car();
	}
}
