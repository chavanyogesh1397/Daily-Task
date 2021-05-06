package Control_statments;

public class Nested_If 
{
public static void main(String[] args) 
{
	int Practicle_Marks = 85;
	int Theory_Marks = 15;
	
	if(Practicle_Marks>=35)
	{
		System.out.println("Practical pass");
		if(Theory_Marks>=35)
		{
			System.out.println("Theory Pass");
		}
		else
		{
			System.out.println("Theory Fail");
		}
	}
	else if(Practicle_Marks<35 && Theory_Marks>35)
	{
		System.out.println("Practical Failed and theory pass");
	}
	else
	{
		System.out.println("Practical failed and Theory Failed");
	}
	
}
}
