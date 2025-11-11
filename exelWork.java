package mypackage;
import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
public class exelWork {
	public void readData()

	{
		try
		{
			File f=new File("C:\\Users\\Admin\\Desktop\\Exel\\Student.xls");
			FileInputStream fin=new FileInputStream(f);
			HSSFWorkbook book=new HSSFWorkbook(fin);
			HSSFSheet sheet=book.getSheet("Sheet1");
			int r=sheet.getLastRowNum();
			System.out.println(r);
			String n=sheet.getRow(2).getCell(1).getStringCellValue();
			int rn=(int)sheet.getRow(2).getCell(0).getNumericCellValue();
			System.out.println(rn+" "+n);
			String roll= sheet.getRow(0).getCell(0).getStringCellValue();
			String names= sheet.getRow(0).getCell(1).getStringCellValue();
			String quli= sheet.getRow(0).getCell(2).getStringCellValue();
			String perc= sheet.getRow(0).getCell(3).getStringCellValue();
			System.out.println(roll+" "+names+" "+quli+" "+perc);
			for(int i=1;i<r;i++)
			{
				int rno=(int)sheet.getRow(i).getCell(0).getNumericCellValue();
				String name= sheet.getRow(i).getCell(1).getStringCellValue();
				String ql=sheet.getRow(i).getCell(2).getStringCellValue();
				float per=(float)sheet.getRow(i).getCell(3).getNumericCellValue();
				
				System.out.println(rno+" "+name+" "+ql+" "+per);
			}			
		}
		catch(Exception e)
		{
			System.out.println("Exception =>"+e.getMessage());
		}
	}
	
	public void writeData()
	{
		try
		{
			File f=new File("E:\\Demo.xls");
			FileInputStream fin=new FileInputStream(f);
			HSSFWorkbook book=new HSSFWorkbook(fin);
			HSSFSheet sheet= book.getSheet("Sheet1");
			FileOutputStream fout=new FileOutputStream(f);
			int r=sheet.getLastRowNum();
			System.out.println(r);
			for(int i=1;i<=r;i++)
			{
				int rno=(int)sheet.getRow(i).getCell(0).getNumericCellValue();
				String name= sheet.getRow(i).getCell(1).getStringCellValue();
				float English=(float)sheet.getRow(i).getCell(2).getNumericCellValue();
				float Maths=(float)sheet.getRow(i).getCell(3).getNumericCellValue();
				float Science=(float)sheet.getRow(i).getCell(4).getNumericCellValue();
				float total=English+Maths+Science;
				float per=total/3;
				String res="Fail";
				
				if(per>35)
				{
					res="Pass";
				}
	
				
				System.out.println(rno+" "+name+" "+Maths+" "+English+" "+Science+" "+per); 
				HSSFCell ctotal=sheet.getRow(i).createCell(5);
				ctotal.setCellValue(total);
				
				HSSFCell cper=sheet.getRow(i).createCell(6);
				cper.setCellValue(per);
				
				HSSFCell cres=sheet.getRow(i).createCell(7);
				cres.setCellValue(res);
			}
			HSSFCell ctotal=sheet.getRow(0).createCell(5);
			ctotal.setCellValue("Total");
			
			HSSFCell cper=sheet.getRow(0).createCell(6);
			cper.setCellValue("Percentage");
			
			HSSFCell cres=sheet.getRow(0).createCell(7);
			cres.setCellValue("Result");
			book.write(fout);
			fout.close();
			book.close();
			System.out.println("Finished");
		}
		catch(Exception e)
		{
			System.out.println("Exception =>  "+e.getMessage());
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exelWork e1=new exelWork();
		//e1.readData();
		e1.writeData();

	}

}
