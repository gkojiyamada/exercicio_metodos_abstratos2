package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		double totalTax = 0;
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char op = sc.next().charAt(0);
			if(op == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double income = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double healthExpenditure = sc.nextDouble();
				list.add(new Individual(name, income, healthExpenditure));
			}
			else {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double income = sc.nextDouble();
				System.out.print("Number of employees: ");
				int numberEmployee = sc.nextInt();
				list.add(new Company(name, income, numberEmployee));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for(TaxPayer payer : list) {
			System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.tax()));
			totalTax += payer.tax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTax));
		
		sc.close();
	}

}
