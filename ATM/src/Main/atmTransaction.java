package Main;

import java.util.Scanner;

public class atmTransaction {
//	Creating password
	private static final int safePin = 1234;

	static Scanner scan = new Scanner(System.in);

//	Pin verification method
	public static boolean pin(int password) {

		Boolean flag = (safePin == password) ? true : false;

		return flag;

	}

//	balance method
	public static int balance(int total) {

		return total;

	}

//	deposit method
	public static int deposit(int Sum) {
		System.out.print("Enter the amount to deposit: ");
		int amount = scan.nextInt();

		int depoAmount = Sum + amount;
		System.out.println("Deposit successful, new Balance is: ");
		return depoAmount;
	}

//	withdrawal method
	public static int withdrawal(int sum) {
		System.out.print("Enter the amount to withdraw: ");
		int amount = scan.nextInt();

		int witAmount = sum - amount;
		System.out.println("withdrawal successful, new Balance is: ");
		return witAmount;
	}

//	Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 10000;

//		Variable to fetch command from user
		int command;
		System.out.println("Hello User, Enter Pin");
		int pass = scan.nextInt();

		if (pin(pass)) {
			do {
//				Welcome screen
				System.out.println("Please choose the below Commands for Transactions");
				System.out.println("Deposit-1, Withdrawal-2,Balance-3, Exit-4");

				command = scan.nextInt();

				if (command == 1) {
					sum = deposit(sum);
					System.out.println(sum);

				} else if (command == 2) {
					sum = withdrawal(sum);
					System.out.println(sum);

				} else if (command == 3) {
					System.out.println(balance(sum));

				} else if (command == 4) {
					System.out.println("Thank you, see you again");
					break;
				} else {
					System.out.println("Wrong command");
				}

			} while (command != 4);

		} else

		{
			System.out.println("Wrong pin try again later! ..");
		}

	}

}
