package atm;

import java.util.Scanner;

public class AtmUI {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to ATM Machine");
		System.out.println("-------------------------------------------------");
		int atmNum = 123;
		int pin = 123;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ATM Number : ");
		int userNum = sc.nextInt();
		System.out.println("Enter a PIN Number : ");
		int userPin = sc.nextInt();
		
		AtmOperationImpl ope = new AtmOperationImpl();
		if(atmNum == userNum && pin == userPin) {
			while(true) {
			System.out.println(" 1.View Balance \n 2.Withdraw Amount \n 3.Deposite Amount\n 4.view History\n 5.Exit\n-------------------------------------------------");
			System.out.println("Enter a Choise : ");
			int ch = sc.nextInt();
			if(ch == 1) {
				ope.viewBalance();
				System.out.println();
			}
			else if(ch == 2) {
				System.out.println("Enter a Withdraw Amount : ");
				double withdrawAmount = sc.nextDouble();
				ope.withdrawAmount(withdrawAmount);
				System.out.println();
			}
			else if(ch == 3) {
				System.out.println("Enter a Deposite Amout :");
				double depositedAmout = sc.nextDouble();
				ope.depositAmount(depositedAmout);
				System.out.println();
			}
			else if(ch == 4) {
				ope.viewHistory();
				System.out.println();
			}
			else if (ch == 5) {
				 System.out.println("Exiting the program...");
	                break;
			}
			else {
				 System.out.println("Invalid choice! Please try again.");
			}
		}
		}
		else {
			System.out.println("incorrect ATM Number or pin");
		}
	}

}
