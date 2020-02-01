package lealaitafea_p2;

import java.util.Scanner;

public class BMICalculator {

	private String unit;
	double bmi;
	double height;
	double weight;
	public void readUserData() 
	{
		readUnitType();
		readMeasurementData();
	}
	private void readUnitType()
	{		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter your unit of choice (Metric or Imperial): ");
		unit = input.nextLine();
		
		
	}
	private void readMeasurementData()
	{
		
		if(unit.equals("Metric"))
		{
			readMetricData();
		}
		else if (unit.equals("Imperial"))
		{
			readImperialData();
		}
		else if (unit != "Metric" || unit != "Imperial")
		{
			System.out.println("You have chosen an invalid option, please try again.");
			Scanner input = new Scanner(System.in); 
			System.out.println("Enter your system of choice (Metric or Imperial): ");
			unit = input.nextLine();
			readMeasurementData();
		}
			
		
	}
	private void readMetricData()
	{
		System.out.println("You have chosen Metric System");
	}
	private void readImperialData()
	{
		System.out.println("You have chosen Imperial System");
	}
	public void calculateBmi()
	{
		if(unit.equals("Metric"))
		{
			 bmi = weight / (height * height);
		}
		else if (unit.equals("Imperial"))
		{
			 bmi = 703 * (weight / (height * height));
		}
	}
	private void calculateBmiCategory()
	{
		if(bmi < 18.5)
		{
			System.out.println("You are Underweight");
		}
		else if(bmi >= 18.5 && bmi < 25)
		{
			System.out.println("You are Normal weight");
		}
		else if(bmi >= 25 && bmi <= 29.9)
		{
			System.out.println("You are Overweight");
		}
		else if(bmi >= 30)
		{
			System.out.println("You are Obese");
		}
	}
	public void displayBmi()
	{
		if(unit.equals("Metric"))
		{
			System.out.println("Your bmi is: "+ bmi +" kg/m2");
		}
		else if (unit.equals("Imperial"))
		{
			System.out.println("Your bmi is: "+ bmi +" lbs/in2");
		}
		calculateBmiCategory();				 	
	}
	public double getWeight()
	{
		setWeight(weight);
		return weight;
	}
	private void setWeight(double weight)
	{
		if(unit.equals("Metric"))
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your weight in kg: ");
			this.weight = weight = input.nextDouble();
		}
		else if (unit.equals("Imperial"))
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your weight in lbs: ");
			this.weight = weight = input.nextDouble();
		}
		if (weight<0)
		{
			System.out.println("Warning weight must be a positive integer - exiting");
			System.exit(1);
		}						
	}
	public double getHeight()
	{
		setHeight(height);
		return height;
		
	}
	private void setHeight(double height)
	{
		if(unit.equals("Metric"))
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your height in meters: ");
			this.height = height = input.nextDouble();
		}
		else if (unit.equals("Imperial"))
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your height in inches: ");
			this.height = height = input.nextDouble();
		}
		if (height<0)
		{
			System.out.println("Warning height must be a positive integer - exiting");
			System.exit(1);
		}
	}
	public double getBmi()
	{
		return bmi;
		
	}
	public void getBmiCategory()
	{
		
	}
	public static void main(String[] args) 
	{		
		BMICalculator access = new BMICalculator();
		access.readUserData();
		access.getWeight();
		access.getHeight();
		access.calculateBmi();
		access.displayBmi();
	}
}
