package abstractNewProject;

public class Bca extends Department implements Branch1 {
	public void admission()
	{
		System.out.println("Callin BCA Admission ");
	}
	public void Lecture ()
	{
		System.out.println("Calling bca Lecture");
		}
	public void Exams()
	{
		System.out.println("Calling bca Exams");
	}
	public void Result()
	{
		System.out.println("Calling bca Result");
	}
	public void AnnualExpense()
	{
		System.out.println("Calling bca Annual Expances ");
	}

	public static void main(String[] args) {
		Bca b1=new Bca();
		b1.admission();
		b1.Lecture();
		b1.Exams();
		b1.Result();
		b1.AnnualExpense();

	}

}
