package labTest;
import java.util.Scanner;
public class labTest1 {

	public static void main(String[] args) {
		
	 Scanner input = new Scanner(System.in);
		
		int number ,price , quantity;
		
		System.out.println("Enter the number of item :");
	     quantity = input.nextInt();
	     if (quantity==3) {
	    double quantity1,quantity2,quantity3,total_price;
	    double price1,price2,price3,discount,price_to_paid;
	      
		System.out.println("Enter the price of first item: Rm");
		 price1= input.nextInt();
		
		System.out.println("Enter the quantity of first item:");
		 quantity1 = input.nextInt();
		 System.out.println();
		 
		System.out.println("Enter the price of second item: Rm");
		 price2= input.nextInt();
		
		System.out.println("Enter the quantity of second item:");
		 quantity2 = input.nextInt();
		System.out.println();

		System.out.println("Enter the price of third item: Rm");
		 price3= input.nextInt();
		
		System.out.println("Enter the quantity of third item:");
		 quantity3 = input.nextInt();
		 System.out.println();
		 
		 total_price =(price1*quantity1)+(price2*quantity2)+(price3*quantity3);
		 if (total_price>100) {
			 discount = total_price*0.2;
		 }
		 
		 else {
			 discount=total_price*0.1;
		 }

	     }
	     }
	}


