import java.math.BigInteger;
import java.util.Scanner;


public class MobileDB {

	public BigInteger mobile_number;
	public String company;
	public String customer_id;
	public String customer_name;
	public String address;
	
	Scanner sc=new Scanner(System.in);
	
	
	void Add_number() throws UserDefinedException
	{		
		System.out.println("Enter the mobile number:\n");
		mobile_number=sc.nextBigInteger();
		BigInteger b1 = new BigInteger("999999999");
        BigInteger b2 = new BigInteger("10000000000");
		
     	int i1=mobile_number.compareTo(b1);
		int i2=mobile_number.compareTo(b2);
	
		if(i1>0&&i2<0)
		{
			System.out.println(mobile_number+"\n");
		}
		else
		{
		   throw new UserDefinedException();
		  
		}
	
		System.out.println("Enter the company name:\n");
		company=sc.next();
		System.out.println("Enter the customer id:\n");
		customer_id=sc.next();
		System.out.println("Enter the customer name:\n");
		customer_name=sc.next();
		System.out.println("Enter the customer address:\n");
		address=sc.next();	
    }
	
	void Display_mobilenumber_record()
	{
		System.out.println("\n"+"\n"+" Mobile number : "+mobile_number+"\n");
		System.out.println("Mobile operator : "+company+"\n");
		System.out.println("Customer ID : "+customer_id+"\n");
		System.out.println("Customer name : "+customer_name+"\n");
		System.out.println("Customer address : "+address+"\n");
	}
		
};
