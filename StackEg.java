import java.util.Scanner;
import java.util.Stack;

public class StackEg {
	public void input()

	{
		Scanner sc=new Scanner(System.in);
		int i=1,j;
		Stack st=new Stack();
		
		
		while (i!=0)
		{
			System.out.println("Push :1 \n Pop :2  \n Print :3 \n Exit :0");
			j=sc.nextInt();
		switch (j)
		{
		case 1: 
			System.out.println("Enter value in stack");
			int n;
			n=sc.nextInt();
			st.push(n);
			break;
		case 2:
			st.pop();
			break;
		case 3:
			System.out.println(st);
			break;
		case 0:
			i=0;
		}
		}
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackEg e1=new StackEg();
		e1.input();

	}

}
