import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListEg {
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		int i=1,n,sum=0;
		List<Integer> lis=new LinkedList<Integer>();
		while(i!=0)
		{
			System.out.println("Enter the value in the list");
			n=sc.nextInt();
			lis.add(n);
			sum=n+sum;
			System.out.println("Do you want to continue the list if yes (1) Else No (1)");
			i=sc.nextInt();
			
		}
		System.out.println(lis);
		System.out.println("Total ="+sum);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListEg l=new ListEg();
		l.input();
	}

}
