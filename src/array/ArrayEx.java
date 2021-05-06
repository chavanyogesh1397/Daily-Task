package array;

public class ArrayEx 
{
	public static void main(String[] args) 
	{
		String sr[] = new String[5];
		sr[0]="Akash";
		sr[1]="Yogesh";
		sr[2]="Ranjit";
		sr[3]="Rohit";
		sr[4]="Ajinkya";
		//System.out.println(sr[0]);
		for(int i=sr.length-1;i>=0;i--)
		{
			System.out.println(sr[i]);
		}

	}
}
