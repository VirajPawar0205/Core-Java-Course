package myPackage;

public class Abc {
	void Addation()
	{
		try
		{
			int i,sum=0;
			for(i=0;i<100;i++)
			{
				sum=sum+i;
				
				if(sum >100)//WAP to accept age from user and if that age is in between 21 to 30 then display "you are eligible otherwise throw an exception"
				{
					throw new UDexception("Addation exceed 100");					
				}
				else
				{
					System.out.println(sum);
				}
			}
		}
		catch(UDexception e)
		{
			System.out.println("Exception is = "+e.message);
		}
	}
	public static void main(String[] args) {
		Abc a1=new Abc();
		a1.Addation();
	}

}
