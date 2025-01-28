package atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperationImpl implements AtmOperationInterf {
   
	Atm atm = new Atm();
	Map<Double,String> map=new HashMap<>();
	
	
	@Override
	public void viewBalance() {
		System.out.println("Available Balance is: " +atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount <= atm.getBalance()) {
			map.put(withdrawAmount, "Amount Withdraw");
			System.out.println(withdrawAmount + " Withdraw Succesfully!");
			atm.setBalance(atm.getBalance()-withdrawAmount);
		}
		else {
			System.out.println("Insufficient Balance!");
		}
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		map.put(depositAmount, "Amount Deposited");
		System.out.println(depositAmount + " Deposited Succesfully!");
		atm.setBalance(atm.getBalance()+depositAmount);
	}

	@Override
	public void viewHistory() {
		Set<Double> set = map.keySet();
		for(Double d : set) {
			System.out.println(d+"="+map.get(d));
		}
		
	}
	
	
}
