package main;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		// We'll read a .CSV file of names, social security numbers, account
		// type and initial deposit and create Accounts for each row.
		List<String[]> newCustomers = utilities.CSV.read("NewBankAccounts.csv");
		for (String[] customer : newCustomers) {
			System.out.println("NEW ACCOUNT:");
			System.out.println(customer[0]);
			System.out.println(customer[1]);
			System.out.println(customer[2]);
			System.out.println(customer[3]);
			System.out.println();
		}
	}
}