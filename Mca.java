package abstractNewProject;

public class Mca extends Department implements Branch1 {
		public void admission()
		{
			System.out.println("Callin MCA Admission ");
		}
		public void Lecture ()
		{
			System.out.println("Calling Mca Lecture");
			}
		public void Exams()
		{
			System.out.println("Calling Mca Exams");
		}
		public void Result()
		{
			System.out.println("Calling Mca Result");
		}
		public void AnnualExpense()
		{
			System.out.println("Calling Mca Annual Expances ");
		}


		public static void main(String[] args) {
			Branch1 m1=new Mca();
			m1.admission();
			m1.Lecture();
			m1.Exams();
			m1.Result();
			//m1.AnnualExpense();
		}

}
