import java.util.Scanner;


public class Recharge extends MobileDB {

	public int balance;
	public int recharge_amount;
	
	Scanner sc=new Scanner(System.in);
	
	Recharge(int ini_bal)
	{
		ini_bal=0;
	}
	
	public void Display_balance()
	{	
		if(balance==344)
		  {
		  System.out.println(balance+" received, includes UL local + Std for 28 days with 2Gb data.\n");
		  }
		  else if(balance==93)
		  {
		  System.out.println(balance+" received, includes 50 Hour local and std + 100 msg for 28 days.\n");
		  }
		  else if(balance==194)
		  {
		  System.out.println(balance+" received, includes 5GB 3G/4G data for 28 days.\n");
		  }	
		  else
		  {
		  System.out.println(balance+"received try other too with extra data and talktime.\n");
		  }
	}
	
	public void Recharge(int recharge_amount)
	{   int tax=5;
	    double vat=0.5;
		System.out.println("Enter the amount you want to recharge:\n");
		recharge_amount=sc.nextInt();
		balance+=recharge_amount-tax-vat;
		
	}
	
	void Offer()
	{
		System.out.println("Some offers with extra benefits:\n");
		System.out.println("UL local + Std at Rs.350");
		System.out.println("5GB data at Rs.200");
		System.out.println("10000sec + 100 free msg at Rs.99");
		System.out.println("Stay connected for more exiting offers.\n");
	}
	
	
};
