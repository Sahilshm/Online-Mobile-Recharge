
public class Controller {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Recharge r = new Recharge(0);
		MobileDB info= new MobileDB();
		System.out.println("Welcome to Recharge care centre:\n");
		try{
		info.Add_number();
		}
        catch(UserDefinedException e)
        {			
			System.out.println(e.toString());
			return ;
		}
		
		info.Display_mobilenumber_record();
		r.Recharge(0);
		r.Display_balance();
		r.Offer();
		System.out.println("Thank You! Come Again...");
	}

}
