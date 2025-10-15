
public class Abc extends Xyz implements I1,I2{
	
	public void sub()
	{
		System.out.println("Calling sub");
	}
	public void mul()
	{
		System.out.println("calling mul");
	}
	public void show()
	{
		System.out.println("Calling show");
	}

	public static void main(String[] args) {
		//This method is use to replace the Multilevel Inheritance uses in most of the programs call interface ल
Abc a1=new Abc();
a1.Add();
a1.sub();
a1.mul();
a1.show();
I2 i1=new Abc();
i1.Add();
i1.mul();

	}

}
