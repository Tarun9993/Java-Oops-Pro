package pizza_Hunt;

import java.util.Scanner;

public class Customer {
 
	
	public static void main(String[] args) {
		Pizza obj = new Pizza();
		OrderPlaced order = new OrderPlaced();
		int added = 0;
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO PIZZA HUT");
		System.out.println("WOULD YOU LIKE TO SEE THE MENU");
        String ans = sc.next();
        if(ans.equalsIgnoreCase("yes")) {
        	System.out.println("AVAILABLE PIZZA'S TODAY IN THE MENU");
           System.out.println(obj); //HERE WE ALSO DISPLAY IN STATIC WAY BY USING PRINT STATEMENT
           do {
        	   System.out.println("WOULD YOU LIKE TO PURCHASE ENTER THE NUMBER(1,2,3,4,5)");
        	   int num = sc.nextInt();
        	   if(num<1 || num >5) {
        		   System.out.println("Please Enter a Valid Numbe");
        		   continue;
        	   }
        	   if(num >=1 && num <= 5) {
        	   System.out.println("WOULD YOU LIKE TO PURCHASE");
        	   String reply = sc.next();
        	   if(reply.equalsIgnoreCase("yes")) {
        		   System.out.println("WOULD YOU LIKE TO ADD EXTRA CHEESE(RS.50/-)");
        		   String ans1 = sc.next();
        		   if(ans1.equalsIgnoreCase("yes")) {
        			   added = order.addCheese();
        		   }
        		   System.out.println("WOULD YOU LIKE TO ADD EXTRA TOPPINGS(RS.50/-)");
        		   String ans2 = sc.next();
        		   if(ans2.equalsIgnoreCase("yes")) {
        			   added = order.addToppings();
        		   }
        		   double total =  order.TotalAmount(num, added);
        		   System.out.println("Total Amount is : "+total);
        		   System.out.println("Enter Amount : ");
        		   double userAmount = sc.nextDouble();
        		   if (total == userAmount) {
        			    System.out.println("Successfully Purchased.. Have a Nice Day!");
        			} else if (total > userAmount) {
        			    boolean paymentCompleted = false;

        			    while (!paymentCompleted) {
        			        System.out.println("Insufficient Balance! The Total Amount is: " + total);
        			        System.out.println("Please enter the remaining amount :");
        			        userAmount += sc.nextDouble(); // Accumulate user input

        			        if (userAmount >= total) {
        			            double balance = userAmount - total;
        			            System.out.println("Successfully Purchased..");

        			            if (balance > 0) {
        			                System.out.println("Collect Your Remaining Balance Amount: " + balance);
        			            } else {
        			                System.out.println("Thank you! Have a Nice Day!");
        			            }

        			            paymentCompleted = true; // Exit the loop
        			        }
        			    }
        			} else { // Handle cases where total < userAmount (not really needed but for completeness)
        			    double balance = userAmount - total;
        			    System.out.println("Successfully Purchased..");
        			    System.out.println("Collect Your Remaining Balance Amount: " + balance);
        			}

        		   b=false;
        	   }
        	   else {
        		   System.out.println("WOULD YOU LIKE TO SEE THE MENU AGAIN");
        		   String again = sc.next();
        		   if(again.equalsIgnoreCase("yes")) {
        			   System.out.println(obj);
        		   }else {
        			   System.out.println("THANK YOU");
        			   b=false;
        		   }
        	   }
        	   }
           }while(b);
           
           
        }else {
        	System.out.println("THANK YOU VISIT US AGAIN");
        }
        sc.close();
	}

}
