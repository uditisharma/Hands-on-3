import java.util.Scanner;
class Overloading
{
	public int multiply(int a,int b)
    {
		return a*b;
         
    }
    public float multiply(float a, float b)  
    {
         return a*b;
    }
    
}
public class Excelling_Jonah 
{
	public static void main(String[] args)
	{
		Overloading obj = new Overloading();
		@SuppressWarnings("resource")
		Scanner sr=new Scanner(System.in);
		System.out.println("Press F for float or I for integer");
		String input= sr.nextLine();
		
		if(input.equalsIgnoreCase("F"))
				
		{
		System.out.println("Enter first number");
		float n1=sr.nextFloat();
		System.out.println("Enter second number");
		float n2=sr.nextFloat();
        obj.multiply(n1,n2);
        float result=obj.multiply(n1,n2);
        System.out.println(result);
		
	       
	}
		else if(input.equalsIgnoreCase("I"))	
		{
			System.out.println("Enter first number");
			int n1=sr.nextInt();
			System.out.println("Enter second number");
			int n2=sr.nextInt();
	        int result=obj.multiply(n1,n2);
	        System.out.println(result);
		
       }
		else 
		{
			System.out.println("Input not recognized");
			}
	}
}
