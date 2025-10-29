package newList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductOutput {
	public void stock()
		{
		Scanner sc=new Scanner(System.in);
			List<ProductInput> lis=new ArrayList<ProductInput>();
			
			System.out.println("Enter the available Stck quantity");
			int stock_qty=sc.nextInt();
			
			System.out.println("Enter the gst percentage");
			float gst=sc.nextFloat();
			
			int i=1 ,product_id=0;
			float tot_rate,total=0f;
			while(i!=0)
			{				
				System.out.println("Enter the product name ");
				String name=sc.next();
				
				System.out.println("Enter the Rate of product ");
				float rate=sc.nextFloat();
				
				System.out.println("Enter quantity of stock to sell");
				int sell_st=sc.nextInt(); 
								
				float amm=(rate +(rate * gst/100))*sell_st;
				tot_rate=0;
				stock_qty=stock_qty-sell_st;
				
				product_id++;
				ProductInput p=new ProductInput(i, stock_qty, sell_st, name, tot_rate, gst, amm);
				System.out.println("Reamining stock in store "+p.getStock_qty());	
				lis.add(p);
				System.out.println("Do you want to buy more stock if yes (1) Else No (0)");
				i=sc.nextInt();
			}
			System.out.println("_________________Stock Details_______________");
			for(ProductInput p:lis)
			{				
				System.out.println(p.getProduct_id()+" Name ="+p.getName()+" Prise"+p.amm);
				
				 total=total+p.amm;				
			}
			
			System.out.println("Your Final Amount is "+ total);
		}
	public static void main(String[] args) {

ProductOutput p1=new ProductOutput();
p1.stock();
	}

}
