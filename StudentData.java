package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentData {
	public void  Task()
	{
		List<InputModel> lis=new ArrayList<InputModel>();
		int i=1,roll=0;
		
		Scanner sc=new Scanner(System.in);
		while(i!=0)
		{
			roll++;
			System.out.println("Enter the name of student");
			String name=sc.next();
			System.out.println("Enter the Qulification");
			String qul=sc.next();
			System.out.println("Enter the marks of English");
			float eng=sc.nextFloat();
			System.out.println("Enter the marks of Maths");
			float math=sc.nextFloat();
			System.out.println("Enter the marks of Science");
			float sci=sc.nextFloat();
			float total=eng+math+sci;
			float avg=total/300*100;
			InputModel i1=new InputModel(roll,name,qul,eng,math,sci,avg);
			lis.add(i1);
			System.err.println("Do you want to enter more data if yes press:(1) else NO press(0)");
			i=sc.nextInt();
			
		}	
		for(InputModel i1: lis)
		{
			System.out.println(i1.getRoll()+" "+i1.getName()+" "+i1.getQul()+" "+i1.getEng()+" "+i1.getMath()+" "+i1.getSci());
			System.out.println("Avrage marks is="+i1.getAvg()+"%");
			if(i1.getAvg()<35)
			{
				System.out.println("Fail");
			}
			else if (i1.getAvg()>35 && i1.getAvg()<45)
			{
				System.out.println("Second Class distinction ");
			}
			else if(i1.getAvg()>46 && i1.getAvg()<60)
			{
				System.out.println("Second Class");
			}
			else if (i1.getAvg() > 61 && i1.getAvg()<71)
			{
				System.out.println("First Class distintion ");
			}
			
			else if(i1.getAvg()>72)
			{
				System.out.println("First Class");
			}
			
				
		}
	}

	public static void main(String[] args) {
		StudentData s1=new StudentData();
		s1.Task();

	}

}
